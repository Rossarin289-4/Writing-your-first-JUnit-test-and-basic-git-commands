package sqa.lab;

public class ShiftCipher {
	
	static final int num_char = 26;    //number of elements in the set (all characters in the set)
	
	public String shift(String message, int key){
		
        if (message == null || message.length() == 0) {
            return "Invalid";
        }

        StringBuilder stbuilder = new StringBuilder();
        char currentChar;
        
        //แปลงตัวพิมพ์์เล็ก -> ตัวพิมพ์ใหญ่
        String upperMessage = message.toUpperCase(); 
        int length = upperMessage.length();

        key = key%num_char;
        //key ให้อยู่ในช่วง 0 ถึง 25
        if(key < 0){
            key += num_char;
        }

        for(int i = 0; i < length; i++){
            currentChar = upperMessage.charAt(i);
           
            //อยู่ในช่วง A-Z
            if(currentChar >= 'A' && currentChar <= 'Z'){
                currentChar = (char) (currentChar + key);
                //เกิน Z เริ่มต้นที่ A ใหม่
                if(currentChar > 'Z'){
                    currentChar = (char) (currentChar - num_char);
                }
                stbuilder.append((char) (currentChar + key));
            }else {
                //มีตัวเลขให้คงไว้
                stbuilder.append(currentChar);
            }
        }
        return stbuilder.toString();
    }
}
