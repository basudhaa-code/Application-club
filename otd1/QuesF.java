import java.util.Scanner;

public class QuesF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T -- > 0){
            int n = sc.nextInt();
            int divisor = 0;
            int count = 0;
            int arr[] = new int[n];
            for(int i = 0; i < n ; i ++){
                arr[i] = sc.nextInt();
            }

            for(int i = 0; i < n; i++){
                count = 0;
                for(int j = 1; j < n; j++){
                    if (arr[j] == 1)
                        count = count + 0;
                    else if (arr[j] == 2)
                        count += 1;
                    else if (arr[j] == 4)
                        count +=2;
                    if(count % 2 != 0)
                        divisor++;

                }
            }
            System.out.println(divisor);
        }
    }
    
}

