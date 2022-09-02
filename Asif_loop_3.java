import java.util.Scanner;
public class Asif_loop_3 {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.print("Test case= ");
        int t= input.nextInt();
        int n;
        for(int i=1 ; i<=t; i++)
        {
            n = input.nextInt();
            int count=0;
            for(int j = 2;j<n;j++) {
                if (n % j == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0)
            {
                System.out.println(n + " is a prime number");
            }
            else {
                System.out.println(n + " is not a prime number");
            }
        }
    }
}
