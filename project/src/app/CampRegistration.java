package app;

/**
 * CampRegistration
 */
public class CampRegistration {

    private String location,nameOfcamp,headOfCamp,date;
    private int expColl;
    private long phoneno;
    private static String tablename="newcamp";

    public CampRegistration() {
    }

    public CampRegistration(String tablename, String location, String nameOfcamp, String headOfCamp, String date, long phoneno, int expColl) {
        this.location = location;
        this.nameOfcamp = nameOfcamp;
        this.headOfCamp = headOfCamp;
        this.date = date;
        this.phoneno = phoneno;
        this.expColl = expColl;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNameOfcamp() {
        return this.nameOfcamp;
    }

    public void setNameOfcamp(String nameOfcamp) {
        this.nameOfcamp = nameOfcamp;
    }

    public String getHeadOfCamp() {
        return this.headOfCamp;
    }

    public void setHeadOfCamp(String headOfCamp) {
        this.headOfCamp = headOfCamp;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public long getPhoneno() {
        return this.phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    public int getExpColl() {
        return this.expColl;
    }

    public void setExpColl(int expColl) {
        this.expColl = expColl;
    }

    public CampRegistration location(String location) {
        this.location = location;
        return this;
    }

    public CampRegistration nameOfcamp(String nameOfcamp) {
        this.nameOfcamp = nameOfcamp;
        return this;
    }

    public CampRegistration headOfCamp(String headOfCamp) {
        this.headOfCamp = headOfCamp;
        return this;
    }

    public CampRegistration date(String date) {
        this.date = date;
        return this;
    }

    public CampRegistration phoneno(long phoneno2) {
        this.phoneno = phoneno2;
        return this;
    }

    public CampRegistration expColl(int expColl) {
        this.expColl = expColl;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " location='" + getLocation() + "'" +
            ", nameOfcamp='" + getNameOfcamp() + "'" +
            ", headOfCamp='" + getHeadOfCamp() + "'" +
            ", date='" + getDate() + "'" +
            ", phoneno='" + getPhoneno() + "'" +
            ", expColl='" + getExpColl() + "'" +
            "}";
    }
    public  void registerCamp(){
        DbConnection db=new DbConnection();
        db.newCamp(tablename, location, nameOfcamp, headOfCamp, date, phoneno, expColl);
    }

}
