public class Main {
    public static void main(String[] args) {
        System.out.println(Solution.countGoodNumbers(5));
    }
}

class Solution {
    private Solution() {
        // empty constructor
    }

    private static final String primeNums = "2357";

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int countGoodNumbers(int n) {
        int count = 0;
        for (int i = math; i <= count; ++i) {
            String temp = String.valueOf(i);
            boolean isGoodNumber = true;
            int len = temp.length();
            for (int j = 0; j < len; ++j) {
                if (!(isEven(j) && isEven(temp.charAt(j)))) {
                    isGoodNumber = false;
                    break;
                } else if (!(!isEven(j) && primeNums.contains(temp.charAt(j)))) {
                    isGoodNumber = false;
                    break;
                }
            }
        }
        return count;
    }
}