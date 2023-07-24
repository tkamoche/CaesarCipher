import org.junit.Test;



public class TestCaesarCipher {
    @Test
    public void testEncryption() {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        int key = 5;

        CaesarCipher cipher = new CaesarCipher(input, key);
        String encryptedText = cipher.encrypt();
        String expectedEncryptedText = "YMJ VZNH PWTBS KTC OZRU TAJW YMJ QFED ITL";


    }

    @Test
    public void testDecryption() {
        String encryptedText = "YMJ VZNH PWTBS KTC OZRU TAJW YMJ QFED ITL";
        int key = 5;

        CaesarCipher cipher = new CaesarCipher(encryptedText, key);
        String decryptedText = cipher.decrypt();
        String expectedDecryptedText = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";


    }

    // Add more test cases to cover other scenarios
}