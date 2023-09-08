package com.wpc;

import com.wpc.typeConverters.NumConverter;

public class Main {
    public static void main(String[] args) {
        System.out.println(NumConverter.hexToBinary("FA"));
        System.out.println(NumConverter.binaryToHex("11111010"));
    }
}