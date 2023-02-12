package com.company;
public class Employee {
    int id;
    String name;
    int salary;
    Employee(){
        System.out.println("Invalid Employee");
    }
    Employee(String n,int i,int s){
        name=n;
        id=i;
        salary=s;
    }

    public static void main(String[] args) {
        Employee a1= new Employee();
        System.out.println("-------------------");
        Employee a2 = new Employee("saksham",30,220000);
        System.out.println("Name of Employee = "+a2.name);
        System.out.println("Id of Empolyee = "+a2.id);
        System.out.println("Salary of employee= "+a2.salary);
    }
}
