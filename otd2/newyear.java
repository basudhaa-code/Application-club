import java.io.*;
import java.util.*;

public class newyear {
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

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();
        while (t-- > 0) {
            // start your coding part here
             int n = in.nextInt();
            int k = in.nextInt();

            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            for(int i = 0; i < n; i++){
                int val = in.nextInt();
                maxHeap.offer(val);
            }
            int sum = 0;
            for(int i = 0; i < k; i++){
                int val = maxHeap.poll();
                sum += val;
                int half = (val/2);
                maxHeap.offer(half);
            }
            System.out.println(sum);
        }

        out.close();
    }
}