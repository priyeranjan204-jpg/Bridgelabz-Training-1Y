import java.util.*;

public class SL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int md = 10;
        int[] d = new int[md];
        int index = 0;
        while (num != 0 && index < md) {
            d[index++] = num % 10;
            num /= 10;
        }
        int l = 0, sl = 0;
        for (int i = 0; i < index; i++) {
            if (d[i] > l) {
                sl = l;
                l = d[i];
            } else if (d[i] > sl && d[i] != l) {
                sl = d[i];
            }
        }
        System.out.println("Largest digit = " + l);
        System.out.println("Second largest digit = " + sl);
    }
}
