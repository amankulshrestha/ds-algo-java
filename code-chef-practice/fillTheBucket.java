import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int T = sc.nextInt();
            for(int i = 0; i < T; i++) {
                int K = sc.nextInt();
                int X = sc.nextInt();
                System.out.println(K-X);
            }
        }
    }
}