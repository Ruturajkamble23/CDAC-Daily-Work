package Test;

import java.util.Scanner;
import java.util.Stack;

public class Main {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            Dynamic_stack ds = new Dynamic_stack();
            System.out.println("Enter size of stack:");
            int choice;

            int size=in.nextInt();
            ds.create_Stack();
            do
            {
                System.out.print("\nStack Menu");
                System.out.print("\n-----------");
                System.out.print("\n1.Push");
                System.out.print("\n2.Pop");
                System.out.print("\n3.Peek");
                System.out.print("\n4.Print Stack");
                System.out.print("\n0.Exit");
                System.out.print("\nchoice:");
                choice=in.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("entr data");
                        int data = in.nextInt();
                        ds.push(data);

                        break;
                    case 2:
                        ds.peek();
                        break;
                    case 3:
                    ds.pop();
                        break;
                    case 4:
                    ds.print();
                        break;
                    case 0:
                        System.out.print("\nExiting code...bye");
                        break;
                    default:
                        System.out.print("\nWrong option selected..");
                        break;
                }

            }while(choice!=0);
            in.close();
        }




    }



