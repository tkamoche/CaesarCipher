import static spark.Spark.*;

public class CaesarCipherWebApp {
    public static void main(String[] args) {
        port(4567); // Set the port number

        get("/", (request, response) -> {
            String input = "MANCHESTER UNITED";
            int key = 5;

            CaesarCipher cipher = new CaesarCipher(input, key);
            String encryptedText = cipher.encrypt();
            String decryptedText = cipher.decrypt();

            String html = "<html><body><h1>Caesar Cipher</h1>" +
                    "<p>Input String: " + input + "</p>" +
                    "<p>Encrypted String: " + encryptedText + "</p>" +
                    "<p>Decrypted String: " + decryptedText + "</p></body></html>";
            return html;
        });
    }
}
