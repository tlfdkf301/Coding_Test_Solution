import java.util.Scanner;
public class quadrant {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int x = t.nextInt();
        int y = t.nextInt();
        if (x>0){
            if (y>0){
                System.out.println("1");
            }
            else{
                System.out.println("4");
            }
        }
        else{
            if (y>0){
                System.out.println("2");
            }
            else{
                System.out.println("3");
            }
        }
        t.close();
    }    
}
