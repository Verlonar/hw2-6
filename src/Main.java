import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        split();

        //Задание 1
        System.out.println(nums.stream().filter((a) -> a % 2 != 0).collect(Collectors.toList()));
        split();

        //Задание 2
        System.out.println(nums.stream().filter((a) -> a % 2 == 0).collect(Collectors.toSet()));
        split();

        //Задание 3
        List<String> words = new ArrayList<>(List.of("a","b","c","d","e","f","a","a","a","d","c","f"));
        System.out.println(new HashSet<>(words));
        split();

        //Задание 4
        int repeatWordsCount = 0;
        for (String uniqueWord : new HashSet<>(words)) {
            long uniqueWordOccurrencesNumber = words.stream().filter(uniqueWord::equals).count();
            if (uniqueWordOccurrencesNumber > 1) {
                repeatWordsCount += uniqueWordOccurrencesNumber;
            }
        }
        System.out.println(repeatWordsCount);
        split();
    }

    private static void split() {
        System.out.println("-----------------------------");
    }
}