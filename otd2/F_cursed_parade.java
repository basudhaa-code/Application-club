import java.io.*;
import java.util.*;

public class F_cursed_parade {
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

        int t = 1; //in.nextInt();
        while (t-- > 0) {
            // start your coding part here
            int n = in.nextInt();
            Queue<Integer> q = new ArrayDeque<>();
            for(int i = 0; i < n; i++){
                int val = in.nextInt();
                q.offer(val);
            }
            int k = in.nextInt();

            int sum = 0;
            int count  = 0;

            while(!q.isEmpty()){
                sum += q.peek();
                if (sum > k){
                    sum = 0;
                    count = 0;
                    sum += q.peek(); 
                }    
                q.poll();
                count++;
            }
            if(count > 0)
                System.out.println(count);
            else
                System.out.println("-1");


        }

        out.close();
    }
}