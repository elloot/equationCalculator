/**
 * A program that calculates mathematical equations
 * 2019-10-24
 * Author: Elliot Duchek
 */

import java.util.Scanner;
public class equationCalculator {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int equationGrade;
        double a;
        double b;
        double c;
        double x;
        double x1;
        double x2;
        String stop;

        while (true) {

            System.out.println("Of what grade is the equation you would like solved? ");
            equationGrade = kb.nextInt();
            switch(equationGrade) {
                case 0:
                    System.out.println("What is the value of a if your equation is written as a = a ? ");
                    a = kb.nextDouble();
                    System.out.println("The solution to your equation is a = " + a);
                    break;
                case 1:
                    System.out.println("What is the value of a if your equation is written as ax + b = 0 ? ");
                    a = kb.nextDouble();
                    System.out.println("And what is the value of b? ");
                    b = kb.nextDouble();
                    x = -b / a;

                    System.out.println("The solution to your equation is x = " + x);
                    break;
                case 2:
                    System.out.println("What is the value of a if your equation is written as ax\u00B2 + bx + c = 0 ? ");
                    a = kb.nextDouble();
                    System.out.println("And what is the value of b? ");
                    b = kb.nextDouble();
                    System.out.println("And finally what is the value of c? ");
                    c = kb.nextDouble();

                    x1 = (-b / (2 * a)) + Math.sqrt(Math.pow((b / (2 * a)), 2) - (c / a));
                    x2 = (-b / (2 * a)) - Math.sqrt(Math.pow((b / (2 * a)), 2) - (c / a));

                    if ((Math.pow((b / (2 * a)), 2) - (c / a)) == 0) {
                        System.out.println("The solution to your equation is x = " + x1);

                    }
                    else {
                        System.out.println("The solution to your equation is x\u2081 = " + x1 + " and x\u2082 = " + x2);
                    }
                    break;

            }

            System.out.println("\nWould you like to continue? (Yes/no)");
            kb.nextLine();
            stop = kb.nextLine();

            if (stop.equalsIgnoreCase("no")) {
                System.out.println("Exiting program");
                break;
            }
        }


    }
}
