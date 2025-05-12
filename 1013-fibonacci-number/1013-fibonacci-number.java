class Solution {
    public static int fib(int a) {
        if (a <= 1) return a;
        return fib(a - 1) + fib(a - 2);
    }
    public static void main(String[] args) {
        int a = 8;
        System.out.println("Fibonacci number at position " + a + " is: " + fib(a));
    }
}
