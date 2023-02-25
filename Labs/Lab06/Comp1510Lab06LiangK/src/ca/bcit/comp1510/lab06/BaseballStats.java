package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
/**
 * Reads baseball data in from a comma delimited file. Each line 
 * of the file contains a name followed by a list of symbols
 * indicating the result of each at bat: h for hit, o for out,
 * w for walk, s for sacrifice. Statistics are computed and
 * printed for each player.
 * @author blink
 *
 */
public class BaseballStats {


    /*
     * Reads baseball stats from a file and counts
     *  total hits, outs, walks, and sacrifice flies
     * for each player.
     */
    public static void main (String[] args) throws FileNotFoundException {
        Scanner fileScan; //The file name is then used to create a scanner (fileScan) to operate on that file.
        Scanner lineScan; //A third scanner (lineScan) will be used to parse each line in the file.
        String fileName;
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner scan = new Scanner(System.in); //used to read in a file name from standard input.
        //TODO Read and process each line of the file
        System.out.print ("Enter the name of the input file: ");
        fileName = scan.nextLine();
        fileScan = new Scanner(new File(fileName));

        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            lineScan = new Scanner(line);
            lineScan.useDelimiter(",");
            String name = lineScan.next();

            int hits = 0;
            int outs = 0;
            int walks = 0;
            int sacrificeFlies = 0;
            double battingAverage = 0;

            while (lineScan.hasNext()) {
                String atBat = lineScan.next();
                if (atBat.equals("h")) {
                    hits++;
                } else if (atBat.equals("o")) {
                    outs++;
                } else if (atBat.equals("w")) {
                    walks++;
                } else if (atBat.equals("s")) {
                    sacrificeFlies++;
                }
            }

            battingAverage = (double) hits / (hits + outs);
            System.out.println(name + ": " + hits + " hits, " + outs + " outs, " + walks + " walks, " + sacrificeFlies + " sacrifice flies, " + df.format(battingAverage) + " batting average");
        }
    }
}