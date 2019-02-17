import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        rarestWord("E:/test.txt");
    }

    static void rarestWord(String filename){
        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {

            Map<Integer, String> wordsmap = new TreeMap<Integer, String>();
            String str;

            while ((str = br.readLine()) != null) {
                List<String> list = new ArrayList<String>();
                String[] slova = str.split(" ");
                for (String slovo: slova){
                    list.add(slovo);
                }
                for (String thing : list) {
                    wordsmap.put(Collections.frequency(list, thing), thing);
                }
            }

            System.out.println( ((TreeMap<Integer, String>) wordsmap).firstEntry());

        } catch (IOException e) {
            System.out.println("Ошибка:"+e);
        }
    }
}