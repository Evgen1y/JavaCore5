package Module11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bulov on 21.01.2017.
 */
public class main {
    public static void main(String[] args) throws IOException {
        Map<String, String> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        map.put("nonpop", "pop");

        System.out.print("Enter the path to file: ");
        String fileName = br.readLine();

        WorkWithFile workWithFile = new WorkWithFile(fileName);

        int i = workWithFile.checkWord("pop");
        System.out.println(i);

        i = workWithFile.checkWordResourse("pop");
        System.out.println(i);

        String replacer = workWithFile.replacer(map);
        System.out.println(replacer);

        workWithFile.fileContentReplacer(map);
        workWithFile.fileContentMerger(map);


    }
}
