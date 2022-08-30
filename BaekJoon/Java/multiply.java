import java.util.Scanner;
public class multiply {
    public static void main (String args[]){
        Scanner t = new Scanner(System.in);
        int a = t.nextInt();
        int b = t.nextInt();
        int one;
        int res = a*b;
        
        while(b!=0){
            one = a*(b%10);
            b/=10;
            System.out.println(one);
        }
        System.out.println(res);
        t.close();
    }
}
