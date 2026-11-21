package ua.opnu;
import java.util.*;
public class Task {

    public static void removeShorterStrings(List<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).length() <= list.get(i + 1).length()) {
                list.remove(i);
            } else {
                list.remove(i + 1);
            }
        }
    }

    public static void stutter(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            list.add(i + 1, list.get(i));
        }
    }

    public static void switchPairs(List<String> list) {
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }

    public static void removeDuplicates(List<String> list) {
        for (int i = 1; i < list.size();) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static void markLength4(List<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() == 4) {
                list.add(i, "****");
            }
        }
    }

    public static boolean isPalindrome(Queue<Integer> queue) {
        int size = queue.size();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            int value = queue.remove();
            if (i < size / 2) stack.push(value);
            queue.add(value);
        }

        boolean result = true;
        int middle = (size + 1) / 2;

        for (int i = 0; i < size; i++) {
            int value = queue.remove();
            if (i >= middle && value != stack.pop())  {
                result = false;
            }
            queue.add(value);
        }

        return result;
    }

    public static void reorder(Queue<Integer> queue) {
        int size = queue.size();
        int positiveCount = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            int value = queue.remove();
            if (value < 0) {
                stack.push(value);
            } else {
                queue.add(value);
                positiveCount++;
            }
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        for (int i = 0; i < positiveCount; i++) {
            queue.add(queue.remove());
        }
    }

    public static void rearrange(Queue<Integer> queue) {
        int size = queue.size();
        ArrayDeque<Integer> odd = new ArrayDeque<>();

        for (int i = 0; i < size; i++) {
            int value = queue.remove();
            if (value % 2 == 0) {
                queue.add(value);
            } else {
                odd.add(value);
            }
        }

        while (!odd.isEmpty()) {
            queue.add(odd.remove());
        }
    }

    public static int maxLength(Set<String> set) {
        int max = 0;
        for (String value : set) {
            max = Math.max(max, value.length());
        }
        return max;
    }

    public static void removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0) {
                iterator.remove();
            }
        }
    }

    public static int numInCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> common = new HashSet<>(list1);
        common.retainAll(list2);
        return common.size();
    }

    public static boolean isUnique(Map<String, String> map) {
        return new HashSet<>(map.values()).size() == map.size();
    }

    public static Map<String, String> intersect(Map<String, String> map1, Map<String, String> map2) {
        Map<String, String> result = new HashMap<>();

        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && Objects.equals(map1.get(key), map2.get(key))) {
                result.put(key, map1.get(key));
            }
        }

        return result;
    }

    public static Map<String, Integer> reverse(Map<Integer, String> map) {
        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            result.put(entry.getValue(), entry.getKey());
        }

        return result;
    }

    public static Integer rarest(Map<String, Integer> map) {
        if (map.isEmpty()) return null;

        Map<Integer, Integer> counts = new HashMap<>();

        for (int value : map.values()) {
            counts.put(value, counts.getOrDefault(value, 0) + 1);
        }

        Integer result = null;
        int min = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            int value = entry.getKey();
            int count = entry.getValue();

            if (count < min || (count == min && value < result)) {
                min = count;
                result = value;
            }
        }

        return result;
    }

    public static int maxOccurrences(List<Integer> list) {
        Map<Integer, Integer> counts = new HashMap<>();
        int max = 0;

        for (int value : list) {
            int count = counts.getOrDefault(value, 0) + 1;
            counts.put(value, count);
            max = Math.max(max, count);
        }

        return max;
    }
}
