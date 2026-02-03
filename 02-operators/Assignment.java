public class Assignment {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        x += y; // equivalent to x = x + y //30
        System.out.println("Value of x after += : " + x);
        x -= y; // equivalent to x = x - y //20
        System.out.println("Value of x after -= : " + x);
        x *= 2; // equivalent to x = x * 2 //40
        System.out.println("Value of x after *= : " + x);
        x /= 2; // equivalent to x = x / 2 //20
        System.out.println("Value of x after /= : " + x);
        x %= 3; // equivalent to x = x % 3 //2
        System.out.println("Value of x after %= : " + x);
    }
}
