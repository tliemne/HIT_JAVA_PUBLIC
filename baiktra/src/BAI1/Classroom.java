package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

class Classroom {
    private int classid;
    private int numberOfStudent;
    private ArrayList<Student> listStudents;

    public Classroom() {
    }

    public Classroom(int classid, int numberOfStudent, ArrayList<Student> listStudents) {
        this.classid = classid;
        this.numberOfStudent = numberOfStudent;
        this.listStudents = listStudents;
    }

    public int getclassid() {
        return classid;
    }

    public void setclassid(int classid) {
        this.classid = classid;
    }

    public int getnumberOfStudent() {
        return numberOfStudent;
    }

    public void setnumberOfStudent(int numberOfStudent) {
        this.numberOfStudent = numberOfStudent;
    }

    public ArrayList<Student> getlistStudents() {
        return listStudents;
    }

    public void setlistStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void input() {
        Scanner sc4 = new Scanner(System.in);
        System.out.println("nhap classid ");
        classid = sc4.nextInt();
        System.out.println("Nhap  numberOfStudent");
        numberOfStudent = sc4.nextInt();
        System.out.println("Nhap listStudents");
        ArrayList<Student> listStudents = new ArrayList<Student>(numberOfStudent);
        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println("Sinh vien " + (i + 1));
            Student student = new Student();
            student.input();
            listStudents.add(student);

        }

    }

    public void output() {
        System.out.println("classid :" + classid);
        System.out.println("numberOfStudent: " + numberOfStudent);
        for (int i = 0; i < numberOfStudent; i++) {
            Student x = listStudents.get(i);
            x.output();
        }
    }
   

}
