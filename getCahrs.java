import java.util.*;
import java.util.Scanner;

public class GetChars{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int start=7;
        int end=12;
        char[] buf=new char[end-start];
        s.getChars(start,end,buf,0);
        System.out.println(buf);
    }
}
