import java.util.Scanner;

class areacirculo_1002 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);

        double area, raio = s.nextDouble();

        area = 3.14159 * raio * raio;

        System.out.printf("A=%.4f\n", area);
    }
}