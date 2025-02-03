//How do you check if an element exists in an array?

import java.util.Arrays;

class CheckArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean exists = Arrays.stream(arr).anyMatch(x -> x == 3);
        System.out.println(exists); // true
    }
}
