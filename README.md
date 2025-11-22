/name/
# GameLeaderboard
Game Leaderboard - Sortable Java Array with Two Independent Features - Git Exercise (INFO 4190)
//Have a nice weekend!
import java.util.Arrays;
import java.util.Scanner;

public class GameLeaderboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Player names and scores
        String[] players = {"Max", "Alex", "Clementine", "Aurora", "Ciri", "Jhené"};
        int[] scores = {85, 92, 78, 90, 88, 95}; // Random scores

        // ===== FEATURE SELECTION (Branching) =====
        System.out.println("=== Game Leaderboard ===");
        System.out.println("Choose a feature to run:");
        System.out.println("1 - Sort scores");
        System.out.println("2 - Sort player names alphabetically");

        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline

        // ===== FEATURE 1: Sort Scores (Integers) =====
        if (choice == 1) {
            int[] sortedScores = Arrays.copyOf(scores, scores.length);
            Arrays.sort(sortedScores); // Sorting the scores

            System.out.println("\nScores in ascending order:");
            for (int score : sortedScores) {
                for (int i = 0; i < scores.length; i++) {
                    if (scores[i] == score) {
                        System.out.println(players[i] + ": " + score); // Display player name with score
                    }
                }
            }

        // ===== FEATURE 2: Sort Player Names (Strings) =====
        } else if (choice == 2) {
            String[] sortedPlayers = Arrays.copyOf(players, players.length);
            Arrays.sort(sortedPlayers); // Sorting player names alphabetically

            System.out.println("\nPlayer names in alphabetical order:");
            for (String player : sortedPlayers) {
                System.out.println(player);
            }

        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
