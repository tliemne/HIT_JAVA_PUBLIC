package BAI1;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person()
    {
    }
    public Person(String name,int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public int age()
    {
        return age;
    }
    public void setage(int age)
    {

        this.age = age;
    }
    public String getgender()
    {
        return gender;
    }
    public void setgender()
    {
        this.gender=gender;
    }
    public void input()
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap ten ");
        name = sc1.nextLine();
        System.out.println("Nhap tuoi");
        age = sc1.nextInt();
        System.out.println("nhap gender");
        gender = sc1.nextLine();   
    }
    public void output()
    {
        System.out.println("name : "+name);
        System.out.println("age : "+age);
        System.out.println("gender :  "+gender);
    }
    
    
}
