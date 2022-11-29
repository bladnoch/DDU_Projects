package ch07;

import java.util.*;

public class nFour {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Vector<Integer> height=new Vector<Integer>();
        int save_h=0;
        int year=2000;
        int count=0;
        System.out.println("2000-2009 put height by year >>");
        for (int i = 0;i<10;i++){
            height.add(sc.nextInt());
        }
        for (int i=0; i<9;i++){
            if (save_h<height.get(i+1)-height.get(i)){
                save_h=height.get(i+1)-height.get(i);
                count=i;
            }
        }
        System.out.println("highest increased year is "+(2000+count)+" "+ save_h+"cm");
    }
}
