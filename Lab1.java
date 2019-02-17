package lab1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class Lab1 {

   
    public static void main(String[] args) throws FileNotFoundException, IOException{
    
          try (InputStream reader = new FileInputStream("test.txt")) {
    long[] unicodeArray = new long[65536];
    byte[] buf = new byte[4096];
    int a;
    short minChar = 0;
    long minCharCnt = 0;

    while ((a = reader.read(buf)) > 0) {
        for (int i = 0; i < a; i += 2) {
            short c = (short) ((buf[i] << 8) | (buf[i + 1] & 0xff));
            unicodeArray[c]++;
            if (unicodeArray[c] > minCharCnt) {
                minChar = c;
                minCharCnt = unicodeArray[c];
        }
    }

    System.out.println((char)minChar);
}
          }
          
