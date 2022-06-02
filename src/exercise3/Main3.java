package exercise3;

import java.util.Scanner;

public class Main3 {
    static int Factorial(int n) {
        return (n > 0) ? n * Factorial(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }

        int count = Factorial(nums.length);
        int shift = n - 1;
        int answer = 0;

        while (count > 0) {
            int swapper = nums[shift];
            nums[shift] = nums[shift - 1];
            nums[shift - 1] = swapper;

            int sumOfNums = 0;
            for (int i = 1; i <= n; i ++) {
                sumOfNums += nums[i - 1] * i;
            }

            if (sumOfNums % k == 0){
                answer++;
            }

            count--;
            if (shift < 2) {
                shift = n - 1;
            } else {
                shift--;
            }
        }

        System.out.print(answer);
    }
}
