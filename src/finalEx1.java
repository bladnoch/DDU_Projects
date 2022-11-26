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
        Vector<String> key_getter=new Vector<String>(); //<---add로 key를 넣기 위한 리터럴
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
        System.out.println("번호   몸무게");
        Set<String> keys=w.keySet();
        Iterator<String> it=keys.iterator();

        while(it.hasNext()){
            String key=it.next();
            Integer value=w.get(key);
            key_getter.add(key);                  //<---key_getter에 add로 키 넣기

            System.out.println(key+"     "+value);
        }
        Iterator<String> kg=key_getter.iterator();//<--- 사용을 위해 준비
        String fst[]=new String[key_getter.size()]; //<--- 배열 크기 설정

        //System.out.println("b.length="+fst.length); //<--- 배엿 사이즈 테스트용

        int i=0;                                  //<--- 배열 저장을 위한 숫자
        while(kg.hasNext()){                      //<--- 반복문으로 key_getter를 fst[]에 저장
            fst[i]=kg.next();                       //<--- "
            i+=1;                                 //<--- "
        }                                         //<--- "

        //System.out.println(fst[0]+fst[1]+fst[2]);       //<---배열에 값 확인 테스트용

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
        System.out.println("번호   키");

        Set<String> keys2=h.keySet();
        Iterator<String> it2=keys2.iterator();

        while(it2.hasNext()){
            String key2=it2.next();
            Double value2=h.get(key2);
            System.out.println(key2+"     "+value2);
        }
        System.out.println("-----------");

//2-3
        Iterator<String> checker=keys2.iterator();
        System.out.println("-----------");
        System.out.println(("번호  몸무게  키"));
        while(checker.hasNext()){
            String key2=checker.next();
            Double value2=h.get(key2);
            for (int a=0;a<fst.length;a++){
                if (fst[a].equals(key2)){
                    System.out.println(key2+"    "+w.get(fst[a])+"    "+value2);
                    break;
                }
            }
        }
        System.out.println("-----------");
    }
}
