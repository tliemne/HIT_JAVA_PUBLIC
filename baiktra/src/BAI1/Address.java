package BAI1;

import java.util.Scanner;

class Address {
    private String city;
    private String district;

    public Address() {
    }

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }

    public String getdistrict() {
        return district;
    }

    public void setdistrict() {
        this.district = district;
    }

    public void input() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Nhap city");
        city = sc2.nextLine();
        System.out.println("Nhap district");
        district = sc2.nextLine();
    }

    public void output() {
        System.out.println("city: " + city);
        System.out.println("district " + district);
    }
}
