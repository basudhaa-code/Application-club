import java.util.*;
public class Santa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 1;
        int sum =0;
        while(true){
            if(sum == T || sum > T)
                break;
            sum = sum + num;
             num = num * 2;
        }
        
        if(sum == T)
            System.out.println("YES");
        else
            System.out.println("NO");
    }    
}
