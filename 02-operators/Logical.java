public class Logical{
    public static void main(String[] args){
        int A = 5;
        int B = 10;
        System.out.println((A < B) && (A != B)); // logical AND //true
        System.out.println((A < B) || (A == B)); // logical OR  //true
        System.out.println(!(A < B)); // logical NOT //false
    }
}