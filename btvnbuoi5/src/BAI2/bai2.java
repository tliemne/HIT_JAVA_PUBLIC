package BAI2;

import java.util.ArrayList;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] ages)
    {
        Scanner s2 = new Scanner(System.in);
        System.out.println("nhap so luong sinh vien");
        int n  = s2.nextInt();
        ArrayList<Student> a = new ArrayList<Student>(n);
        for(int i=0;i<n;i++)
        {
            System.out.println("Sinh vien"+(i+1));
            Student std = new Student();
            std.input();
            a.add(std);
        }
    
    for(int i=0;i<n;i++)
    {
        System.out.println("********************************");
        Student student = a.get(i);
        student.output();
    }
}
    
}
