import java.util.Scanner;
public class Asif_5 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A = ");
        int A = input.nextInt();
        System.out.print("Enter B = ");
        int B = input.nextInt();
        System.out.print("Enter C = ");
        int C = input.nextInt();
        if(A>B && A>C){
            System.out.println("Maximum Value = "+A);
        }
        else if(B>A && B>C){
            System.out.println("Maximum Value = "+B);
        }
        else if(C>A && C>B){
            System.out.println("Maximum Value = "+C);
        }
    }
}
