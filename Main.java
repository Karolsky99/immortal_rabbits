import java.util.*;
public class Main {
    static int HowManyRabbits (int n, int k) {
        int sum = 2;
        for (int i = 0; i < n; i++) {
            sum += (int)(sum/2)*k;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(HowManyRabbits(2,3));
        System.out.println(HowManyRabbits(3,2));
    }
}
