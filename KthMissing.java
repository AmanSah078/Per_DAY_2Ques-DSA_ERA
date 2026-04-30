package Per_Day_2Ques;
public class KthMissing {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        int i = 0;          // array pointer
        int current = 1;    // number we are checking

        while (true) {
            // agar current array me hai
            if (i < arr.length && arr[i] == current) {
                i++;  // next element
            } else {
                k--;  // missing mila
                if (k == 0) {
                    System.out.println(current);
                    break;
                }
            }
            current++; // next number check karo
        }
    }
}