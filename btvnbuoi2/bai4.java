import java.util.Scanner;
public class bai4 {
    public static boolean check(String str)
    {
        int length  = str.length();
        for(int i=0;i<length/2;i++)
        {
           
            if(str.charAt(i) == str.charAt(length - i- 1))
            return true;
        }
        return false;
    }
    public static void main(String[] age)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("nhap chuoi");
            String  s = sc.next();
                    if(check(s))
                    {
                        System.out.println("true");
                    }
                    else
                    {
                    System.out.println("false");
                    }
            
        }
    }
}
