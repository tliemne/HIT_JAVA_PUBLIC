import java.util.Scanner;
import java.lang.Math;
public class bai5 {
    public static void main(String[] age)
    {
        try (Scanner s = new Scanner(System.in))
        {
            System.out.println("nhap vao so qua chanh");
            int a = s.nextInt();
            while(a <= 0 )
            {
                System.out.println("hay nhap lai");
                a = s.nextInt();
            }
            System.out.println("nhap vao so qua tao");
            int b=s.nextInt();
            while(b <= 0 )
            {
                System.out.println("hay nhap lai");
                b = s.nextInt();
            }
            System.out.println("nhap vao so qua le");
            int c = s.nextInt();
            while(c <= 0 )
            {
                System.out.println("hay nhap lai");
                c = s.nextInt();
            }

            int demchanh = 0;
            for(int i=1;i <= a;i++)

            {
                if( b % (i * 2) < b &&   c % (i * 4) < c )
                demchanh++;
            }
            System.out.println("Tong so qua toi da " + (demchanh + demchanh * 2+  demchanh * 4));
            System.out.println("Chanh: " + demchanh);
             System.out.println("tao: " + demchanh * 2 );
              System.out.println("le: " + demchanh * 4);

        }
    }
}
