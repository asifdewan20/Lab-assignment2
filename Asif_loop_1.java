 import java.util.Scanner;
public class Asif_loop_1 {
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Input number= ");
            int n = input.nextInt();
            int i;
            for(i=1;i<=10;i++)
            {
                System.out.println(+n+" X "+i+" = "+(n*i));
            }
        }
}
