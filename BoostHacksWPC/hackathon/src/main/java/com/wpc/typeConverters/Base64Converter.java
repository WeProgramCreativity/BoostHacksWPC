package com.wpc.typeConverters;

import java.util.Base64;

public class Base64Converter {
    public static String decode(String encodedString) {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }
    public static String encode(String inputString){
        byte[] encodedBytes = Base64.getEncoder().encode(inputString.getBytes());
        String encodedString = new String(encodedBytes);
        return encodedString;
    }
}
