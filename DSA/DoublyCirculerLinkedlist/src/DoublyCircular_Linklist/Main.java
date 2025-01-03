package DoublyCircular_Linklist;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DoublyCircular obj = new DoublyCircular();
        Scanner in = new Scanner(System.in);
        int ch, e;
        obj.create_List();//creating LinkedList
        do {
            System.out.println("\n1.Insert Right\n2.Insert Left\n3.Delete Left:\n4.Delete right\n5.Print \n0.Exit :");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    obj.insert_left(e);
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
