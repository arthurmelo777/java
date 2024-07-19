import java.util.Scanner;

class basico_1001 {
    public static void main (String[] args) {
        Scanner read = new Scanner(System.in);
        int n1 = read.nextInt();
        int n2 = read.nextInt();
        System.out.println(String.format("X = %d", n1+n2));
    }
}