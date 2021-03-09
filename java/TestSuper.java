import java.lang.*;
import java.util.*;

class Students {
    String name;
    Students(String n){
        this.name = n;
    }
    void sayName(){
        System.out.println("I am "+this.name);
    }
}
class Student_HETC extends Students{        
    String clg_n;
    Student_HETC(String n, String clg) {
        super(n);
        this.clg_n = clg;
    }
    void sayDetails(){
        System.out.println("Hi,  I am "+this.name+" and I study in "+this.clg_n+".");
    }
}

class TestSuper {
    public static void main(String[] args) {
        String s_name, college;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student's name: ");
        s_name = sc.nextLine();
        System.out.println("Enter his/her college name: ");
        college = sc.nextLine();
        sc.close();
        Students s1 = new Student_HETC(s_name, college);
        s1.sayName();
    }
}