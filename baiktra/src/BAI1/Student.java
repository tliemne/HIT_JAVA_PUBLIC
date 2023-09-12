package BAI1;
import java.util.Scanner;

    class Student extends Person{
    private int id;
    private Address address;
    private double gpa;
    public Student()
    {
    }
    public Student(int id, Address address, double gpa,String name,int age, String gender)
    {
        super(name, age, gender);
        this.id=id;
        this.address = address;
        this.gpa=gpa;    
    }
    public int getid()
    {
        return id;
    }
    public void setid(int id){
        this.id = id;
    }
    public Address getaddress()
    {
        return address;
    }
    public void setaddress(Address address)
    {
        this.address =address;
    }
    public double getgpa()
    {
        return gpa;
    }
    public void setgpa(double gpa)
    {
        this.gpa = gpa;
    }
    public void input()
    {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Nhap id");
        id  =sc3.nextInt();
        System.out.println("Nhap Adress");
        Address address = new Address();
        address.input();
        System.out.println("nhap gpa");
        gpa  =sc3.nextDouble();
        

       }
    public void output()
    {
        System.out.println("id "+id);
        address.output();;
        System.out.println("gpa"+gpa);
    }
}
