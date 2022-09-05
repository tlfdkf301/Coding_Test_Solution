import java.util.Scanner;
public class leap_year {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int year = t.nextInt();
       
        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
        t.close();
    }
}
