public class Main {
    public static void main(String[] args) {
        boolean gameOver = false;
        MagicWord magic = new MagicWord();
        while (!gameOver){
            System.out.println(magic);
            System.out.println("Enter word or letter");
            String s = input.readString();
            magic.shoot(s);
            if (magic.wins()){
                System.out.println("You win");
                gameOver = true;

            }
        }
    }
}
