import java.util.*;
import java.util.Scanner;

class Factorial{
    int fact(int n){
    int res;
    if(n==1) return 1;
    res=fact(n-1)*n;
    return res;
    }
}
public class Recursion{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Factorial f= new Factorial();
        System.out.println("Factorial of 7 is : "+f.fact(7));
    }
    
}
