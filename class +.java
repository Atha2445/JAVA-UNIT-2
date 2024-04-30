import java.util.*;
import java.util.Scanner;

class Box{
    double length;
    double width;
    double height;
    
    double volume(){
        return length*width*height;
    }
    void setDim(double l,double w,double h){
        length=l;
        width=w;
        height=h;   
    }
}

public class BoxDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        
        mybox1.setDim(24,45,12);
        mybox2.setDim(7,4,10);
        
        vol=mybox1.volume();
        System.out.println("Volume: "+vol);
        
        vol=mybox2.volume();
        System.out.println("Volume: "+vol);
    }
}
