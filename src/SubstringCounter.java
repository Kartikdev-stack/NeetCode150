import java.util.Scanner;

public class SubstringCounter {
    public static int countValidSubstrings(String s, int minLength, int maxLength) {
        int n = s.length();
        int count = 0;

        // Count alternating sequences
        int[] altSeq = new int[n];
        altSeq[0] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                altSeq[i] = altSeq[i-1] + 1;
            } else {
                altSeq[i] = 1;
            }
        }

        // Count valid substrings
        for (int i = 0; i < n; i++) {
            for (int length = minLength; length <= Math.min(maxLength, altSeq[i]); length++) {
                if (i - length + 1 >= 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String s = scanner.nextLine().trim();
        int minLength = scanner.nextInt();
        int maxLength = scanner.nextInt();

        // Calculate and print result
        int result = countValidSubstrings(s, minLength, maxLength);
        System.out.println(result);

        scanner.close();
    }
}
