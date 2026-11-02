import java.util.*;
import java.util.stream.Collectors;

class StreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
    
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream().filter(x->x%2==0).forEach(System.out::println);

        List<Integer> nums = Arrays.asList(12,23,1,2,34,4,6,14);
        nums.stream().sorted().forEach(System.out::println);

        List<String> namesList = Arrays.asList("Alice", "Bob", "Alice", "David", "Bob");
        namesList.stream().distinct().forEach(System.out::println);

        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numList.stream().reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        List<Integer> numList2 = Arrays.asList(1, 2, 3, 4, 5);
        numList2.stream().map(x -> x * x).forEach(System.out::println);

        List<String> nameList = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");
        nameList.stream().limit(3).forEach(System.out::println);

        List<Integer> numList3 = Arrays.asList(1, 2, 3, 4, 5);
        numList3.stream().filter(x->x%2==0).map(x->x*x).collect(Collectors.toList()).forEach(System.out::println);
        }

}
