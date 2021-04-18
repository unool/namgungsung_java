import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ch11_22 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("김");
        collection.add("영");
        collection.add("현");


        Iterator iterator = collection.iterator();

        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
        //iterator의 커서가 3을 가리키므로 (실제 크기보다 큰)
        while(iterator.hasNext()) //해당 반복문에서 출력 될거 없음
        {
            System.out.println(iterator.next());
        }

        System.out.println("=====================");
        Iterator iterator2 = collection.iterator();
        while(iterator2.hasNext()) //해당 반복문에서 출력 될거 없음
        {
            System.out.println(iterator2.next());
        }


        collection = new HashSet(); //같은 Collection을 상속받은 클래스이기 때문에 HashSet을 new 해서 할당하여도 전혀 문제없음
        collection.add("김");
        collection.add("영");
        collection.add("현");
        System.out.println("==========HashSet===========");
        Iterator iterator3 = collection.iterator();
        while(iterator3.hasNext()) //해당 반복문에서 출력 될거 없음
        {
            System.out.println(iterator3.next());
        }

//        collection = new HashMap<String,Object>();  //HashMap은 Collection을 구현한 클래스가 아니므로 에러.
        HashMap map = new HashMap<String, Object>(); //HashMap 참조변수에 일단 담고

        map.put("제",new Object());
        map.put("뉴",new Object());
        map.put("어",new Object());
        map.put("리",new Object());

        System.out.println("==========HashMap===========");

        Iterator mapIterator = map.entrySet().iterator(); //entrySet() 메소드를 이용하여 한번 걸러서 가져와야 함.
        while(mapIterator.hasNext()) //해당 반복문에서 출력 될거 없음
        {
            System.out.println(mapIterator.next()); //출력시 put 순서대로 출력되지 않음.
        }
    }
}
