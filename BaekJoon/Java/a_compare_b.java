import java.util.Scanner;
public class a_compare_b{
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int A = t.nextInt();
        int B = t.nextInt();
        if (A>B){
            System.out.println(">");
        }
        else if (A<B){
            System.out.println("<");
        }
        else{
            System.out.println("==");
        }
    }
}