public class GuessMachine {
    private int number;
    private int numGuesses;
    private int guess;
    
    public GuessMachine(){
        number=(int)(Math.random()*100)+1;
        guess=0;
        numGuesses=0;
    }
    //to do - add methods:
    //giveHint(), setGuess(), getNumGuesses()
}
