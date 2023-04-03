import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public class Homework_3 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("string");
        strings.add("40");
        strings.add("-5");
        strings.add("my_string");
        removeIntegers(strings);
        System.out.println(strings); // [string, my_string]
    }
    
    static void removeEvenNumber(List<Integer> numbers) {
        numbers.removeIf(s -> (s % 2) == 0);
        System.out.println(numbers);
    }
    
    static void removeIntegers(List<String> strings) {
        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String next = iter.next();
            try {
                Integer.parseInt(next);
                iter.remove();
            } catch (NumberFormatException e) {

            }
        }
    }
    
    }

