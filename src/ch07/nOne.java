package ch07;
import java.util.*;

public class nOne {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double getdouble;
        double biggest;

        Vector<Double> storage=new Vector<Double>();
        for (int i=0;i<5;i++){
            getdouble=sc.nextDouble();
            storage.add(getdouble);
        }
        biggest=storage.get(0);
        for (int i=1;i<5;i++){
            if (storage.get(i)>biggest) {
                biggest = storage.get(i);
            }
        }
        System.out.print("가장 큰 수는 : "+biggest);
    }
}
