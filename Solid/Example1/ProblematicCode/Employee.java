package Solid.Example1.ProblematicCode;

public class Employee {
    
    private int id; //Employee ID
    private String name; //Employee Name
    private String address; //Employee Address

    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){
        //code to print performance report
        System.out.println("Performance report of employee: "+ name);
    }

    public double computeSalary(){
        //code to compute salary
        return 1000.0;
    }

    public void updateEmployeeData(){
        //code to update employee data
        System.out.println();
    }

    public void fetchEmployeeData(){
        //code to fetch employee data
        System.out.println("Employee data fetched successfully");
    }
}


//Problem-- this class trying to do too many things