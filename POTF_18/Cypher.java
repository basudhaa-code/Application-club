import java.util.Scanner;

public class Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            // final digits
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // process each wheel
            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();   // number of moves
                String str = sc.next(); // moves string

                int u = 0, d = 0;

                // count moves
                for (int j = 0; j < b; j++) {
                    if (str.charAt(j) == 'U')
                        u++;
                    else
                        d++;
                }

                // reverse the effect
                arr[i] = (arr[i] + d - u + 10) % 10;
            }

            // output initial sequence
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
