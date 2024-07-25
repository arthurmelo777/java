import java.util.Scanner;

class media1_1005 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b;
        a = s.nextFloat();
        b = s.nextFloat();
        double media = (double)(a*3.5+b*7.5)/11;
        System.out.printf("MEDIA = %.5f\n", media);
    }
}