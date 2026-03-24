import java.util.*;
public class pr{
 
    public static boolean isPrime(int n) {
        if (n < 2) {
          return false;
        }
        for (int i = 2; i * i <= n; i++) { // ethe main logic aahe 
            if (n % i == 0) {
              return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int a = 2, b = 10;

        System.out.print("Prime numbers between " + a + " and " + b + ": ");
        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
  
