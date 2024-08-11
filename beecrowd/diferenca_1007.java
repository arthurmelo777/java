import java.util.Scanner;

class diferenca_1007 {
    public static void main (String[] args) {
        int[] nums = new int[4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            nums[i] = s.nextInt();
        }

        System.out.printf("DIFERENCA = %d\n", nums[0] * nums[1] - nums[2] * nums[3]);
    }
}