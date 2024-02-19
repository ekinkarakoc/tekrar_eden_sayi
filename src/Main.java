import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 1};
        int[] dublicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if( i!= j && list[i] == list[j]){
                    dublicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}