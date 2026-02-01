import java.io.*;
import java.util.*;

public class E_Trip_Spoiler {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        BufferedWriter bw;

        FastWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        void print(Object obj) throws IOException {
            bw.append(String.valueOf(obj));
        }

        void println(Object obj) throws IOException {
            print(obj);
            bw.append("\n");
        }

        void close() throws IOException {
            bw.flush();
            bw.close();
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = 1; // in.nextInt();
        while (t-- > 0) {
            // start your coding part here
            int n = in.nextInt();
            int m = in.nextInt();

            int[] limit = new int[n + 1];

            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                int l = Math.min(x, y);
                int r = Math.max(x, y);
                limit[r] = Math.max(limit[r], l);
            }

            long ans = 0;
            int left = 1;
            int maxLeft = 0;

            for (int right = 1; right <= n; right++) {
                maxLeft = Math.max(maxLeft, limit[right]);
                left = Math.max(left, maxLeft + 1);
                ans += (right - left + 1);
            }

            System.out.println(ans);

        }

        out.close();
    }
}