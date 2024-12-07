package Calculate;
import java.util.Scanner;

public class TimeCom {
    public double Quadratic(double seconds,double inputs,double inputs2){
       return ((inputs2 * inputs2) * seconds) /(inputs*inputs);
    }

    public double Cubic(double seconds,double inputs,double inputs2){
        return ((inputs2 * inputs2*inputs2) * seconds) /(inputs*inputs*inputs);
    }

    public double LogBasedSeparate(double seconds,double inputs, double input1) {
         double logInput = Math.log10(inputs);
         double logInputs1 = Math.log10(input1);
         double result = (logInputs1/logInput) * seconds;
        return Double.parseDouble(String.format("%.3f", result));
    }

    public double Linear(double seconds,double inputs,double inputs2){
        return (inputs2 * seconds)/inputs;
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TimeCom  t  =new TimeCom();
        int ch;
        do {
        System.out.println("1--> Quadratic");
        System.out.println("2--> Cubic");
        System.out.println("3--> Log based");
        System.out.println("4--> Linear based");
        System.out.println("5--> Exit");

            ch = sc.nextInt();
            switch (ch) {

                case 1:
                    System.out.println("Enter Seconds ,Input ,Increased Input");
                    double seconds = sc.nextDouble();
                    double inputs = sc.nextDouble();
                    double inputs2 = sc.nextDouble();
                    System.out.println("==========================================================================");
                    System.out.println("Time Complexity is --> " + t.Quadratic(seconds, inputs, inputs2) + "  sec");
                    System.out.println("==========================================================================");

                    break;
                case 2:
                    System.out.println("Enter Second Input Increased Input");
                    seconds = sc.nextDouble();
                    inputs = sc.nextDouble();
                    inputs2 = sc.nextDouble();
                    System.out.println("==========================================================================");
                    System.out.println("Time Complexity is --> " + t.Cubic(seconds, inputs, inputs2) + " sec");
                    System.out.println("==========================================================================");
                    break;

                case 3:
                    System.out.println("Enter Seconds Input Increased Input");
                    seconds=sc.nextDouble();
                    inputs = sc.nextDouble();
                    inputs2 = sc.nextDouble();
                    System.out.println("==========================================================================");
                    System.out.println("Time Complexity is --> " + (t.LogBasedSeparate(seconds,inputs, inputs2)) + " sec");
                    System.out.println("==========================================================================");
                    break;
                case 4:
                    System.out.println("Enter Seconds Input Increased Input");
                    seconds = sc.nextDouble();
                    inputs = sc.nextDouble();
                    inputs2 = sc.nextDouble();
                    System.out.println("==========================================================================");
                    System.out.println("Time Complexity is --> " + t.Linear(seconds, inputs, inputs2) + " sec");
                    System.out.println("==========================================================================");
                    break;
                case 5:
                    System.out.println("Exit Tata By By...\n Developed by Ruturaj");
                    break;
                default:
                    System.out.println("Select Valid option ");
                    break;

            }
        }while (ch != 5);

    }
}
