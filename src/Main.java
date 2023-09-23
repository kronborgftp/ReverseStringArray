import java.util.Arrays;

public class Main {

    public class ReverseString {
        public static void reverseString(char[] s) {
            int left = 0;
            int right = s.length - 1;

            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            char[] input1 = {'h', 'e', 'l', 'l', 'o'};
            char[] input2 = {'H', 'a', 'n', 'n', 'a', 'h'};

            reverseString(input1);
            reverseString(input2);

            System.out.println(Arrays.toString(input1)); // Output: ["o","l","l","e","h"]
            System.out.println(Arrays.toString(input2)); // Output: ["h","a","n","n","a","H"]
        }
    }

}
