import java.util.Scanner;
public class Asif_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you obtain mark = ");
        int n= input.nextInt();
        System.out.print("Mark Grade GPA Remarks");
        System.out.print("\n");
        if(n>=80){
            System.out.print(+n+" A+ 4.00 Outstanding");
        }
        else if(75<=n && n<80){
            System.out.print(+n+" A 3.75 Excellent");
        }
        else if(70<=n && n<75){
            System.out.print(+n+" A- 3.50 Very Good");
        }
        else if(65<=n && n<70){
            System.out.print(+n+" B+ 3.25 Good");
        }
        else if(60<=n && n<65){
            System.out.print(+n+" B 3.00 Satisfactory");
        }
        else if(55<=n && n<60){
            System.out.print(+n+" B- 2.75 Above Average");
        }
        else if(50<=n && n<55){
            System.out.print(+n+" C+ 2.50 Average");
        }
        else if(45<=n && n<50){
            System.out.print(+n+" c 2.25 Below Average");
        }
        else if(40<=n && n<45){
            System.out.print(+n+" D 2.00 Pass");
        }
        else if(n<40){
            System.out.print(+n+" F 0.00 Fail");
        }
    }
}

