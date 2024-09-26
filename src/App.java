import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in); 
        System.out.println("Enter \"-1\" to stop running the code");
        String measurement1 = "";
        String measurement2 = "";
        double number1 = 0;
        double number2 = 0;
        while(1==1)
        {
            
            System.out.println("Enter the Measurement you want to convert: ");
            measurement1 = scan.nextLine();
            if(measurement1.equals("-1"))
            {
                break;
            }
            System.out.println("Enter the measurement you want to be converted to: ");
            measurement2 = scan.nextLine();
            if(measurement2.equals("-1"))
            {
                break;
            }
            System.out.println("Enter the number of the measurement you have: ");
            number1 = scan.nextFloat();
            scan.nextLine();
            if(number1 == -1)
            {
                break;
            }
            
            if(measurement1.equals("ft"))
            {
                if(measurement2.equals("mi"))
                {
                    number2 = number1 / 5280;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("km"))
                {
                    number2 = number1 / 32800.84;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("cm"))
                {
                    number2 = number1 * 30.48;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else{
                    System.out.println("This program cannot convert that variable type!");
                }
            }
            else if(measurement1.equals("mi"))
            {
                if(measurement2.equals("ft"))
                {
                    number2 = number1 * 5280;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("km"))
                {
                    number2 = number1 * 1.60934;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("cm"))
                {
                    number2 = number1 * 160934;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else{
                    System.out.println("This program cannot convert that variable type!");
                }
            }
            else if(measurement1.equals("km"))
            {
                if(measurement2.equals("cm"))
                {
                    number2 = number1 *100000;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("ft"))
                {
                    number2 = number1 *3280.84;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("mi"))
                {
                    number2 = number1 / 1.60934;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else{
                    System.out.println("This program cannot convert that variable type!");
                }
            }
            else if(measurement1.equals("cm"))
            {
                if(measurement2.equals("ft"))
                {
                    number2 = number1 / 30.48;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("mi"))
                {
                    number2 = number1 / 160394;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else if(measurement2.equals("km"))
                {
                    number2 = number1 / 100000;
                    System.out.println(number1 + " " + measurement1 + " in " + measurement2 + " is " + number2 + " " + measurement2);
                }
                else{
                    System.out.println("This program cannot convert that variable type!");
                }
            }
            else
            {
                System.out.println("This program cannot convert that variable type!");
            }
            
        } 
    }
}
