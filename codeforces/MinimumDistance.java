import java.util.*;

public class MinimumDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] hos = new int[n];
            int[] tower = new int[m];

            for (int i = 0; i < n; i++) {
                hos[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                tower[i] = sc.nextInt();
            }

            int ans = 0;

            // For each hostel
            for (int i = 0; i < n; i++) {
                int minDist = Integer.MAX_VALUE;

                // Find nearest tower
                for (int j = 0; j < m; j++) {
                    int dist = Math.abs(hos[i] - tower[j]);
                    minDist = Math.min(minDist, dist);
                }

                // Worst hostel decides r
                ans = Math.max(ans, minDist);
            }

            System.out.println(ans);
        }
    }
}
