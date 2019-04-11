package utility;

import java.io.*;

public class DataReader {

    public static String readFile(String filePath) {
        String text ;
        String a = null;
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((text=bufferedReader.readLine())!=null){
                a = text;
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        //readFile("src/utility/Information.txt");
        //readFile("src/utility/Info.txt");
            writeFile("src/utility/Info.txt","Syed");
    }

        public static void writeFile(String filePath, String text){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write(", "+text);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
