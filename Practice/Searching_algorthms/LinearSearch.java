import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6, 8, 9, 4, 6, 8};
        int key = 3;
        boolean option = false;   

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == key) {   // check if element matches key
                option = true;
                break;  // stop searching once key is found
            }
        }

        if (option) {
            System.out.println("Yes, key is present!");
        } else {
            System.out.println("Not found!!");
        }
    }
}
