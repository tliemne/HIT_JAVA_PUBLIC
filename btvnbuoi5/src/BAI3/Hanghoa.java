package BAI3;
import java.util.Scanner;

public class Hanghoa {
    private String mahang;
    private String tenhang;
    private int soluong;
    private Float dongia;
    private Vatlieu[] dsvl;
    public Hanghoa()
    {
    }
    public Hanghoa(String mahang,String tenhang, int soluong ,  Float dongia, Vatlieu[] dsvl)
    {
        this.mahang = mahang;
        this.tenhang = tenhang;
        this.soluong = soluong;
        this.dongia=dongia;
        this.dsvl =  dsvl;
    }
    public String getMaHang() {
        return mahang;
    }
    public void setMaHang(String mahang) {
        this.mahang = mahang;
    }
    public String getTenHang() {
        return tenhang;
    }
    public void setTenHang(String tenhang) {
        this.tenhang = tenhang;
    }
    public int getSoLuong() {
        return soluong;
    }
    public void setSoLuong(int soluong) {
        this.soluong = soluong;
    }
    public float getDonGia() {
        return dongia;
    }
    public void setDonGia(float dongia) {
        this.dongia = dongia;
    }
    public Vatlieu[] getDsVL() {
        return dsvl;
    }
    public void setDsVL(Vatlieu[] dsvl) {
        this.dsvl = dsvl;
    }
    public void input()
    {
        Scanner s2 = new Scanner(System.in);
        System.out.println("nhap ma hang");
        mahang = s2.nextLine();
        System.out.println("nhap ten hang");
        tenhang = s2.nextLine();
        System.out.println("nhap so luong");
        soluong = s2.nextInt();
        System.out.println("nhap don gia");
        dongia = s2.nextFloat();
        dsvl = new Vatlieu[soluong];
        System.out.println("");
        for(int i=0;i<soluong;i++)
        {
            System.out.println("Vat lieu "+(i+1));
            dsvl[i]  = new Vatlieu();
            dsvl[i].input();
        }
    }
    public void output()
    {
        System.out.println("Ma hang " + mahang);
        System.out.println("Ten hang "+tenhang);
        System.out.println("So luong " +soluong);
        System.out.println("Don gia "+dongia);
        for(int i=0;i<soluong;i++)
        {
            System.out.println("Vat lieu "+(i+1));
            dsvl[i].output();
        }
    }
    public float Tongtien()
    {
        float s = soluong*dongia;
         System.out.println("Tong tien = "+s);
         return s;
    }
}
