import java.util.ArrayList;//masivis dinamiurad cvlilebistvis
import java.util.List;//elementis mititebis poziciis kontrolistvis

public class Main {

    public static boolean isPalindrome(int num) {//vigebt reijshi romelia palindromebi
        String numStr = Integer.toString(num);
        String reversed = new StringBuilder(numStr).reverse().toString();
        return numStr.equals(reversed);
    }
    public static int[] palindromicSquaresInRange(int start, int end) {//vigebt romeli palindromebis kvadratia isev palindromi
        List<Integer> result = new ArrayList<>();
        for (int num = start; num <= end; num++) {
            if (isPalindrome(num)) {
                int square = num * num;
                if (isPalindrome(square)) {
                    result.add(num);
                }
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int startRange = 10;
        int endRange = 200;

        int[] palindromicSquares = palindromicSquaresInRange(startRange, endRange);

        System.out.println("Palindromic numbers in the given range with palindromic squares:");
        for (int num : palindromicSquares) {
            System.out.println(num);
        }
    }
}