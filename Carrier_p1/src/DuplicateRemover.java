import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover{
    //Scanner scnr = new Scanner (System.in);
    private Set<String> uniqueWords;

    public void remove (String dataFile) throws FileNotFoundException {
        String indivWord;
        uniqueWords = new HashSet<String>();
        Scanner scnr = new Scanner (new File(dataFile)); //scanner for files

        while (scnr.hasNext()) { //adds words from text file to create list in code
            indivWord = scnr.next(); //with exception if word is already in list
            uniqueWords.add(indivWord);
        }

        scnr.close();

    } // end of DuplicateRemover method

    public void write (String outputFile) throws IOException {

        File f = new File(outputFile);
        FileWriter fWriter = null;

        if (f.exists()){
            fWriter = new FileWriter(f, true);
            Iterator iter = uniqueWords.iterator();

            while (iter.hasNext()){ //takes all words from file to add to list
                String str = (String)iter.next();
                fWriter.write(str + "\n");
            }

            fWriter.close();
            System.out.println("Output words found in file \"unique_words.txt\"");

        }
        else{
            f.createNewFile();
            fWriter = new FileWriter(f);
            Iterator iter = uniqueWords.iterator();

            while (iter.hasNext()){
                String str = (String)iter.next();
                fWriter.write(str + "\n");
            }

            fWriter.close();
            System.out.println("Output words found in file \"unique_words.txt\"");

        }

    } // end of write method
} // end of class
