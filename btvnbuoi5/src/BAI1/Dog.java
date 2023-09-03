package BAI1;

import java.util.Scanner;

class Dog extends Animal{
    private String character;
    public Dog()
    {
    }
    public Dog(String character, String name, int age, Float weight)
    {
        super(name, age, weight);
        this.character = character;
    }
    public String getcharacter()
    {
        return character;
    }
    public void setcharacter(String character)
    {
        this.character = character;
    }
    public void input()
    {
        super.input();
        Scanner s1 = new Scanner(System.in);
        System.out.println("nhap tinh cach");
        character = s1.nextLine();
    }
    public void output()
    {
        super.output();
        System.out.println("Character : "+character);
    }
    public void Tiengkeu()
    {
        System.out.println("gaw gaw gaw");
    }
    
}
