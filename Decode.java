import java.lang.StringBuilder;

class Decode {

    private StringBuilder builder = new StringBuilder();
    private int[][] asciiListValues;

    Decode(int[][] asciiList) {
        this.asciiListValues = asciiList;
    }

    void decodeMessage() {

        for(int l[]: asciiListValues) {
            builder.append((char)l[0]);
        }
    }

    void printMessage() {

        System.out.println(builder.toString());
    }


}
