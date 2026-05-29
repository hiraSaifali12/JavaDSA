package com.Practice;

//final keyword
public class DemoEmployee {
    int empId;
    String name;
  final String company="google";
  /*public  DemoEmployee(String company){
      this.company=company;
    }*/
    public  void  getEmployeDetails(){
        System.out.println(" EmployeeId = "+empId);
        System.out.println("EmployeeName = "+name);
        System.out.println("company = "+company);
    }
   public static void main(String[] args) {
       DemoEmployee de=new DemoEmployee();
       de.empId=1;
       de.name="hira";
     //  de.company="Amazone";
       de.getEmployeDetails();
       DemoEmployee de2=new DemoEmployee();
       de2.empId=2;
       de2.name="Shaifali";
       de2.getEmployeDetails();
   }
}
