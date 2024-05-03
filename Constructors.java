import java.util.*;
import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;
    
    Box(){
        length=10;
        width=20;
        height=30;
    }
    double volume(){
        return length*width*height;
    }
}
public class Demo{
    public static void main(String[] args){
    Box mybox=new Box();
    double vol=mybox.volume();
    System.out.println("Volume is: "+vol);
    }
}
