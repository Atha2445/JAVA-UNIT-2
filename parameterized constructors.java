import java.util.*;
import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;
    
    Box(double l,double w, double h){
        length=l;
        width=w;
        height=h;
    }
    double volume(){
        return length*width*height;
    }
}
public class Demo{
    public static void main(String[] args){
    Box mybox1=new Box(5,7,9);
    Box mybox2=new Box(12,24,45);
    double vol;
    vol=mybox1.volume();
    System.out.println("Volume is: "+vol);
    vol=mybox2.volume();
    System.out.println("Volume is: "+vol);
    }
}
