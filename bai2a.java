
import java.util.Scanner;

public class bai2a {
    public static void main(String[] age)
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("nhap gia tri cua n");
            int n ;
             do{
              n = s.nextInt();
             }
             while(n<0);
             float S = 0 ;
             for(int i=1;i<=n;i++)
             {
                S += (float)1/i;
             } 
             System.out.println(S);
        }
    }
    
}
