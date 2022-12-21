package com.company;
import java.io.*;
import java.net.URL;
public class N5_1 {
    public static void readAllByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if(oneByte != -1) {
                System.out.println((char) oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
}