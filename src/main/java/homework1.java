import java.util.Random;

public class homework1 {
     public static void main(String[] args) {
            int[][] num = new int[5][5];
            Random rnd = new Random();
            for (int i = 0; i < num.length; i++) {
                for (int j = 0; j < num[i].length; j++) {
                    num[i][j] = rnd.nextInt(10) + 1;
                }
            }
            for (int i = 0; i < num.length; i++, System.out.println()) {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
                }
            }
            int max = num[0][0];
            for (int i = 0; i < num.length; i++) {
                if (max < num[num.length - 1 - i][i]) {
                    max = num[num.length - 1 - i][i];
                }
            }
            System.out.println(max);
            int min = num[0][0];
            for (int i = 0; i < num.length; i++) {
                min = Math.min(num[i][i], min);
            }
            System.out.println(min);


            int delta = Integer.MAX_VALUE;
            int index = 0;
            int aver = (max + min) / 2;
            for (int i = 0; i < num.length; i++) {
                int d = Math.abs(num[i][i] - aver);
                if (d < delta) {
                    delta = d;
                    index = i;
                }
            }
            System.out.println("среднее арифметическое чисел равно: " + num[index]);
        }
    }

