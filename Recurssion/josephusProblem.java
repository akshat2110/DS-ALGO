public class josephusProblem {
    static int josephus(int n, int k) {
        if (n == 1)
            return 0;
        else
            return (josephus(n - 1, k) + k) % n;
    }
    public static void main(String[] args) {
        int n=5, k=3; 
        int result = josephus(n, k);
        System.out.println(result);
    }
}
