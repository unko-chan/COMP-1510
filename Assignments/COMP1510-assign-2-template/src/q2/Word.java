package q2;

/**
 * This class represents a word and its frequency.
 *
 * @author Kevin Liang
 * @version 2023
 */
public class Word implements Comparable<Word> {

    /**
     * The word.
     */
    private final String word;

    /**
     * The frequency of the word.
     */
    private int frequency;

    /**
     * Constructs a new Word object.
     *
     * @param word the word
     */
    public Word(String word) {
        this.word = word;
        this.frequency = 1;
    }

    /**
     * Gets the word.
     *
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * Gets the frequency.
     *
     * @return the frequency
     */
    public int getFrequency() {
        return frequency;
    }

    /**
     * Increments the frequency.
     */
    public void incrementFrequency() {
        frequency++;
    }

    /**
     * Returns a string representation of the word and its frequency.
     *
     * @return a string representation of the word and its frequency
     */
    public String toString() {
        return word + " " + frequency;
    }

    /**
     * Compares this word to another word.
     *
     * @param otherWord the other word
     * @return an integer of the comparison
     */
    public int compareTo(Word otherWord) {
        return Integer.compare(frequency, otherWord.getFrequency());
    }
}
