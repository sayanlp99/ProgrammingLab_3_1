import java.lang.*;
import java.util.*;
interface A {
    void showName();
    void showDept();
}
interface B {
    void showName();
    void showCollege();
}
class Student implements A, B {
    @Override
    public void showCollege() {
        System.out.println("College name: HETC");
    }
    @Override
    public void showName() {
        System.out.println("Name: Sayan Chakraborty");
    }
    @Override
    public void showDept() {
        System.out.println("Dept.: CSE");
    }
}
class InterfaceOneMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        B r;
        r = s1;
        r.showName();
    }
}