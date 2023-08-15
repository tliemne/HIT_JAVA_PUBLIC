import java.util.Scanner;
public class bai2 {
    static void them(int n, int index, int value,int a[] )
    {
        for(int i = n;i > index;i--)
        {
            a[i] = a[i-1];
        }   
       
        a[index] = value;
        n++;
        System.out.println(" mang sau khi them la ");
        for(int i = 0;i<n;i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    static void xoa(int n, int index1, int a[])
    {
        
        for(int i = index1 ; i < n;i++)
        {
            a[i] = a[i+1];
        } 
        --n;
        System.out.println(" mang sau khi xoa la ");
         for(int i = 0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }
    }
    public static  void main(String[] age)
    {
        try( Scanner s = new Scanner(System.in))
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
            System.out.println("mang sau khi nhap la");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }
            System.out.println();
            System.out.println("nhap vi tri can them");
            int index = s.nextInt();
            System.out.println("nhap gia tri can them");
            int value = s.nextInt();
            bai2.them(n, index, value,a);
            System.out.println();
            System.out.println("nhap vi tri can xoa");
            int index1 = s.nextInt();
            bai2.xoa(n, index1, a);
        }
    }
}
