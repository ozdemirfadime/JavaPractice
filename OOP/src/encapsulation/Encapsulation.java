package encapsulation;


public class Encapsulation {
private String name;
private String idNum;
private int age;
private String adress="cleavad";

public  Encapsulation(String  id) {
	this.idNum = id;
}
//getter and setter method

public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getIdNum() {
	return idNum;
}
public void setIdNum(String idNum) {
	this.idNum = idNum;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
