package com.wpc.typeConverters;

public class NumConverter {
    public static int binaryToInt(String binaryString) {
        int base10Value = 0;
        int binaryLength = binaryString.length();

        for(int i = 0; i<binaryLength; i++){
            char digit = binaryString.charAt(i);
            if(digit == '1'){base10Value += Math.pow(2,binaryLength - 1 - i);} 
            else if(digit != '0'){throw new IllegalArgumentException("Invalid Binary Inputted");}
        }
        return base10Value;
    }
    public static String intToBinary(int num) {
        String s="";
        for(int i=31 ;i>=0 ;i--) {
            s=(((num & 1)>0)?"1":"0")+s;
            num>>=1;
        }
        return s;
    }
    
    public static String binaryToHex(String binaryString){
        int length = binaryString.length();
        if(length % 4 !=0){
            int padding = 4 - (length % 4);
            StringBuilder paddedBinary = new StringBuilder(binaryString);
            for(int i = 0; i<padding; i++){paddedBinary.insert(0,'0');}
                binaryString = paddedBinary.toString();
            }
        StringBuilder hexStringBuilder = new StringBuilder();
        for(int i = 0; i<binaryString.length(); i += 4){
            String n = binaryString.substring(i,i+4);
            int decimalValue = Integer.parseInt(n,2);
            String hexDigit = Integer.toHexString(decimalValue);
            hexStringBuilder.append(hexDigit);
        }
        return hexStringBuilder.toString().toUpperCase();
    }
    public static String hexToBinary(String hString) {
        String bString = "";
        for(int i = 0; i<hString.length(); i++) {
            switch(hString.charAt(i)) {
                case '0':
                    bString += "0000";
                    break;
                case '1':
                    bString += "0001";
                    break;
                case '2':
                    bString += "0010";
                    break;
                case '3':
                    bString += "0011";
                    break;
                case '4':
                    bString += "0100";
                    break;
                case '5':
                    bString += "0101";
                    break;
                case '6':
                    bString += "0110";
                    break;
                case '7':
                    bString += "0111";
                    break;
                case '8':
                    bString += "1000";
                    break;
                case '9':
                    bString += "1001";
                    break;
                case 'A':
                    bString += "1010";
                    break;
                case 'B':
                    bString += "1011";
                    break;
                case 'C':
                    bString += "1100";
                    break;
                case 'D':
                    bString += "1101";
                    break;
                case 'E':
                    bString += "1110";
                    break;
                case 'F':
                    bString += "1111";
                    break;
            }
        }
        return bString;
    }
}
