package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File test = new File("C:\\Users\\sinqx\\Desktop\\questions.txt");
        File test2 = new File("C:\\Users\\sinqx\\Desktop\\questions2.txt");

        try(Reader reader = new BufferedReader(new FileReader(test));
            Writer writer = new BufferedWriter(new FileWriter(test2)))
        {
            if (test.length() > 100) {
                throw new IllegalStateException("«Код слишком большой");
            }
            System.out.println(test.length());

            int ch;

            while ((ch = reader.read()) != -1) {
                if (Character.isAlphabetic(ch)) {
                    writer.write(ch);
                }
            }
            writer.flush();

            BufferedReader fin = new BufferedReader(new FileReader(String.valueOf(test2)));
            String line;
            while ((line = fin.readLine()) != null) System.out.println(line);
        }
        catch (FileNotFoundException e1) {
            throw new FileNotFoundException("Файл не доступен");
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
