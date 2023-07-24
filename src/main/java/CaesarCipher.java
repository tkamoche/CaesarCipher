public class CaesarCipher {
    private final String input;
    private final int key;

    public CaesarCipher(String input, int key) {
        this.input = input;
        this.key = key;
    }

    public String encrypt() {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                int shifted = (c - base + key) % 26;
                char encryptedChar = (char) (base + shifted);
                result.append(encryptedChar);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public String decrypt() {
        // To implement decryption, we use the negative of the key to shift in the opposite direction
        return new CaesarCipher(input, 26 - key).encrypt();
    }
}