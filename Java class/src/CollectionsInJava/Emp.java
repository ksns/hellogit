package CollectionsInJava;

public class Emp {
	private String name;
	private int salary;
	public Emp(String string, int i) {
		name = string;
		salary = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString(){
		return "Name"+this.name+"Salary"+this.salary;
	}
}
