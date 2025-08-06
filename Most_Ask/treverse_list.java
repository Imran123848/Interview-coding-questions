import java.util.*;


public class treverse_list {

    public static void main(String[] args) {
        List<Integer> al =  Arrays.asList(3,4,5,6,7,8,23,24);
        traverseal(al);

        Set<String> st = new HashSet<>();
        st.add("asdc");
        st.add("asdjf");
        st.add("jfgh");

        traverseset(st);

        HashMap<Integer, String> hm = new HashMap <Integer, String>();
        hm.put(12, "asaf");
        hm.put(11, "sdgdg");
        hm.put(10, "sgssds");
       
        taversehm(hm);
        
    }

    public static void traverseal(List<Integer> list){
        System.out.println("_________________________________");
        // using for each  // it is lambda expression
        list.forEach(ele -> System.out.println(ele) );
        System.out.println("_________________________________");

       // using java-8
        list.forEach(System.out::println);

    }
    public static void traverseset(Set<String> set){
        System.out.println("_________________________________");
        for (String i : set) {
            System.out.println(i);
        }


    }
    public static void taversehm(HashMap<Integer, String> map){
        System.out.println("_________________________________");
        map.forEach((key, value) -> System.out.println(key + " " + value) );


    }
}