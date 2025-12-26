import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int k = sc.nextInt();
        int j = 1;
        char prevRep = ' ';
        int count =0;
        StringBuffer sb = new StringBuffer();
        sb.append(str.charAt(0));
        while(j < str.length()){
            char ch = sb.charAt(sb.length() - 1);
            char ch1 = str.charAt(j);
            if(ch == ch1 && prevRep != ch1){
                prevRep = ch1;
                count++;
            }
            else if(ch != ch1){
                sb.append(ch1);
                prevRep =' ';
            }
            j++;
        }
        if(count <= k)
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}
