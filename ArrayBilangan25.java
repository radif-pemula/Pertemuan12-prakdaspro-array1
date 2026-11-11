import java.util.Arrays;

public class ArrayBilangan25 {
    public static void main(String[] args) {
        int[] bilangan = new int[4];

        bilangan[0] = 5;
        bilangan[1] = 13;
        bilangan[2] = -7;
        bilangan[3] = 17;

        for (int i = 0; i < bilangan.length; i++) {
            System.out.println("bilangan[" + i + "] = " + bilangan[i]);

        }
        for (int nilai : bilangan) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bilangan));
    }
}