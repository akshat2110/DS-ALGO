// Find the no. of trailing zeros in factoril of a number

public class trailingZerosInFactorial {
    public static void  main(String[] args)
    {
        int n = 12;
        int count = 0;
        while(n>0)
        {
            count += n/5;
            n = n/5;
        }
        System.out.println(count);
    }
}
