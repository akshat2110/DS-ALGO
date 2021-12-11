// To find power of integer less than its range

public class fastPower {
    public static void main(String[] args) {
        int base = 2;
        int exponent = 3;
        int result = 1;
        while (exponent > 0) {
            if((exponent & 1) == 1) {
                result *= base;
            }
            exponent >>= 1;
            base *= base;
        }
        System.out.println(result);
    }
}
