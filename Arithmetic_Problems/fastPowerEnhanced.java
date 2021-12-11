public class fastPowerEnhanced {

    static long fastPowerMod(long a, long b, int n)
    {
        long res = 1;
        a = a % n;
        while (b > 0)
        {
            if ((b & 1) == 1)
                res = (res * a) % n;
            b = b >> 1;
            a = (a * a) % n;
        }
        return res;
    }
    public static void main(String[] args) {
        int base = 3;
        int exponent = 5;
        System.out.println(fastPowerMod(base, exponent, 1000000007));
    }
}
