import java.io.*;
import java.util.*;

public class E_New_Year_Gifts {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        FastReader() { br = new BufferedReader(new InputStreamReader(System.in)); }
        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try { st = new StringTokenizer(br.readLine()); }
                catch (IOException e) { e.printStackTrace(); }
            }
            return st.nextToken();
        }
        int nextInt() { return Integer.parseInt(next()); }
        long nextLong() { return Long.parseLong(next()); }
        String nextLine() {
            String str = "";
            try { str = br.readLine(); }
            catch (IOException e) { e.printStackTrace(); }
            return str;
        }
    }

    static class FastWriter {
        BufferedWriter bw;
        FastWriter() { bw = new BufferedWriter(new OutputStreamWriter(System.out)); }
        void print(Object obj) throws IOException { bw.append(String.valueOf(obj)); }
        void println(Object obj) throws IOException { print(obj); bw.append("\n"); }
        void close() throws IOException { bw.flush(); bw.close(); }
    }
    static int beauty(int x) {
        if (x == 0) return 0;
        // Integer.bitCount is Java's equivalent of __builtin_popcount
        return Integer.bitCount(x ^ (x >> 1)) - 1;
    }
    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            // start your coding part here
            int n = in.nextInt();
            int k = in.nextInt();

            int val[] = new int[n];
            for(int i  =0 ; i < n ; i++){
                val[i] = in.nextInt();
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            long currsum = 0;
            long sum = 0;

            for(int i = n - 1; i >=0; i--){
                int b = beauty(val[i]);
                pq.offer(b);
                currsum += b;

                if(pq.size()>k){
                    currsum -= pq.peek();
                    pq.poll();
                }

                sum += currsum;
            }

            System.out.println(sum);
        }

        out.close();
    }
}