import java.util.Scanner;
public class exam_score {
    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        int score = t.nextInt();
        if (score>=90 && score<=100){
            System.out.println("A");
        }
        else if (score<90){
            System.out.println("B");
        }
        else if (score<80){
            System.out.println("C");
        }
        else if (score<70){
            System.out.println("D");
        }
        else{
            System.out.println("F");
        }
    }
}
