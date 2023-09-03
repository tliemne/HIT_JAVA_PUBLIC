package BAI3;
import java.util.ArrayList;
import java.util.Scanner;

public class bai3 {
    public static void main(String[] age)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong hang hoa dien tu");
        int n = sc.nextInt();
        ArrayList<Hanghoagiadung> a = new ArrayList<Hanghoagiadung>(n);
        ArrayList<Hanghoadientu> b = new ArrayList<Hanghoadientu>(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Hang gia dung "+(i+1));
            Hanghoagiadung hhgd = new Hanghoagiadung();
            hhgd.input();
            a.add(hhgd); 
        }
        for(int i=0;i<n;i++)
        {
            Hanghoagiadung x = a.get(i);
            x.Tongtien();
            x.output();
        }
    }

    
}
