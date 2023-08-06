
import java.util.Scanner;
import java.lang.Math;
public class bai3 {
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
             int check = 0;
             if(n<2) 
             System.out.println(n+ " khong la so nguyen to");
             for(int i=2;i<=Math.sqrt(n);i++)
             {
                if(n%i==0)
                check++;
             }
             if(check==0)
              System.out.println(n+ " la so nguyen to");
             else
              System.out.println(n+ " khong la so nguyen to");

        }
    }

}