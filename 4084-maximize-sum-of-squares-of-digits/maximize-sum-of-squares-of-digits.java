class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if (sum < 0 || sum > 9 * num) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int remaining = sum;

        for (int i = 0; i < num; i++) {
            int digit = Math.min(9, remaining);
            result.append(digit);
            remaining -= digit;
        }

        return result.toString();
    }
}