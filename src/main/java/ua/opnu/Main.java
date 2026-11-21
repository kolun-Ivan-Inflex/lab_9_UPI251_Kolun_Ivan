
package ua.opnu;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("a", "abcd", "cat", "dog"));
        Task.removeShorterStrings(list1);
        System.out.println("1: " + list1);

        List<String> list2 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        Task.stutter(list2);
        System.out.println("2: " + list2);

        List<String> list3 = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        Task.switchPairs(list3);
        System.out.println("3: " + list3);

        List<String> list4 = new ArrayList<>(Arrays.asList("a", "a", "b", "b", "c"));
        Task.removeDuplicates(list4);
        System.out.println("4: " + list4);

        List<String> list5 = new ArrayList<>(Arrays.asList("test", "hello", "java"));
        Task.markLength4(list5);
        System.out.println("5: " + list5);

        Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 2, 1));
        System.out.println("6: " + Task.isPalindrome(queue1));

        Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(1, 2, -2, 4, -5, 8, -8, 12, -15, 23));
        Task.reorder(queue2);
        System.out.println("7: " + queue2);

        Queue<Integer> queue3 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        Task.rearrange(queue3);
        System.out.println("8: " + queue3);

        Set<String> set1 = new HashSet<>(Arrays.asList("cat", "elephant", "dog"));
        System.out.println("9: " + Task.maxLength(set1));

        Set<String> set2 = new HashSet<>(Arrays.asList("cat", "book", "java", "dog"));
        Task.removeEvenLength(set2);
        System.out.println("10: " + set2);

        System.out.println("11: " + Task.numInCommon(
                Arrays.asList(1, 2, 2, 3),
                Arrays.asList(2, 3, 4)));

        Map<String, String> map1 = new HashMap<>();
        map1.put("a", "one");
        map1.put("b", "two");
        System.out.println("12: " + Task.isUnique(map1));

        Map<String, String> map2 = new HashMap<>();
        map2.put("a", "one");
        map2.put("b", "different");
        System.out.println("13: " + Task.intersect(map1, map2));

        Map<Integer, String> map3 = new HashMap<>();
        map3.put(1, "one");
        map3.put(2, "two");
        System.out.println("14: " + Task.reverse(map3));

        Map<String, Integer> map4 = new HashMap<>();
        map4.put("a", 5);
        map4.put("b", 2);
        map4.put("c", 5);
        map4.put("d", 3);
        System.out.println("15: " + Task.rarest(map4));

        System.out.println("16: " + Task.maxOccurrences(
                Arrays.asList(1, 2, 2, 3, 2, 4, 4)));
    }
}
