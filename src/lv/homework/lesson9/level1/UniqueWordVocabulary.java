/*
package lv.homework.lesson9.level1andLevel2;

import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

//UniqueWordVocabulary ir jābūt atsevišķai klasei, no kuras var izveidot objektu
//kuram ir attiecīgi metodes addWord, getUniqueWords, printToConsole
//un ir otra klase main metodi, kur objekta darbības tiek demonstrētas
public class UniqueWordVocabulary {
    public static void main(String[] args) {
        Set<String> vocabulary = new HashSet<>();
        addWord(vocabulary);
        addWord(vocabulary);
        addWord(vocabulary);
        addWord(vocabulary);
        vocabulary.iterator();
        printToConsole(vocabulary);
    }

    private static void printToConsole(Set<String> vocabulary) {
        System.out.println(vocabulary);
    }

    private static void addWord(Set<String> vocabulary) {
        Scanner wordScanner = new Scanner(System.in);
        String words = wordScanner.nextLine();
        if (words.equals("")) {
            System.out.println("nevar but tukshs");
        } else {
            vocabulary.add(words);
        }


    }
}
*/
