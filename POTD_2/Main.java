import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt;
        int four = 0;
        int two = 0;
        while(T!=0){
            int n = sc.nextInt();
            while(n!=0){
                if(n%4 == 0)
                    four++;
                    n=n/4;
            }
        }
    }
}