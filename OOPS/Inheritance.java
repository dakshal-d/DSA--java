
class check1{
    void hmm1(){
        System.out.println("hello");
    }
}
class check2 extends check1{
    void hmm2() {
        System.out.println("hello again");
    }
}

public class Inheritance extends check2{
    public static void main(String[] args) {
        Inheritance test =new Inheritance();

        test.hmm1();
        test.hmm2();
    }
    
}

