// Euclid GCD algorithm

public class gcd_lcm {
    static int euclidGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return euclidGCD(b, a % b);
    }

    static int lcm(int a, int b) {
        return a * b / euclidGCD(a, b);
    }
    public static void main(String[] args) {
        int a=5, b=15;
        System.out.println("GCD of "+a+" and "+b+" is "+euclidGCD(a,b));
        System.out.println("LCM of "+a+" and "+b+" is "+lcm(a,b));
    }
}
