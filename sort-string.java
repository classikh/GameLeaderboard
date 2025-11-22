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