package com.Practice;

//final keyword
 public  class Employee {
    int empId;
    String name;
    final String company="google";

   /* public Employee(String company) {
        this.company = company;
    }
*/
    public void getEmployeeDetails() {
        System.out.println("employeeid " + empId);
        System.out.println("name " + name);
        System.out.println("company " + company);
    }
public  void greet(){
    System.out.println("hello,Employee");
}

   /* public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.empId = 1;
        e1.name = "Hira";
      e1.getEmployeeDetails();


    }*/
}