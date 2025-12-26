import java.util.Scanner;



public class Lock {

     static boolean isPrime(int n) {
    if (n <= 1) return false;   // 0 and 1 are not prime
    if (n == 2) return true;    // 2 is prime
    if (n % 2 == 0) return false; // even numbers > 2 are not prime

    for (int i = 3; i * i <= n; i += 2) {
        if (n % i == 0)
            return false;
    }
    return true;
}

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int T = sc.nextInt();
        while( T -- > 0){
            int n = sc.nextInt();
            int i  = 1;
            boolean con1 = false;
            boolean con2 = false;
            while(i < n/2){
                if(isPrime(i) && isPrime(n-i))
                    con1 = true;
                else if(isPrime(i) && !isPrime(n-i)){
                 if(n-i == 1)
                    con2 = false;
                else
                    con2 = true;
                }

                if(con1== true && con2 == true){
    
                    break;
                }
                i++;
            }
            if(con1== true && con2 == true)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
        
        
    }
    
}
