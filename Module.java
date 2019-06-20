import java.util.Scanner;

public abstract class Module {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message to encode: ");
        String msg = scanner.nextLine();
        System.out.println("What offset do you want?\nIf you choose no offset, one will be selected.");
        int offset = scanner.nextInt();

        // encode
        Encode encoder = new Encode(msg, offset);
        int[][] encodedMessage = encoder.encodeMessage();
        System.out.println("Your encoded message is...");
        encoder.printAsciiValues();

        // decode
        Decode decoder = new Decode(encodedMessage);
        System.out.println("\nDecoding your message...");
        System.out.println("Your decoded message is");
        decoder.decodeMessage();
        decoder.printMessage();


    }
}
