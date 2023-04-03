import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> list = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 1));
        for (Integer integer : list) {
            if (!(integer % 2 == 0)) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println("-------------------------------");
    }

    public static void task2() {
        System.out.println("Задача 2");
        Set<Integer> list = new HashSet<>(List.of(10,0,0,0,0,0,0,0,6,4,4,4, 8, 1, 2, 2, 3, 4, 4, 5, 5, 6, 7, 8, 7, 8,2));
        for (Integer integer : list) {
            if (integer % 2 == 0) {
                System.out.print(integer + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------");
    }

    private static void task3() {
        System.out.println("Задача 3");
        List<String> mass = new ArrayList<>(List.of("мама","папа","Мама","Папа","мамам","мама"));
        for (String words :mass) {
            if (Collections.frequency(mass,words)==1) {
                System.out.print(words+" ");
            }
        }
        System.out.println();
        System.out.println("--------------------------------------");
    }

    private static void task4() {
        System.out.println("Задача 4");
        List<String> mass = new ArrayList<>(List.of("мама","папа","Мама","папа","мамам","мама"));
        Map<String,Integer> map = new TreeMap<>();
        for (String words :mass) {
            if (!map.containsKey(words)) {
                map.put(words,1);
            }else {
                map.replace(words,map.get(words)+1);
            }
        }
        int wordsssssss = 0;
        for(Integer count :map.values()){
            if(count>1){
                wordsssssss++;
            }
        }
        System.out.println(wordsssssss);
    }
}