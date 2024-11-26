package DoublyLInkList;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        DubleLink dl=new DubleLink();
        Scanner in = new Scanner(System.in);
        int ch, e;
        dl.create_List();//creating LinkedList
        do {
            System.out.print("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print");
            System.out.print("\n6.Print reverse :");
            System.out.print("\n0.Exit :");
            System.out.print("\nChoice:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    dl.insert_left(e);
                    System.out.println("Element Inserted");
                    break;

                case 2:
                    System.out.println("Enter element:");
                    e = in.nextInt();
                    dl.insert_right(e);
                    System.out.println("Element Inserted");
                    break;

                case 3:
                    dl.delete_left();
                    break;

                case 4:
                    dl.delete_right();
                    break;
                case 5:
                    dl.print_list();
                    break;
                case 6:
                    dl.print_list_rev();
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
