public class GameLogic {
    private boolean isRepeatedLetter = false;
    private UserInput userLetter = new UserInput();
    public void gameStart() {
        GameStatus gameStatus = new GameStatus();
        char currentLetter;
        while (true) {
            HangmanDrawing.drawHangman(gameStatus);
            if (gameStatus.isGameWon()) {
                System.out.println("Вы победили, поздравляю");
                break;
            } else if (gameStatus.isGameLost()) {
                System.out.println("Вы проиграли, повезёт в другой раз\nЗагаданное слово: " + gameStatus.getCurrentWord());
                break;
            }
            if (isRepeatedLetter) {
                System.out.println("Вы уже вводили эту букву");
            }
            currentLetter = userLetter.userInput();
            boolean isGuessLetter = false;
            isRepeatedLetter = false;
            for (int i = 0; i < gameStatus.getCurrentWord().length(); i++) {
                if (gameStatus.getCurrentWord().charAt(i) == currentLetter) {
                    isGuessLetter = true;
                }
            }
            for (int i = 0; i < gameStatus.getCurrentWordStatus().length; i++) {
                if (gameStatus.getCurrentWordStatus()[i].charAt(0) == currentLetter) {
                    isRepeatedLetter = true;
                    break;
                }
            }
            for (int i = 0; i < gameStatus.getMistakeLetters().size(); i++) {
                if (gameStatus.getMistakeLetters().get(i) == currentLetter) {
                    isRepeatedLetter = true;
                    break;
                }
            }
            if (isRepeatedLetter) {

            } else if (!isGuessLetter) {
                gameStatus.setMistakeCounter(gameStatus.getMistakeCounter() + 1);
                gameStatus.getMistakeLetters().add(currentLetter);
            } else {
                for (int i = 0; i < gameStatus.getCurrentWord().length(); i++) {
                    if (gameStatus.getCurrentWord().charAt(i) == currentLetter) {
                        gameStatus.getCurrentWordStatus()[i] = Character.toString(currentLetter);
                    }
                }
            }
        }
    }
}
