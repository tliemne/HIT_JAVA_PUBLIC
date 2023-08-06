
import java.util.Scanner;
import java.lang.Math;

public class bai4 {
    public static void main(String[] age) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("nhap vao so a");
            float a = s.nextFloat();
            while (a == 0) {
                System.out.println("day khong phai phuong trinh bac 4 hay nhap lai");
                a = s.nextFloat();
            }
            System.out.println("nhap vao so b");
            float b = s.nextFloat();
            System.out.println("nhap vao so c");
            float c = s.nextFloat();
            float delta = b * b - 4 * a * c;

            if (delta > 0) {
                float t1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                float t2 = (-b - (float) Math.sqrt(delta)) / (2 * a);
                float x1 = (float)Math.sqrt(t1);
                float x2 = (float)Math.sqrt(t2);
                if(t1 > 0 && t2 > 0)
                {
                    System.out.println("phuong trinh co 4 nghiem:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = -" + x1);
                    System.out.println("x3 = " + x2);
                    System.out.println("x4 = -" + x2);
                }
                else if(t1 < 0 && t2 < 0)
                {
                    System.out.println("phuong trinh vo nghiem:");
                }
                else if(t1 < 0 && t2 > 0)
                {
                    System.out.println("phuong trinh co 2 nghiem:");
                    System.out.println("x1 = " + x2);
                    System.out.println("x2 = -" + x2);
                }
                else if(t1 > 0 && t2 < 0)
                {
                    System.out.println("phuong trinh co 2 nghiem:");
                    System.out.println("x1 = " + x1);
                    System.out.println("x2 = -" + x1);

                }

            } else if (delta == 0) {
                float t = -b / (2 * a);
                if (t < 0) {
                    System.out.println("phuong trinh vo nghiem");
                } else {
                    float x = (float)Math.sqrt(t);
                    System.out.println("phuong trinh co 4 nghiem:");
                    System.out.println("x1 = " + x);
                    System.out.println("x2 = -" + x);
                    System.out.println("x3 = " + x);
                    System.out.println("x4 = -" + x);
                }
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
