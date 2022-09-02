 import java.util.Scanner;
public class Asif_4 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first integer ");
        int A = input.nextInt();
        System.out.println("Enter the second integer ");
        int B = input.nextInt();
        System.out.println("Enter the third integer ");
        int C = input.nextInt();
        System.out.println("Enter the fourth integer ");
        int D = input.nextInt();
        int sol1= (A*B - C*D);
        int sol2= (2*A)-B+(3*D);
        int sol3=(A*A)+(B*B)-(C*C)+(D*D);
        int sol4=(A*A*A)+B-(C*C);
        System.out.println("Solution of Equation-1 = "+sol1);
        System.out.println("Solution of Equation-2 = "+sol2);
        System.out.println("Solution of Equation-3 = "+sol3);
        System.out.println("Solution of Equation-4 = "+sol4);
    }
}
