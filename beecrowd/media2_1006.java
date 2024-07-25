import java.util.Scanner;

class media2_1006 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        float a, b, c;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        double media = (double)(a*2+b*3+c*5)/10;
        System.out.printf("MEDIA = %.1f\n", media);
    }
}