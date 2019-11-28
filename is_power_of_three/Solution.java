class Solution {
    public boolean isPowerOfThree(int n) {
        double tolerance = 1E-10;
        double num = Math.log(n) / Math.log(3);
        return Math.abs(Math.round(num) - num) < tolerance;
    }
}