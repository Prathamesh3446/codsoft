package Codsoft_Intern;
import java.util.Scanner;
public class CurrencyConverter {

    public static void main(String[] args)
    {
        int choice;
        double amount;

        System.out.println(" 1) Ruppe ");
        System.out.println(" 2) Dollar ");
        System.out.println(" 3) Euro ");
        Scanner sc = new Scanner(System.in);
        System. out.println("You want to Choose the currency: ");
        choice = sc.nextInt();
        System.out.println("Enter the amount you want to convert: ");
        amount = sc.nextDouble();

        switch (choice)
        {
            case 1:
                RuppeToOther(amount);
                break;
            case 2:
                DollarToOther(amount);
                break;
            case 3:
                EuroToOther(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void RuppeToOther(double amounts)
    {
        System.out.println("1 Ruppe = " + 0.012 + " Dollar");
        System.out.println();

        System.out.println(amounts+" Ruppe = " + (amounts*0.012) + " Dollar");
        System.out.println();

        System.out.println("1 Ruppe = " + 0.011 + " Euro");
        System.out.println();
        System.out.println(amounts+" Ruppe = " + (amounts*0.011) + " Euro");
        System.out.println();

    }


    public static void DollarToOther(double amounts)
    {
        System.out.println("1 Dollar = " + 82.94 + " Ruppe");
        System.out.println();
        System.out.println(amounts+" Dollar = " + (amounts*82.94) + " Ruppe");
        System.out.println();

        System.out.println("1 Dollar= " + 0.94 + " Euro");
        System.out.println();

        System.out.println(amounts+" Dollar = " + (amounts*0.94) + " Euro");
    }



    public static void EuroToOther(double amounts)
    {
        System.out.println("1 Euro = " + 88.47 + " Ruppe");
        System.out.println();
        System.out.println(amounts+" Euro = " + (amounts*88.47) + " Ruppe");
        System.out.println();

        System.out.println("1 Euro = " + 1.07 + " Dollar");
        System.out.println();

        System.out.println(amounts+" Euro = " + (amounts*1.07) + " Dollar");
    }
}

