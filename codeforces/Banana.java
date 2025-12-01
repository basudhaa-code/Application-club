//MNNIT AC CLUB 
// potd day 1
//CODEFORCES PROBLEM 546Agi


import java.util.*;

public class Banana {
    public static void main(String[] args) {
        int k,w,l;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        l = sc.nextInt();
        w = sc.nextInt();
        int sum = (k * ((w+1)*w)) / 2;

        int borrow = 0;
        if (sum > l){
            borrow = sum - l;
        }
        System.out.println(borrow);
    }
    
}
