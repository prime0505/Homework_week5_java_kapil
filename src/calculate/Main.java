package calculate;

import java.util.Scanner;

public class Main extends Calculator
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        while (true)
        {
            System.out.println("Please enter the first number : ");
            int x=sc.nextInt();
            System.out.println("Please enter the second number : ");
            int y= sc.nextInt();
            System.out.println("Please select the operator (+,_,*,/) : ");
            char chr = sc.next().charAt(0);
            Calculator c1 =new Calculator();
            try
            {
                c1.calculateResult(x,y,chr);
            }
            catch (Exception e)
            {
                System.out.println("Invalid operation");
            }
            System.out.println("Would you like to do more calculation \n" + " Please enter Y or N ");
            char ans = sc.next().charAt(0);
            if (ans == 'n')
            {
                break;
            }
        }
        sc.close();

        }

    }

