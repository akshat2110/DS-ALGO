// Find number of ways from start to end in a matrix
public class noOfWays {
    static int count(int n, int m){
        if(n==1 || m==1)
            return 1;
        return count(n-1,m)+count(n,m-1);
    }
    public static void main(String[] args) {
        int n = 3, m =3 ;
        System.out.println(count(n, m));
    }
}
