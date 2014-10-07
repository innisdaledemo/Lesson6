public class GuessMachine {
    private int number;
    private int numGuesses;
    private int guess;
    
    public GuessMachine(){
        number=(int)(Math.random()*100)+1;
        guess=0;
        numGuesses=0;
    }
    
    public boolean setGuess(int g){
        boolean okguess=(g>0 && g<=100);
        if (okguess){
            guess=g;
            numGuesses++;
            return true;
        }
        else return false;
    }
    
    public String giveHint(){
        if (guess>number)
            return(guess + " is too high, guess lower.");
        else if(guess<number)
            return(guess + " is too low, guess higher");
        else
            return "You got it!";
    }
    
    public int getNumGuesses(){
        return numGuesses;
    }
    
    
    //to do - add methods:
    //giveHint(), setGuess(), getNumGuesses()
}
