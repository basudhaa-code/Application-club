import java.io.*;
import java.util.*;

public class B_countdown {
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

        int t = 1;
       while (t-- > 0) {
    Queue<Integer> q = new LinkedList<>();
    int num = in.nextInt(); 
    
    for (int i = 0; i < num; i++) {
        String str = in.next(); 
        int v = in.nextInt();   
        
        q.offer(v); 
        while (!q.isEmpty() && v - q.peek() > 2025) {
            q.poll();
        }

        System.out.println(q.size());
    }
}

        out.close();
    }
}