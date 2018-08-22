package ZensorPractise;

public class DayBook {
private	String date;
private String name;
private	int acno;
private String transType;
private String description;
private double amount;
public DayBook(String date,int acno,String name, String transType, String description, double amount) {
	this.date = date;
	this.name=name;
	this.acno = acno;
	this.transType = transType;
	this.description = description;
	this.amount = amount;
}
public String getName()

{
	return name;
}
public void setName(String name)
{
	this.name=name;

}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getAcno() {
	return acno;
}
public void setAcno(int acno) {
	this.acno = acno;
}
public String getTransType() {
	return transType;
}
public void setTransType(String transType) {
	this.transType = transType;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}


}
