# Go Fish Console Game Activity

## Objective
The goal of this project is to create a **Go Fish** console game. This game will allow a single player to play against an AI opponent, with the AI making non-random guesses when possible.

## Requirements
The application should support the following functionalities:
- **Single Player Mode**: The player competes against an AI opponent.
- **Card Display**: The player's cards should be shown to the user.
- **AI Logic**: The AI should make non-random guesses for cards when possible.

## Stretch Goals
To enhance the functionality, implement the following features:
- **Multiplayer Mode**: Allow multiple players to play against each other with protections in place to prevent cheating (e.g., players cannot view each other's cards).
- **Colored Terminal Messages**: Add colors to the terminal messages to indicate different game states, such as correct guesses, AI guesses, wins, losses, etc.

## Instructions
### Define the Resources Needed for this Application:
- Organize your code into Classes
- Create a method to initialize the game and deal cards.
- Create a method to display the player's cards.
- Create a method for the player's turn to guess a card.
- Create a method for the AI's turn to guess a card.
- Create a method to check for matches and update the game state.
- Create a method to display the game results.

### Implement Game Logic:
- Implement the logic for dealing cards and initializing the game.
- Implement the player's turn logic, including input handling and card guessing.
- Implement the AI's turn logic, ensuring non-random guesses when possible.
- Implement the logic for checking matches and updating the game state.
- Implement the logic for displaying the game results.

### Add Multiplayer Mode (Stretch Goal):
- Develop a method to handle multiple players, ensuring that players cannot view each other's cards.
- Implement the logic for switching turns between players.
- Ensure that the game state is updated correctly for multiple players.

### Add Colored Terminal Messages (Stretch Goal):
- Use a library or custom code to add colors to terminal messages.
- Implement colored messages for different game states, such as correct guesses, AI guesses, wins, losses, etc.

### Testing:
- Test the game with various scenarios to ensure accuracy and fairness.
- Verify the AI's non-random guessing logic.
- Test the multiplayer mode to ensure that players cannot cheat.
- Test the colored terminal messages to ensure they display correctly.

## OOP Suggestions for Go Fish
- **Player and AI Classes**: Create separate classes for the player and AI, each with their own methods for taking turns and making guesses. This keeps the game logic clean and organized. You can streamline the creation of these classes by having them inherit shared behaviors from a parent Class or Interface
- **Card and Deck Classes**: By creating classes for cards and the deck you can encapsulate all related functionality, such as shuffling and dealing, within these classes. This simplifies the main game logic.
- **Game State Management**: You can create a Game class to manage the overall state of the game, including player turns, score tracking, and game results. This centralizes the game management and makes it easier to control the flow of the game.

## Starting Code
```java
// this is just an example for the game manager: you can create and import other custom classes as well to facilitate the game
import java.util.*;

public class GoFishGame {

    public static void main(String[] args) {
        initializeGame();
        // Main game loop
    }

    public static void initializeGame() {
        // Initialize the game and deal cards
    }

}
