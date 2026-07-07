package sqa.lab;

public class ShiftCipher {
    static final int num_char = 26; 
    
    public String shift(String message, int key){
        if (message == null || message.length() == 0) {
            return "Invalid";
        }

        StringBuilder stbuilder = new StringBuilder();
        char currentChar;
        String upperMessage = message.toUpperCase(); 
        int length = upperMessage.length();

        key = key % num_char;
        if(key < 0){
            key += num_char;
        }

        for(int i = 0; i < length; i++){
            currentChar = upperMessage.charAt(i);
           
            if(currentChar >= 'A' && currentChar <= 'Z'){
                currentChar = (char) (currentChar + key);
                if(currentChar > 'Z'){
                    currentChar = (char) (currentChar - num_char);
                }
                stbuilder.append(currentChar);
            } else {
                stbuilder.append(currentChar);
            }
        }
        return stbuilder.toString();
    }
}
