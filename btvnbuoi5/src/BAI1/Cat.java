package BAI1;

import java.util.Scanner;

class Cat  extends Animal {
    private String color;
    private String preferences;
    private String ownername;
    public Cat()
    {

    }
    public Cat(String color, String preferences , String ownername,String name, int age, Float weight )
    {
        super(name,age,weight);
    
        this.color = color;
        this.preferences = preferences;
        this.ownername = ownername;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreferences() {
        return preferences;
    }

    public void setPreferences(String preferences) {
        this.preferences = preferences;
    }

    public String getOwnerName() {
        return ownername;
    }

    public void setOwnerName(String ownername) {
        this.ownername = ownername;
    }
    public void input()
    {
        super.input(); 
        Scanner s2 = new Scanner(System.in);
        System.out.println("nhap color");
        color = s2.nextLine();
        System.out.println("nhap preferences");
        preferences = s2.nextLine();
        System.out.println("nhap ownername");
        ownername = s2.nextLine();
        
    }
    public void output()
    {
        super.output();
        System.out.println("color : "+color);
        System.out.println("preferences : "+preferences);
        System.out.println("ownername: "+ ownername);
    }
    public void Tiengkeu()
    {
        System.out.println("miu miu miu");
    }
    
}
