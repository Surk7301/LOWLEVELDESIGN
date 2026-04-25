package Solid.Example1_SRP.ProblematicCode;

public class Employee {
    
    private int id; //Employee ID
    private String name; //Employee Name
    private String address; //Employee Address

    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){ // if the report format changes we might need to update this function
        //code to print performance report
        System.out.println("Performance report of employee: "+ name);
    }

    public double computeSalary(){  // issue -- If the taxation changes we might need to update this function
        //code to compute salary
        return 1000.0;
    }

    public void updateEmployeeData(){ // if data base requirements change we need to change this function
        //code to update employee data
        System.out.println();
    }

    public void fetchEmployeeData(){
        //code to fetch employee data
        System.out.println("Employee data fetched successfully");
    }
}


//Problem-- this class trying to do too many things, there are too many reason to update the code preent in the class. Tis violates SRP.

//SRP states that,there should one and only one reason to change the piece of code