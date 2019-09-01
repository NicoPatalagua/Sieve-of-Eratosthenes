// Author: Nico Patalagua
public class Prime {
    public static void main(String[] args) {
        int n = 100000000;
        boolean isPrime;
        for (int i= 2; i<=n; i++) {
            isPrime = true;
            for (int j = 2; j <= Math.sqrt(i) && isPrime; j++) {
                if (i % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
