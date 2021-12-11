import java.util.Arrays;
public class findNonRepeatingElement {

    static void eleRepeatTwice(int arr[], int n) {
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        System.out.println("Array: " + Arrays.toString(arr) +" Result: " + xor);
    }

    static void find2NonRepeating_eleRepeatThrice(int arr[], int n) {
        int xor = 0;
        for(int i=0; i<n; i++) {
            xor = xor ^ arr[i];
        }
        int setBit = xor & ~(xor-1);
        int xor1 = 0;
        int xor2 = 0;
        for(int i=0; i<n; i++) {
            if((arr[i] & setBit) == 0) {
                xor1 = xor1 ^ arr[i];
            } else {
                xor2 = xor2 ^ arr[i];
            }
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("xor1 = " + xor1);
        System.out.println("xor2 = " + xor2);
    }

    static void eleRepeatKtimes(int arr[], int n, int k) {
        byte sizeOfInt=4; int INT_SIZE=8*sizeOfInt;
        int count[] = new int[INT_SIZE];
        for(int i=0; i<INT_SIZE; i++) {
            for(int j=0; j<n; j++) {
                if((arr[j] & (1<<i)) != 0) {
                    count[i]++;
                }
            }
        }
        int res=0;
        for(int i=0; i<INT_SIZE; i++) {
            res+=(count[i]%k)*(1<<i);
        }
        System.out.println("Array: " + Arrays.toString(arr) + " Result: " + res);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1, 3, 6, 6};
        int n = arr1.length;
        eleRepeatTwice(arr1, n);
        
        int[] arr2 = {5, 4, 1, 4, 3, 5, 1, 2};
        n = arr2.length;
        find2NonRepeating_eleRepeatThrice(arr2, n);

        int[] arr3 = {2, 2, 1, 5, 1, 1, 2};
        n = arr3.length;
        eleRepeatKtimes(arr3, n, 3);
    }
}
