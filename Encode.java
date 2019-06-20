import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Encode extends Module {

    // user input values
    private String message;
    private int offset = 0;

    // other
    protected int[][] asciiListValues;

    Encode(String message, int offset) {
        this.message = message;
        this.offset = offset;
    }

    // if offset = 0, assign a different random value to add to each ascii value and store in array
    int createRandomOffset() {

        return ThreadLocalRandom.current().nextInt(1, 10000);
    }

    int[][] encodeMessage() {

        char[] stringToChar = message.toCharArray();
        asciiListValues = new int[stringToChar.length][2];

        if(offset > 0) {
            for(int i = 0; i < asciiListValues.length; i++) {
                int value = (int) stringToChar[i];
                asciiListValues[i][0] = value;
                asciiListValues[i][1] = offset + value;
            }
        }

        if(offset == 0) {
            for(int i = 0; i < asciiListValues.length; i++) {
                int randInt = createRandomOffset();
                int charValueInMessage = stringToChar[i];
                asciiListValues[i][0] = (int)stringToChar[i];
                asciiListValues[i][1] = createRandomOffset();
            }
        }
        return asciiListValues;
    }

    void printAsciiValues() {

        for(int l[]: asciiListValues) {
            for(int i = 0; i < l.length; i+=2) {
                //System.out.print( "(" + (char)l[i] +  " " + ((char)l[i+1]) + ")");
                System.out.print(l[i+1]);
            }
        }
    }
}

