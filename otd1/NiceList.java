import java.util.Scanner;

public class NiceList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        int i = str.length() -1; 
        int j = str2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int dig1, dig2 = 0;
        while(i >= 0 || j >= 0){
            if (i >=0){
                dig1 = str.charAt(i) - '0';
            }
            else
                dig1 = 0;
            if(j >= 0){
                dig2 = str2.charAt(j) - '0';
            }
            else
                dig2 = 0;
            int sum = dig1+dig2;
            sb.insert(0,sum);
            i--;
            j--;

        }
        System.out.println(sb);
    }
}
