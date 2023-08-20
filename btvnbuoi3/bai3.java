import java.util.Scanner;
public class bai3 {
    private int maSinhvien;
    private  String hoTen;
    private  float diemToan;
    private float diemLy;
    private float diemHoa;
    private float diemTB;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSinhvien = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextFloat();
        diemTB = (diemHoa + diemLy + diemToan) / 3;
    }

    public void xuat() {
        System.out.printf("%-15s%-15s%-20s%-10s%-10s%-10s%n", maSinhvien, hoTen, diemToan, diemLy, diemHoa, diemTB);
    }



    public static void main(String[] args) {
        bai3[] sv = new bai3[5];
        for (int i = 0; i < sv.length; i++) {
            sv[i] = new bai3();
            sv[i].nhap();
        }

        System.out.println("maSinhVien      hoten       diemtoan       diemly      diemhoa   DiemTB");
        for (bai3 x : sv) {
            x.xuat();
        }
    }
}

