package Vehicle;

public class Vehicleshow {
int vno;
String name;
String vtype;
int year;

public Vehicleshow()
{
	
}
public Vehicleshow(int vno,String name,String vtype,int year)
{
	this.vno=vno;
	this.name=name;
	this.vtype=vtype;
	this.year=year;
	}
public int getVno() {
	return vno;
}
public void setVno(int vno) {
	this.vno = vno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getVtype() {
	return vtype;
}
public void setVtype(String vtype) {
	this.vtype = vtype;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
@Override
public String toString() {
	return "Vehicleshow [vno=" + vno + ", name=" + name + ", vtype=" + vtype + ", year=" + year + "]";
}
}


