import java.util.Arrays;

public class SortIntegers {

    public static void main(String[] args) {
        String[] players = {"Max", "Alex", "Clementine", "Aurora", "Ciri", "Jhené"};
        int[] scores = {95, 80, 72, 88, 91, 77};

        // ===== FEATURE 1: Sort Scores (Integers) =====
        int[] sortedScores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(sortedScores); // Sorting the scores

        System.out.println("\nScores in ascending order:");
        for (int score : sortedScores) {
            for (int i = 0; i < scores.length; i++) {
                if (scores[i] == score) {
                    System.out.println(players[i] + ": " + score);
                }
            }
        }
    }
}
