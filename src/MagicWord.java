import java.util.Random;


public class MagicWord {


    private static final String[] palabras = {

            "Ugo", "davitillo", "Llacero", "andreu", "Nicolapas", "mamahuevo", "Nicochapas"
    };
    private String hiddenword;
    private boolean[] correctLetters;


    public MagicWord() {
        int palabraAleatoria = (int) (Math.random() * palabras.length);
        hiddenword = palabras[palabraAleatoria];
        correctLetters = new boolean[hiddenword.length()];
        for (int i = 0; i < correctLetters.length; i++) {
            correctLetters[i] = false;
        }


    }


    @Override
    public String toString() {
        String S = "";
        for (int i = 0; i < correctLetters.length; i++) {
            if (correctLetters[i]) {
                S += hiddenword.charAt(i);
            } else {
                S += "_";
            }


        }
        return S;
    }
    public boolean wins() {
        for (int i = 0; i < correctLetters.length; i ++){
            if(!correctLetters[i]){
                return false;
            }
        }
        return true;
    }

    public void shoot(String wordOrLetter) {
        if (wordOrLetter.length() == 1) {
            for (int i = 0; i < hiddenword.length(); i++){
                if(wordOrLetter.charAt(0) == hiddenword.charAt(i)){
                    correctLetters[i] = true;
                }
            }

        } else {
            if (hiddenword.equals(wordOrLetter)){
                for (int i = 0; i < correctLetters.length; i++){
                    correctLetters[i] = true;
                }
            }
        }
    }
}
