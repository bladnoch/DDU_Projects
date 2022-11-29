package ch07;
import java.util.*;

public class nTwo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String getg;

        ArrayList<String> Alp_grade=new ArrayList<String>();

        System.out.println("give five grades(A/B/C/D/F) >>");
        for ( int i = 0; i<5;i++){
            getg=sc.next();
            Alp_grade.add(getg);
        }
        for ( int i = 0; i<5;i++){
            if (Alp_grade.get(i).equals("A")){
                System.out.print(4.0+" ");
            }
            else if(Alp_grade.get(i).equals("B")){
                System.out.print(3.0+" ");
            }
            else if(Alp_grade.get(i).equals("C")){
                System.out.print(2.0+" ");
            }
            else if(Alp_grade.get(i).equals("D")){
                System.out.print(1.0+" ");
            }
            else{
                System.out.print(0.0+" ");
            }
        }

    }
}
