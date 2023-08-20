import java.util.Scanner;
public class bai1 {
    private int Masach;
    private String tensach;
    private String Tacgia;
    private String NXB;
    private int NSX;
    
    public bai1()
    {
    }
    public bai1(int ms[] ,String ts[] ,String tg[],String Nxb[],int Nsx[],int n) 
    {
           
            for(int i=0;i<n;i++)
            {
                Masach = ms[i];
                tensach = ts[i];
                Tacgia = tg[i];
                NXB = Nxb[i];
                NSX = Nsx[i]; 
            }
            
    }
    public static void main(String[] args) { Scanner s = new Scanner(System.in);
            System.out.println("nhap so luong sach");
            int n = s.nextInt();
            bai1 ls = new bai1();
        
            for(int i=0;i<n;i++)
            {
                System.out.println("nhap ma sach");
                ls.Masach = s.nextInt();
                System.out.println("nhap ten sach");
                ls.tensach = s.nextLine();
                System.out.println("nhap ten tac gia");
                ls.Tacgia = s.nextLine();
                System.out.println("nhap nha xuat ban");
                ls.NXB = s.nextLine();
                System.out.println("nhap nam xuat ban");
                ls.NSX = s.nextInt();
                
            }
            for(int i=0;i<n;i++)
            {
                System.out.println("Ma sach 00" + ls.Masach );
                System.out.println("Ten sach " + ls.tensach);
                System.out.println("Tac gia " + ls.Tacgia );
                System.out.println("Nha xuat ban "+ ls.NXB);
                System.out.println("Nam xuat ban "+ ls.NSX);  
            }
            
    }
    
}
