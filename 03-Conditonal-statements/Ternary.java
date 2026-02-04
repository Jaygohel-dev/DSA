import java.util.Scanner;

public class Ternary {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
    int marks = sc.nextInt();
    String status = (marks >= 34) ? "pass" : "fail";
    System.out.println(status);
    }
}
