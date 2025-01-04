import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int n = input.length();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = input.charAt(i) - 'A' + 1;
        }

        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + scores[i];
        }

        int totalScore = prefixSum[n];
        int minDifference = Integer.MAX_VALUE;
        int bestSplit = -1;

        for (int i = 1; i < n; i++) {
            int frontScore = prefixSum[i];
            int backScore = totalScore - frontScore;
            int difference = Math.abs(frontScore - backScore);

            if (difference < minDifference || (difference == minDifference && i < bestSplit)) {
                minDifference = difference;
                bestSplit = i;
            }
        }

        int frontScore = prefixSum[bestSplit];
        int backScore = totalScore - frontScore;
        String frontPart = input.substring(0, bestSplit);
        String backPart = input.substring(bestSplit);

        System.out.println(frontScore + " " + backScore);
        System.out.println(frontPart + " " + backPart);
    }
}
