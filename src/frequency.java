import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class frequency {

    //Q2. Word Frequency Counter
    //Given a list of words, return a map with the frequency of each word.

    //Input: ["apple", "banana", "apple"]
    //Output: {apple=2, banana=1}

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple");

        Map<String, Long> wordFrequency = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordFrequency);
    }

}
