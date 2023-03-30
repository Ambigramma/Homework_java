
import java.io.File;
import java.sql.SQLOutput;
import java.io.*;
import java.io.FileWriter;

public class Homework_2 {
    public static void main(String[] args) {
        System.out.println(buildString(6, 'a', 'b'));
        writer();
    }

    static String buildString(int n, char c1, char c2){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            result.append(c1).append(c2);
        }
        return result.toString();
    }

    public static void writer(){

            Integer n = 100;
            String text = "TEXT";
            String file_name = "file.txt";

            File file = new File(file_name);

            try{
                FileWriter writer = new FileWriter(file, false);
                for (int i = 0; i < n; i++) {
                    writer.write(text);
                    writer.write("\n");
                }
                writer.close();
                System.out.println("Ok!");
            }
            catch (Exception e){
                System.out.println("Something's gone wrong");
            }
        }
}
