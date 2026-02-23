import java.util.ArrayList;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        for(int x: list){
            System.out.println(x);
        }
        System.out.println(list.contains(5));
        System.out.println(list.contains(50));

        list.remove(2);
        for(int x: list){
            System.out.println(x);
        }
        list.add(2, 50);

        for(int x: list){
            System.out.println(x);
        }

        list.add(1); // 0
        list.add(5); // 1
        list.add(80); // 2

        list.set(2, 50);

        System.out.println(list);


//        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        /*List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 = Arrays.asList("Monday", "Tuesday");
        System.out.println(list1.getClass().getName());
        list1.set(1, "Wednesday");
        System.out.println(list1.get(1));

        String[] array = {"Apple", "Banana", "Cherry"};
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List<String> list4 = new ArrayList<>(list2);
        list4.add("Mango");
        System.out.println(list4);


        List<Integer> list3 = List.of(1, 2, 3, 4);
        list3.set(1, 33);
        // removing first occurence

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(Integer.valueOf(1));
        System.out.println(list);

                Object[] array = list.toArray();
        Integer[] array1 = list.toArray(new Integer[0]);


        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a, b) -> b.length() - a.length());
        System.out.println(words);


        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);

        list.sort((a, b) -> b - a);
        System.out.println(list);*/
        
    }
}
