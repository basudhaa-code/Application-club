import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();

        int tilesN = (int)Math.ceil((double)n / a);
        int tilesM = (int)Math.ceil((double)m / a);
        System.out.println(tilesN * tilesM);

    }
    
}
