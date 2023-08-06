
import java.util.Scanner;
public class bai2b {
    public static void main(String[] age)
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("nhap gia tri cua n");
            int n ;
             do{
              n = s.nextInt();
             }
             while(n<0);
             int P = 0 ;
             int X = 1;
             for(int i=1;i<=n;i++)
             {
                X *= i;
                P += X;
             }
             System.out.println(P);
        }
        

    }
}
