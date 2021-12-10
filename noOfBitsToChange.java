public class noOfBitsToChange{
    public static void main(String[] args){
        int a=5, b=2, n, c=0;
        n = a^b;
        while(n!=0){
            c++;
            n = n&(n-1);
        }
        System.out.println("Number of bits to change: "+c);
    }
}