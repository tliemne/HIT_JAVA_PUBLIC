package BAI2;

import java.util.Scanner;

public class Date {
    private int year;
    private int  month;
    private int day;
    public Date()
    {}
    public Date(int year,int month,int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    } 
    public int getyear()
    {
        return year;
    }
    public void setyear(int year)
    {
        this.year=year;
    }
    public int getmonth(){
        return month;
    }
    public void setmonth(int month)
    {
        this.month=month;
    }
    public int getday()
    {
        return day;
    }
    public void setday(int day){
        this.day=day;
    }
    public void input()
    {
        Scanner  s = new Scanner(System.in);
        System.out.println("nhap year");
        year = s.nextInt();
        System.out.println("nhap month");
        month = s.nextInt();
        System.out.println("nhap day");
        day =s.nextInt(); 
    }
    public void output()
    {
        System.out.println("year : "+year);
        System.out.println("month : "+month);
        System.out.println("day : "+day);
    }
}
