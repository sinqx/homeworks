package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("Metallica.txt");
        Scanner sc = new Scanner(fileReader);

        String name = sc.nextLine();
        String author = sc.nextLine();
        String genre = sc.nextLine();
        String lyrics = "";

        while (sc.hasNextLine()){
            lyrics += sc.nextLine() + "\n";
        }

        Song Metallica = new Song(name, author, genre, lyrics);

        System.out.println(Metallica.fullSong() + "\n---------------------------------------");
        fileReader.close();

        Song Metallica2 = new Song ("Nothing else matters" , "Metallica 2", "heavy metal\n" ,
                "So close, no matter how far\n" +
                "\n" +
                "Couldn't be much more from the heart\n" +
                "\n" +
                "Forever trusting who we are\n" +
                "\n" +
                "And nothing else matters Never opened myself this way\n" +
                "\n" +
                "Life is ours, we live it our way\n" +
                "\n" +
                "All these words I don't just say\n" +
                "\n" +
                "And nothing else matters");

        FileWriter fileWriter = new FileWriter("Metallica2.txt");
        fileWriter.write(Metallica2.getName() + "\n");
        fileWriter.write(Metallica2.getAuthor() + "\n");
        fileWriter.write(Metallica2.getGenre() + "\n");
        fileWriter.write(Metallica2.getText());

        fileWriter.close();
        }
    }

//        1. Как вы понимаете исключения(exception)?
// Это ошибки, останвливающие работу кода

//        2. Какие исключения вы встречали?
// FileNotFoundException, NullPointerException.

//        3. Что вы знаете о классе Exception
// Все ошибки как раз из этого класса

//        4. Что будет если не обработать исключение?
// Код попросту на заработает. Либо лишь частично, до момента с ошибкой

//        5. Объясните, как работает структура try-catch
// в блоке try - запускаетяс наш код, и если в нём есть ошибка, то в блоке catch мы её ловим и проводим нужные нам действия