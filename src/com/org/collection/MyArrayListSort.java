package com.org.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> lst=new ArrayList<Employee>();
	lst.add(new Employee("papu", 2000));
	lst.add(new Employee("sipu", 1000));
	lst.add(new Employee("santu", 5000));
	lst.add(new Employee("ram", 4000));
	lst.add(new Employee("hari", 3000));
    System.out.println("Before Sorting: ");
    for (Employee employee : lst) {
		System.out.println(employee.getName()+" : "+employee.getSalary());
	}
    System.out.println("-----------------------------------------------------------------------");
    System.out.println("After Sorting: ");
    Collections.sort(lst,new NameComp());
    for (Employee employee : lst) {
		System.out.println(employee.getName()+" : "+employee.getSalary());
	}
    
    
		
	}

}
class SalaryComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getSalary()>o2.getSalary()){
			return 1;
		}
		else{
			return -1;
		}
	}
	
}

class NameComp implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (o1.getName().compareTo(o2.getName()));
		// TODO Auto-generated method stub
		
	
	}
	
}




class Employee{
	private String name;
    private int salary;
    
    
    
	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}