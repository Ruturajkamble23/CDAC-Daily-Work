package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javam {
    public String name;
    public int id;
    public int salary;
    public String loc;

    public Javam(String name, int id , int salary ,String loc){
        this.id = id;
        this.name =name;
        this.salary=salary;
        this.loc=loc;

    }

    @Override
    public String toString(){
        return  "EmpId:"+this.id+" Name:"+this.name+" salary:"+this.salary+" loc:"+this.loc+"";
    }


    public class Main {
        public static List<Javam> employees = new ArrayList<>();
        static Scanner sc = new Scanner(System.in);
                public static void main(String[] args) throws Throwable {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee", "root", "rutu");
            public  Addemp(){
                int id = sc.nextInt();
                String name = sc.nextLine();
                int salary = sc.nextInt();
                String loc= sc.nextLine();
                Javam emp = new Javam(name, id, salary, loc);
                employees.add(emp);
            }

        }
    }
}



 