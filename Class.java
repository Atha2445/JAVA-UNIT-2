import java.util.*;
import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;
}

public class BoxDemo{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Box mybox = new Box();
    double vol;
    mybox.length=sc.nextInt();
    mybox.width=sc.nextInt();
    mybox.height=sc.nextInt();
    
    vol=mybox.length*mybox.width*mybox.height;
    System.out.println("Volume is: "+vol);
    }
}




------------------

10
20
30
Volume is: 6000.0

=== Code Execution Successful ===
