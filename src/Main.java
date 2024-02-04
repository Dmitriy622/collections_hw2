import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("test", "Test", "tEsT", "tesT", "TEST", "teSt", "test", "tEsT", "TEST"));
        task4(List.of("один", "два", "два", "три", "три", "три", "пять", "девять",
                "test", "Test", "tEsT", "tesT", "TEST", "teSt", "test", "tEsT", "TEST"));
    }

    private static void task1(List<Integer> list) {
        System.out.println("Задание 1");
        for (Integer number : list) {
            if (number % 2 == 1) {
                System.out.println(number + " ");
            }
        }
        System.out.println();
    }

    private static void task2(List<Integer> list) {
        System.out.println("Задание 2");
        Set<Integer> set = new TreeSet<>(list);
        for (Integer number : set) {
            if (number % 2 == 0) {
                System.out.println(number + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> words) {
        System.out.println("Задание 3");
        Set<String> uniqueWords = new HashSet<>(words);
        for (String word : uniqueWords) {
            System.out.println(word + " ");
        }
        System.out.println();
    }

    private static void task4(List<String> words) {
        System.out.println("Задание 4");
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 0);
            }
            map.put(word, map.get(word) + 1);
        }
        System.out.println(map);
    }
}