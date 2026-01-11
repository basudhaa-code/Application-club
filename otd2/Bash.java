import java.io.*;
import java.util.*;

public class Bash {
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
            int n = in.nextInt();
            int XOR = 0;
            int zero = 0;
            for(int i = 0; i < n; i++){
                int num = in.nextInt();
                XOR = XOR^num;    
                if(num == 0)
                    zero++;
                
            }

            if(XOR == 0 && zero != n)
                System.out.println("1");
            else if (zero == n) {
                System.out.println("-1");
            }
            else
                System.out.println("0");
            
        }

        out.close();
    }
}