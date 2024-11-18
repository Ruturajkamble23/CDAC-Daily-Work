package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("********** MET IIT DAC STUDENTS **********");
        while(true) {
            System.out.println("1--> ADD NEW STUDENT");
            System.out.println("2--> DISPLAY ALL STUDENTS");
            System.out.println("3--> REMOVE STUDENT");
            System.out.println("4--> EXIT");
            
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("ENTER ROLL NO");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.println("ENTER NAME");
                    String name = sc.nextLine();
                    System.out.println("ENTER DIVISION");
                    String div = sc.nextLine();
                    System.out.println("ENTER FEES");
                    double fees = sc.nextDouble();
                    System.out.println("ENTER Key");
                    int key = sc.nextInt();
                    System.out.println("Student Add Successfully");
                    sc.nextLine();

                    students.add(new Student( roll, name, div, fees,key));
                    break;

                case 2:
                    System.out.println("********** LIST OF STUDENTS **********");
                    if (students.isEmpty()) {
                        System.out.println("----------LIST IS EMPTY ADD STUDENTS----------");
                    } else {
                        for (Student std : students) {
                            System.out.println(std);
                        }
                    }
                    break;
                case 3:
                
                     System.out.println("REMOVE STUDENT");
                     System.out.println("Enter Key to Remove Record");
                    // int index = sc.nextInt();
                    // students.remove(index);
                    // System.out.println("SELECTED RECORD REMOVED");
                    // break;
                    int skey = sc.nextInt();                    
                    students.removeIf(std -> std.key==skey); // Using lambda exp..
                    System.out.println("Record Remove successfully ");
                    break;
        
                case 4:
                    System.out.println("EXIT");
                    sc.close();
                    System.exit(0);
                    default:
                     System.out.println("SELECT VALID CHOICE");
                     }
                    
                    
                }
            }
                    
                        
    }

