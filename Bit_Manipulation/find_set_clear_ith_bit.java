public class find_set_clear_ith_bit {

    static int find_ith_bit(int n, int i) {
        int mask = 1 << i;
        return (n & mask) != 0? 1 : 0;
    }

    static int set_ith_bit(int n, int i) {
        int mask = 1 << i;
        return n | mask;
    }

    static int clear_ith_bit(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }
    public static void main(String[] args) {
        int n = 0b100110101;
        int i = 3;
        System.out.println(Integer.toBinaryString(n));

        System.out.println("The "+i+"th bit is: " + Integer.toBinaryString(find_ith_bit(n, i)));
        System.out.println("Binary no. after setting "+i+"th bit: " + Integer.toBinaryString(set_ith_bit(n, i)));
        System.out.println("Binary no. after clearing "+i+"th bit: " + Integer.toBinaryString(clear_ith_bit(n, i)));
    }
}