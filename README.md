# GameLeaderboard

A simple Java program about a Game Leaderboard demonstrating a **sortable array** with two independent features.  
Git exercise | INFO 4190 - Integration Project I.

---

## Players and Scores

| Player      | Score |
|------------ |------ |
| Max         | 85    |
| Alex        | 92    |
| Clementine  | 78    |
| Aurora      | 90    |
| Ciri        | 88    |
| Jhené       | 95    |

---

## Features

### Feature 1: Sort Scores (Integers)
- Sorts the player scores in **ascending order**.
- Displays each player with their corresponding score.
- Located in branch: `sort-integers`.

### Feature 2: Sort Player Names (Strings)
- Sorts player names **alphabetically**.
- Displays each player name.
- Located in branch: `sort-strings`.

### Feature 3: Feature Selection (Branching)
- Main program allows the user to **choose which feature to run** via console input.
- Located in branch: `main` (or `master`).

---

CODE: 

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
