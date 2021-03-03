package app;

/**
 * Donar
 */
public class Donar {

private String name,disease,b_g;
private int age;
private double weight;
private long contactde;
private static String tablename="newdonar";
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDisease() {
	return disease;
}
public void setDisease(String disease) {
	this.disease = disease;
}
public String getB_g() {
	return b_g;
}
public void setB_g(String b_g) {
	this.b_g = b_g;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public long getContactde() {
	return contactde;
}
public void setContactde(long contactde) {
	this.contactde = contactde;
}
public void newDonar(){
DbConnection db=new DbConnection();
db.newDonar(tablename,  name, age, weight, contactde, disease, b_g);

}

}