package ch07;
import java.util.*;


public class nThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String order;
        HashMap<String, Integer> coffee=new HashMap<String, Integer>();
        System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
        coffee.put("에스프레소",2000);
        coffee.put("아메리카노",2500);
        coffee.put("카푸치노",3000);
        coffee.put("카페라떼",3500);
        boolean tf=true;
        while (tf){
            System.out.print("order >>");
            order=sc.next();
            if(order.equals("그만")){
                tf=false;
            }
            else{
                System.out.println(order+"은 "+coffee.get(order)+"입니다.");
            }

        }

    }
}
