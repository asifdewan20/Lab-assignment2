import java.util.Scanner;
public class Asif_loop_2 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\n");
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%3==0 && i%6==0 && i!=30 && i!=60 && i!=90)
            {
                System.out.print(+i+" ");
            }
        }
        System.out.print("\n");
    }

}
