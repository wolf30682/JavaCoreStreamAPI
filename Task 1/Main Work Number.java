package Work_Number;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Отсортировано без стрима:");
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        intList.removeIf(i -> (i <= 0 | i % 2 != 0 ));
        intList.sort(Comparator.naturalOrder());

        for(Integer intNumber : intList){
            System.out.println(intNumber);
        }
        System.out.println("");
        System.out.println("Отсортировано со стримом:");

        List<Integer> intListStream = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Stream<Integer> stream = intListStream.stream();
        stream
                .filter(x -> x > 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);

    }

}

