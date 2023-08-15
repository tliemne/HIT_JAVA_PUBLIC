import java.util.Scanner;
public class bai3 {

    static void sx(int n, int a[])
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int k = a[i];
                    a[i] = a[j];
                    a[j] = k;               
                }
            }
        }
        System.out.println("mang sau khi sx ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] age)
    {
        try(Scanner s =  new Scanner(System.in))
        {

            System.out.println("nhap so luong phan tu trong mang");
            int n = s.nextInt();
            int a[] = new int[1000];
            System.out.println("nhap mang");
            for(int i=0;i<n;i++)
            {
                System.out.print("a["+i+"] = ");
                a[i] = s.nextInt();
            }
            bai3.sx(n, a);
        }
    }
}
