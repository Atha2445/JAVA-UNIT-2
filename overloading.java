import java.util.*;

class OverloadDemo{
    void test(){
        System.out.println("No Paramaters");
    }
    void test(int a){
        System.out.println("a: "+a);
    }
    void test(int a,int b){
        System.out.println("a and b: "+a+" "+b);
    }
    double test(double a){
        System.out.println("double a: "+a);
        return a*a;
    }
}
public class Overload{
    public static void main(String[] args){
    OverloadDemo ob=new OverloadDemo();
    ob.test();
    ob.test(10);
    ob.test(10, 20);
    double result=ob.test(123.25);
    System.out.println(result);
    }
}


-----------------------------------------------------

  No Paramaters
a: 10
a and b: 10 20
double a: 123.25
15190.5625

=== Code Execution Successful ===
  
