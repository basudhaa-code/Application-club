import java.io.*;
import java.util.*;

public class D_New_Year_s_Eve_Fireworks {
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

        int t = in.nextInt();
        while (t-- > 0) {
            // start your coding part here
            String str = in.next();

            Stack<Character> stk = new Stack<>();

            for (char ch : str.toCharArray()) {
                if (!stk.isEmpty() && stk.peek() == ch) {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            }

            if (stk.isEmpty())
                System.out.println(1);
            else
                System.out.println(0);

        }

        out.close();
    }
}