import java.util.Random;

public class homework1 {

 public static void main(String[] args) {
        int[][] array = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(30) + 1;
            }
        }
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
 }


