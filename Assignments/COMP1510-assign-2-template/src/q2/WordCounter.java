package q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * This class counts the number of unique words in a book and prints the top
 * words.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class WordCounter {

    /**
     * The number of top words to print.
     */
    private static final int TOP_WORDS = 10;

    /**
     * The list of words.
     */
    private final List<Word> wordList;

    /**
     * Constructs a new WordCounter.
     */
    public WordCounter() {
        wordList = new ArrayList<>();
    }

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        int uniqueWords = wordCounter.parseBook("src/bible.txt");
        System.out.println("Number of unique words: " + uniqueWords);
        wordCounter.printTopWords(TOP_WORDS);
    }

    /**
     * Parses the book and returns the number of unique words.
     *
     * @param filename the filename
     * @return the number of unique words
     */
    public int parseBook(String filename) {
        int uniqueWords = 0;
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String wordString = scanner.next();
                Word word = findWord(wordString);
                if (word == null) {
                    word = new Word(wordString);
                    wordList.add(word);
                    uniqueWords++;
                } else {
                    word.incrementFrequency();
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return uniqueWords;
    }

    /**
     * Prints the top words.
     *
     * @param n the number of top words to print
     */
    public void printTopWords(int n) {
        wordList.sort(Collections.reverseOrder());
        for (int i = 0; i < n && i < wordList.size(); i++) {
            System.out.println(wordList.get(i));
        }
    }


    private Word findWord(String wordString) {
        for (Word word : wordList) {
            if (word.getWord().equals(wordString)) {
                return word;
            }
        }
        return null;
    }

}
