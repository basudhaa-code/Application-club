import java.io.*;
import java.util.*;

public class D_Santa_s_Magical_Numbers {

    static final int MAX = 1000000;
    static boolean[] isPrime = new boolean[MAX + 1];

    static void sieve() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= MAX; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    static boolean isComposite(int x) {
        return x > 1 && !isPrime[x];
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        sieve();

        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            boolean primePrime = false;
            boolean primeComposite = false;

            if (n >= 6) {
                for (int p = 2; p < n; p++) {
                    if (isPrime[p]) {
                        int rem = n - p;

                        if (rem >= 2 && isPrime[rem])
                            primePrime = true;

                        i,f (isComposite(rem))
                            primeComposite = true;
                    }
                    if (primePrime && primeComposite)
                        break;
                }
            }

            out.append((primePrime && primeComposite) ? "YES\n" : "NO\n");
        }

        System.out.print(out.toString());
    }
}
