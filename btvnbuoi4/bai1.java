import java.util.Scanner;

class NSX
{
    private String MaNSX;
    private String TenNSX;
    private String DcNSX;
    
    public NSX()
    {
    }
    public NSX(String maNSX,String tenNSX,String dcNSX)
    {
        MaNSX = maNSX;
        TenNSX = tenNSX;
        DcNSX = dcNSX;
        
    }
    public String getMaNSX()
    {
        return MaNSX;
    }
    public void setMaNSX(String maNSX)
    {
        MaNSX = maNSX;
    }
     public String getTenNSX() {
        return TenNSX;
    }
    public void setTenNSX(String tenNSX) {
        TenNSX = tenNSX;
    }
    public String getDcNSX() {
        return DcNSX;
    }
    public void setDcNSX(String dcNSX) {
        DcNSX = dcNSX;
    }
    public void nhap()
    {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("nhap nam sx ");
            MaNSX = s.nextLine();
            System.out.println("nhap ten nsx ");
            TenNSX = s.nextLine();
             System.out.printf("Nhap DC nsx  ");
            DcNSX = s.nextLine();
        }
    }
    public void xuat()
    {
        System.out.printf("Ma NSX: " + MaNSX);
        System.out.printf("\tTen NSX: " + TenNSX);
        System.out.printf("\tDC NSX: " + DcNSX);
    }
}
class Hang
{
    private String  MaHang;
    private String TenHang;
    private NSX x;
    public Hang()
    {

    }
    public Hang(String mahang,String tenhang, NSX x)
    {
        MaHang = mahang;
        TenHang = tenhang;
        this.x = x; 
    }
    public void setMaHang(String maHang) {
        MaHang = maHang;
    }
    public String getTenHang() {
        return TenHang;
    }
    public void setTenHang(String tenHang) {
        TenHang = tenHang;
    }
    public NSX getX() {
        return x;
    }
    public void setX(NSX x) {
        this.x = x;
    }
    public void nhap()
    {
        try (Scanner s1 = new Scanner(System.in)) {
            System.out.printf("Nhap Ma Hang: ");
            MaHang = s1.nextLine();
            System.out.printf("Nhap Ten Hang: ");
            TenHang = s1.nextLine();
        }
        x = new NSX();
        x.nhap();

    }
     public void xuat(){
        System.out.printf("\tMa Hang: " + MaHang);
        System.out.printf("\tTen Hang: " + TenHang);
        x.xuat();
    }

    

}
public class bai1
{
    public static void main()
    {
        Hang a = new Hang();
        a.nhap();
        a.xuat();

    }
}