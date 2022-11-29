import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class finalEx1 {

    public static void main(String[] args){
//2-1
        Scanner sc=new Scanner(System.in);
        HashMap<String, Integer> w=new HashMap<String, Integer>();
        Vector<String> okeys=new Vector<String>();
        Vector<Integer> ovalue=new Vector<Integer>();
        Set<String> keys=w.keySet();

        boolean tf=true;
        System.out.println("첫번째 HASHMAP 데이터를 입력하세요 >>>");

        while(tf) {
            String a = sc.next();
            if (a.equals("quit")) {
                tf = false;
                System.out.println("1) 출력 결과");
                System.out.println("-------------");
                System.out.println("번호\t몸무게");

                Iterator<String> it = keys.iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    okeys.add(key);
                    Integer value = w.get(key);
                    ovalue.add(value);
                    System.out.println(key + '\t' + value);
                }
                System.out.println("-------------");
                break;
            }
            Integer b = sc.nextInt();
            w.put(a, b);
        }
//2-2---------------------------------
        HashMap<String, Double> h=new HashMap<String, Double>();
        Set<String> keys2=h.keySet();

        boolean tf2=true;
        System.out.println("두번째 HASHMAP 데이터를 입력하세요 >>>");

        while(tf2) {
            String aa = sc.next();
            if (aa.equals("quit")) {
                tf2 = false;
                System.out.println("2) 출력 결과");
                System.out.println("-------------");
                System.out.println("번호\t키");
                Iterator<String> it = keys2.iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    Double value = h.get(key);
                    System.out.println(key + "\t" + value);
                }
                System.out.println("-------------");
                break;
            }
            Double bb = sc.nextDouble();
            h.put(aa, bb);
        }

//2-3
        System.out.println("번호\t몸무게\t키");
        for (int i = 0; i< okeys.size();i++){
            Iterator<String> it=keys2.iterator();
            while(it.hasNext()){
                String item=it.next();
                if (okeys.get(i).equals(item)){
                    System.out.println(item+"\t"+ovalue.get(i)+"\t\t"+h.get(item) );
                }
            }
        }
    }
}
