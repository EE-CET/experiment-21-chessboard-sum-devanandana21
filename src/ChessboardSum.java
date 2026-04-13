import java.util.Scanner;

public class ChessboardSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int blackSum = 0;
        int whiteSum = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int val = sc.nextInt();
                if ((i + j) % 2 == 0) {
                    blackSum += val;
                } else {
                    whiteSum += val;
                }
            }
        }

        System.out.println(blackSum);
        System.out.println(whiteSum);

        sc.close();
    }
}
