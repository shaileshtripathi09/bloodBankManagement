package app;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.*;
import com.twilio.type.PhoneNumber;

/**
 * Reciepient
 */
public class Reciepient {
    private String rname,rblood_group,rlocality;
	private int quantity,U_no;
    private long contact;
    private String today,nextdate;
    private static String tablename="newreciepient";
    public static final String ACCOUNT_SID = "AC6d615cfe5ebc83010593c2b78f5dac07";
    public static final String AUTH_TOKEN = "534731844a8e6a237e027b540d99d985";

    public Reciepient() {
    }

    public Reciepient(String rname, String rblood_group, String rlocality, int quantity, int U_no, long contact) {
        this.rname = rname;
        this.rblood_group = rblood_group;
        this.rlocality = rlocality;
        this.quantity = quantity;
        this.U_no = U_no;
        this.contact = contact;
    }
    public void setToday(String today){
        this.today=today;
    }
    public void setnextDate(String nextdate){
        this.nextdate=nextdate;
    }

    public String getRname() {
        return this.rname;
    }

    public void setRname(String rname) {
        this.rname = rname;
    }

    public String getRblood_group() {
        return this.rblood_group;
    }

    public void setRblood_group(String rblood_group) {
        this.rblood_group = rblood_group;
    }

    public String getRlocality() {
        return this.rlocality;
    }

    public void setRlocality(String rlocality) {
        this.rlocality = rlocality;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getU_no() {
        return this.U_no;
    }

    public void setU_no(int U_no) {
        this.U_no = U_no;
    }

    public long getContact() {
        return this.contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public Reciepient rname(String rname) {
        this.rname = rname;
        return this;
    }

    public Reciepient rblood_group(String rblood_group) {
        this.rblood_group = rblood_group;
        return this;
    }

    public Reciepient rlocality(String rlocality) {
        this.rlocality = rlocality;
        return this;
    }

    public Reciepient quantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public Reciepient U_no(int U_no) {
        this.U_no = U_no;
        return this;
    }

    public Reciepient contact(long contact) {
        this.contact = contact;
        return this;
    }

   

    

    @Override
    public String toString() {
        return "{" +
            " rname='" + getRname() + "'" +
            ", rblood_group='" + getRblood_group() + "'" +
            ", rlocality='" + getRlocality() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", U_no='" + getU_no() + "'" +
            ", contact='" + getContact() + "'" +
            "}";
    }
    public void regularUpdate(String msg){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(new PhoneNumber("+91"+this.contact),
        new PhoneNumber("+13346030157"), msg 
        ).create();

    }
    public void newrecipient(){
        DbConnection db=new DbConnection();
        db.newRecipient(tablename, rblood_group, rlocality, quantity, rname, contact,today,nextdate);

    }
    

}