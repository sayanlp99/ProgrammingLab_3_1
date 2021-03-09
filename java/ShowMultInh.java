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
class CSE_Student extends Student_HETC{
    String dept="CSE";
    void sayDept(){
        System.out.println("Dept.: "+dept);
    }
}
class ShowMultInh {
    public static void main(String[] args) {
        CSE_Student c = new CSE_Student();
        c.sayName();
        c.sayClgName();
        c.sayDept();
    }
}