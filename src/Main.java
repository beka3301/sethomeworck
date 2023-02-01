import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set1.add(1);
        set1.add(7);
        set1.add(3);
        set2.add(0);
        set2.add(4);
        set2.add(5);
        System.out.println(symmetricSetDifference(set1,set2));

    }
    public static Set<Integer> symmetricSetDifference(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> newSet = new HashSet<>();
        newSet.removeAll(set2);
        set2.removeAll(set1);
        newSet.addAll(set2);

        return newSet;
    }



    }
