import java.util.*;

public class finalEx1 {
    public static void main(String[] args){
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
                System.out.println("activate st_getter");
                tf=false;
                break;
            }
            else{
                in_getter=sc.nextInt();
                w.put(st_getter,in_getter);
                System.out.println("get integer");
            }
        }
        System.out.println("-----------");
        System.out.println("번호   몸무게");
        Set<String> keys=w.keySet();
        Iterator<String> it=keys.iterator();
        while(it.hasNext()){
            String key=it.next();
            Integer value=w.get(key);
            System.out.println(key+"     "+value);
        }
    }
}
