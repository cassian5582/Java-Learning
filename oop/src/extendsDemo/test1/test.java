package extendsDemo.test1;

public class test {
    static void main(String[] args) {
        c4 c4 = new c4();
        c4.test();
    }
}

class c1 {
    int a = 1;
}
class c2 extends c1 {
    int a = 2;
}
class c3 extends c2{
    int a = 3;
}
class c4 extends c3{
    int a = 4;
    public void test(){
        int a = 5;
        System.out.println(super.a);
    }
}
