import java.util.Scanner;

public class bai1 {

           
    public static void main(String[] age)
    
    {
        try(Scanner s = new Scanner(System.in) )
        {
            System.out.println("nhap so luong phan tu cua mang");
            int n = s.nextInt();
            System.out.println("nhap mang ");
            int []a = new int[n];
            int []b = new int[n];
            
            for(int i=0;i<n;i++)
            {
                System.out.print("a["+ i +"] = ");
                a[i] = s.nextInt();
            }
            System.out.println("mang sau khi nhap la");
            for(int i=0;i<n;i++)
            {
                System.out.print(a[i] + " ");
            }
            for(int i=0;i<n;i++)
            {
                b[i]=1;
            }
            System.out.println();
            for(int i = 0;i<n;i++)
            {
                int count = 1;
                if(b[i]==1)
                {
                    b[i] = 0;
                    for(int j=i+1;j<n;j++)
                        {
                            if(a[j] == a[i] )
                            {
                                count++;
                                b[j] = 0;
                            }
                        }
                    System.out.println("so " + a[i] +" xuat hien " + count +" lan");
                }
            }
          
            }
        }
    }


