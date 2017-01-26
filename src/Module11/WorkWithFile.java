package Module11;

import java.io.*;
import java.util.Map;

/**
 * Created by bulov on 22.01.2017.
 */
public class WorkWithFile {
        //private BufferedReader br = null;
        private BufferedWriter bw = null;
        private FileReader fileReader = null;
        private String fileName;

    public WorkWithFile(String fileName) {
        this.fileName = fileName;

        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.err.println("file not found");
        }
    }

    public String replacer(Map<String, String> map) {
        String all = null;
        BufferedReader br = null;
        try {
            StringBuilder sb = new StringBuilder();
            br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();

            while (line != null) {
                if (map.containsKey(line)) line = map.get(line);
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            all = sb.toString();
        } catch (IOException e) {
            System.err.println("read failed");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.err.println("file not closed");
            }
            return all;
        }
    }

    public File fileContentReplacer(Map<String, String> map){
        String s = replacer(map);
        File test = new File(fileName);
        try {
            bw = new BufferedWriter(new FileWriter(test));
            bw.write(s);
            System.out.println("Data are overwritten");
        }catch(IOException e){
            System.err.println("read failed");
        }finally {
            try{
                if(bw != null)bw.close();
            } catch (IOException e){
                System.err.println("file not closed");
            }
        }
        return test;
    }

    public File fileContentMerger(Map<String, String> map){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s = replacer(map);
        File destination = null;

        try {
            System.out.print("Enter the path of destination file: ");
            destination = new File(input.readLine());
            bw = new BufferedWriter(new FileWriter(destination));
            bw.write(s);
            System.out.println("Data are copied");
        } catch(IOException e){
            System.err.println("read failed");
        } finally {
            try{
                if(bw != null)bw.close();
                if(input != null) input.close();
            }catch (IOException e){
                System.err.println("file not closed");
            }
        }
        return destination;
    }

    public int checkWord(String word){
        int count = 0;
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(fileName));
            String line  = br.readLine();
            while(line != null){
                if(line.equals(word)){
                    count++;
                }
                line = br.readLine();
            }
        } catch (IOException e){
            System.err.println("read failed");
        }finally {
            try{
                if(br != null) br.close();
            } catch (IOException e){
                System.err.println("file nor closed");
            }
        }
        return count;
    }

    public int checkWordResourse(String word){
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line  = br.readLine();
            while(line != null){
                if(line.equals(word)){
                    count++;
                }
                line = br.readLine();
            }
        } catch (IOException e){
            System.err.println("read failed");
        }
        return count;
    }


}
