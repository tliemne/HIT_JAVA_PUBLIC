import java.util.Scanner;
public class bai5 {


     public static void main(String[] age)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            String s0 = " "; 
            System.out.println("nhap ten ");
            String a = sc.nextLine();
            a = a.toLowerCase();
            a = a.trim();
            a = a.replaceAll("\\s+", " ");
            String []s = a.split(" ");
            String s1 = "";
            for(int i=0;i<s.length;i++)
            {
                String s2 = "";
                if(s[i].length() != 0)
                {
                    s2 += Character.toUpperCase(s[i].charAt(0)) ; 
                }
                if(s[i].length() > 1)
                {
                    s2 = s2 + s[i].substring(1) + s0;
                    s1 += s2;
                }
                
            }
            s1 = s1.trim();  
            System.out.println(s1 + " ");
        }
    }
}
