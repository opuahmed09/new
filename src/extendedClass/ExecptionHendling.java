package extendedClass;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExecptionHendling {

    public static void main(String[] args) {

        FileReader file = null;
        BufferedReader Bfile = null;
        String st = "";

        try {
            file = new FileReader("/Users/peoplentech/Documents/WeekDays-February/February2019/src/reader.txt");
            Bfile = new BufferedReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while ((st = Bfile.readLine()) != null) {
                System.out.println(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file = null;
            }
            if (Bfile != null) {
                Bfile = null;
            }
        }
    }
}
