import java.util.*;

public class finalEx1 {
    public static void main(String[] args){
//2-1
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> w=new HashMap<String, Integer>();
        boolean tf=true;
        String item;
        String st_getter;
        Integer in_getter;

        System.out.println("첫번째 HashMap 데이터를 입력하세요 >>> ");

        while (tf){
            st_getter=sc.next();
            if (st_getter.equals("quit")){
                tf=false;
                break;
            }
            else{
                in_getter=sc.nextInt();
                w.put(st_getter,in_getter);
            }
        }
        System.out.println("-----------");
        System.out.println("번호   키");
        Set<String> keys=w.keySet();
        Iterator<String> it=keys.iterator();

        while(it.hasNext()){
            String key=it.next();
            Integer value=w.get(key);
            System.out.println(key+"     "+value);
        }
        System.out.println("-----------");
//2-2
        HashMap<String, Double> h=new HashMap<String, Double>();
        boolean tf2=true;
        String item2;
        String st_getter2;
        Double in_getter2;

        System.out.println("두번째 HashMap 데이터를 입력하세요 >>> ");
        while (tf2){
            st_getter2=sc.next();

            if (st_getter2.equals("quit")){
                tf=false;
                break;
            }
            else{
                in_getter2=sc.nextDouble();
                h.put(st_getter2,in_getter2);
            }
        }
        System.out.println("-----------");
        System.out.println("번호   몸무게");
        Set<String> keys2=h.keySet();
        Iterator<String> it2=keys2.iterator();
        while(it2.hasNext()){
            String key2=it2.next();
            Double value2=h.get(key2);
            System.out.println(key2+"     "+value2);
        }
        System.out.println("-----------");

//2-3

    }
}
