import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //{1, 3, 5, 7, 9, 11, 13}
        // Harmonik ortalama 1 + 1/1 + 1/3 + 1/5 + ...
        int[] arr = new int[]{1, 3, 5, 7, 9, 11, 13};
        double harAverage = 1;

        for (int i : arr){
            harAverage += 1.0/i;
        }
        System.out.println("Dizinin harmonik ortalaması: " + arr.length / harAverage);
    }
}