// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
    // TODO: Declare private fields
    private int strings;
    private int frets;
    private boolean bowed;

    // TODO: Define mutator methods - 
    //       setNumOfStrings(), setNumOfFrets(), setIsBowed()
    public void setNumOfStrings(int userIn) {
        strings = userIn;
    }
    public void setNumOfFrets(int userIn) {
        frets = userIn;
    }
    public void setIsBowed(boolean userIn) {
        bowed = userIn;
    }


    // TODO: Define accessor methods - 
    //       getNumOfStrings(), getNumOfFrets(), getIsBowed()
    public int getNumOfStrings() {
        return strings;
    }
    public int getNumOfFrets() {
        return frets;
    }
    public boolean getIsBowed() {
        return bowed;
    }

}

