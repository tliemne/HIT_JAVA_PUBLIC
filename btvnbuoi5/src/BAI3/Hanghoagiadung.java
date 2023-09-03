package BAI3;
import java.util.Scanner;
class Hanghoagiadung extends Hanghoa {
    private String chucnang;
    public Hanghoagiadung()
    {}
    public Hanghoagiadung(String chucnang,String mahang,String tenhang, int soluong ,  Float dongia, Vatlieu[] dsvl)
    {
        super(mahang, tenhang, soluong, dongia, dsvl);
        this.chucnang=chucnang;
    }
    public String getchucnang()
    {
        return chucnang;
    }
    public void setchucnang(String chucnang)
    {
        this.chucnang = chucnang; 
    }
    public void input()
    {
        
        Scanner s4 = new Scanner(System.in);
        System.out.println("nhap chuc nang ");
        chucnang = s4.nextLine();
        super.input();
    }
    
    public void output()
    {
    
        System.out.println("chuc nang "+chucnang);
        super.output();
    }
    public float Tongtien()
    {
        return super.Tongtien();
    }
    
}
