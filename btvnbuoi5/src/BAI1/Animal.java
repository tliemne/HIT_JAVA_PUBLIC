package BAI1;

import java.util.Scanner;

class Animal {
    protected String  name;
    protected int age;
    protected Float weight;
    public Animal()
    {
    }
    public Animal(String name, int age, Float weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name  = name;
    }
    public int getage()
    {
        return age;
    }
    public void setage(int age)
    {
        this.age =age; 
    }
    public Float getweight()
    {
        return weight;
    }
    public void setweight(Float weight)
    {
        this.weight = weight;
    }
    public void input()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = s.nextLine();
        System.out.println("nhap tuoi");
        age = s.nextInt();
        System.out.println("nhap can nang");
        weight = s.nextFloat();
    }
    public void output()
    {
        System.out.println("Name : "+name);
        System.out.println("age : "+age);
        System.out.println("weight : "+weight);
    }
    public void Tiengkeu()
    {
        
    }
}
