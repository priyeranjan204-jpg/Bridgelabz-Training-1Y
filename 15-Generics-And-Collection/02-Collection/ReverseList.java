package Collection;

import java.util.*;

class ReverseList {
    static <T> void reverse(List<T> list) {
        int i = 0, j = list.size() - 1;
        while (i < j) {
            T temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(a);
        System.out.println(a);

        List<Integer> b = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        reverse(b);
        System.out.println(b);
    }
}