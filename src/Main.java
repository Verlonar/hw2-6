import java.util.*;
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
        for (String uniqueWord : new HashSet<>(words)) {
            long uniqueWordOccurrencesNumber = words.stream().filter(uniqueWord::equals).count();
            if (uniqueWordOccurrencesNumber > 1) {
                System.out.println(uniqueWordOccurrencesNumber);
            }
        }
        split();

        //Задание 5
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) == 0) {
                continue;
            }
            if (nums.stream().filter(nums.get(i)::equals).count() > 1) {
                int num = nums.get(i);
                for (int j = 0; j < nums.size(); j++) {
                    if (nums.get(j) == num) {
                        nums.set(j, 0);
                    }
                }
            } else {
                nums.set(i, 1);
            }
        }
        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
        split();

        //Задание 6
        List<String[]> wordsPairs = new ArrayList<>();
        wordsPairs.add(new String[]{"ab", "abba"});
        wordsPairs.add(new String[]{"ab", "ab"});
        wordsPairs.add(new String[]{"abc", "ab"});
        wordsPairs.add(new String[]{"abc", "abccba"});

        for (String[] wordsPair : wordsPairs) {
            wordsCharsEquals(wordsPair);
        }
        split();

        //Задание 7
        wordsPairs.clear();
        wordsPairs.add(new String[]{"abc", "bca"});
        wordsPairs.add(new String[]{"abbc", "bca"});
        wordsPairs.add(new String[]{"cat", "act"});
        wordsPairs.add(new String[]{"cat", "dog"});

        for (String[] wordsPair : wordsPairs) {
            if (wordsPair[0].length() != wordsPair[1].length()) {
                System.out.println(false);
            } else {
                wordsCharsEquals(wordsPair);
            }
        }
        split();
    }

    private static void wordsCharsEquals(String[] wordsPair) {
        Set<String> set1 = new TreeSet<>(List.of(wordsPair[0].split("")));
        Set<String> set2 = new TreeSet<>(List.of(wordsPair[1].split("")));
        System.out.println((set1).equals(set2));
    }

    private static void split() {
        System.out.println("-----------------------------");
    }


}