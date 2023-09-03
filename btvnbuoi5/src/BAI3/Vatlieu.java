package BAI3;
import java.util.Scanner;

class Vatlieu {
    private String ten;
    private String mausac;
    private int docung;
    public Vatlieu()
    {
    }
    public Vatlieu(String ten, String mausac, int docung)
    {
        this.ten = ten;
        this. mausac = mausac;
        this.docung = docung; 
    }
    public String getten()
    {
        return ten;
    }
    public void setten(String ten)
    {
        this.ten =  ten;
    }
    public String getmausac()
    {
        return mausac;
    }
    public void setmausac(String mausac)
    {
        this.mausac = mausac;  
    }
    public int getdocung()
    {
        return docung;
    }
    public void setdocung(int docung)
    {
        this.docung = docung;
    }
    public void input()
    {
        Scanner s1 = new Scanner(System.in); 
        System.out.println("nhap ten");
        ten = s1.nextLine();
        System.out.println("nhap mau ");
        mausac = s1.nextLine();
        System.out.println("nhap do cung");
        docung = s1.nextInt();
    }
    public void output()
    {
        System.out.println("Ten : "+ten);
        System.out.println("Mau sac : "+mausac);
        System.out.println("Do cung : "+docung);
    }
}
