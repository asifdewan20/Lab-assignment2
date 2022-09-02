import java.util.Scanner;
public class Asif_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius = ");
        float a = input.nextFloat();
        double A = Math.PI*a*a;
        System.out.println("Area = "+A);
    }
}
