import java.util.Scanner;
public class Asif_7 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Test Case = ");
        int tCase=Sc.nextInt();
        char ch;
        for(int i=0; i<tCase; i++)
        {
            ch=Sc.next().charAt(0);
            if(ch>='0' && ch<='9')
                System.out.println(ch+" is a Digit");
            else if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z'))
            {
                System.out.print(ch+" is an Alphabet : ");
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    System.out.println("It is Vowel");
                else System.out.println("It is Consonant");
            }
            else System.out.println(ch+" is a Special Character");
        }
    }
}
