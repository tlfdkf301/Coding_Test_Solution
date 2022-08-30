import java.util.Scanner;
public class rest{
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int A = t.nextInt();
        int B = t.nextInt();
        int C = t.nextInt();
        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
        t.close();
    }
}