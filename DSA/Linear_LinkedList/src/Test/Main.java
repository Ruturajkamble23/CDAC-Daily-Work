package Test;

import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Linear_Linked_List obj = new Linear_Linked_List();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_List();//creating LinkedList
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n6.Search\n7.Delete\n8.Insert After\n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    obj.delete_left();
                    break;

                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;
                case 6:
                    System.out.println("eneter element");
                    int key =in.nextInt();
                    System.out.println(obj.search(key));
                    break;
                case 7:
                    System.out.println("enter to delete");
                    int key1 = in.nextInt();
                    obj.delete_element(key1);
                case 8:
                    System.out.println("enter to insert  after ");
                    int ref = in.nextInt();
                    System.out.println("enter u want");
                    int data =in.nextInt();
                    obj.insert_after(ref,data );
                    break;
                case 0:
                    System.out.println("Exiting....");
                    break;

                default:
                    System.out.println("Wrong option selected");
                    break;
            }

        } while (ch != 0);
    }
}
