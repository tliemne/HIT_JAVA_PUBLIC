
import java.util.Scanner;
import java.lang.Math;
public class bai1 {
    public static void main(String[] age)
    {
        try (Scanner s = new Scanner(System.in))
        {
            System.out.println("nhap gia tri cua n");
            int n ;
             do{
              n = s.nextInt();
             }
              while(n<0);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i == 1 || i==n || j==1 || j==n )
                System.out.print("*");
                else
                System.out.print(" ");
            }  
            System.out.println();
        
        }
            
            
        }      
}
}


