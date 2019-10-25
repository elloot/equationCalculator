/**
 * A pgrogram that solves fourth degree polynomials
 * 2019-10-25
 * Author: Elliot Duchek
 */
import java.util.*;
public class fourthDegreePolynomial {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        double a, b, c, d, e, x, xTemp;

        System.out.println("If your equation is written as ax\u2074 + bx\u00B3 + cx\u00B2 + dx + e, input");
        System.out.println("a: ");
        a = kb.nextDouble();
        System.out.println("b: ");
        b = kb.nextDouble();
        System.out.println("c: ");
        c = kb.nextDouble();
        System.out.println("d: ");
        d = kb.nextDouble();
        System.out.println("e: ");
        e = kb.nextDouble();
        kb.nextLine();

        System.out.println("Guess the value of your equation");
        xTemp = kb.nextDouble();

        double count = 0;

        while (count < 10) {
            x = xTemp - ((a*Math.pow(xTemp, 4) + b*Math.pow(xTemp, 3) + c*Math.pow(xTemp, 2) + d*xTemp + e)/(4*a*Math.pow(xTemp, 3) + 3*b*Math.pow(xTemp, 2) + 2*c*xTemp + d));
            xTemp = x - ((a*Math.pow(x, 4) + b*Math.pow(x, 3) + c*Math.pow(x, 2) + d*x + e)/(4*a*Math.pow(x, 3) + 3*b*Math.pow(x, 2) + 2*c*x + d));
            count += 0.000001;
        }

        System.out.println(xTemp);
    }
}
