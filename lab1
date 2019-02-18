import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Kdj {
    public static void main(String[] args) {
rarestWord("file.txt");
    }
    static void rarestWord(String filename){

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            Map<Integer, String> rarestwords = new HashMap<Integer, String>();
            String strings;
            while ((strings = br.readLine()) != null) {
                List<String> collection = new LinkedList<String>();
                String slova[] = strings.split(" ");
                for (String slovo: slova){
                    collection.add(slovo);
                }
                for (String znachennya : collection) {
                    rarestwords.put(Collections.frequency(collection,znachennya), znachennya);
                }
            }
            System.out.println(rarestwords);
        } catch (IOException e) {

            System.out.println("Ошибка:"+e);
        }
    }
}
