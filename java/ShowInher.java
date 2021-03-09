import java.lang.*;
import java.util.*;
class Students {
    String name="ABCD";
    void sayName(){
        System.out.println("Hi, I am "+name);
    }
}
class Student_HETC extends Students{        
    String clg_name="HETC";
    void sayClgName(){
        System.out.println("I study in "+clg_name);
    }
}
class ShowSingInh {
    public static void main(String[] args) {
        Student_HETC c = new Student_HETC();
        c.sayName();
        c.sayClgName();
    }
}
