package BAI3;
import java.util.Scanner;

class Hanghoadientu extends Hanghoa {
    private int tgbh;
    private int congsuat;
    public Hanghoadientu()
    {
    }
    public Hanghoadientu(int tgbh, int congsuat,String mahang,String tenhang, int soluong ,  Float dongia, Vatlieu[] dsvl)
    {
        super(mahang, tenhang, soluong, dongia, dsvl);
        this.tgbh=tgbh;
        this.congsuat=congsuat;
    }
    public int getThoigianBaoHanh() {
        return tgbh;
    }
    public void setThoigianBaoHanh(int tgbh) {
        this.tgbh=tgbh;
    }
    public int getCongSuat() {
        return congsuat;
    }
    public void setCongSuat(int congsuat) {
        this.congsuat=congsuat;
    }
    public void input()
    {
        super.input();
        Scanner s3 = new Scanner(System.in);
        System.out.println("nhap tgbh");
        tgbh = s3.nextInt();
        System.out.println("nhap cong suat");
        congsuat = s3.nextInt();
       
    }
    public void output()
    {
        super.output();
        System.out.println("tgbh "+tgbh);
        System.out.println("cong suat "+congsuat);
    }
    public float Tongtien()
    {
        return super.Tongtien();
    }

    
}
