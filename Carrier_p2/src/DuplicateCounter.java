import java.io.*;
import java.util.*;

public class DuplicateCounter {

    private Map<String, Integer> wordCounter;
    public DuplicateCounter(){
        wordCounter = new HashMap<String, Integer>();
    }

    public void count (String dataFile){
        //wordCounter = new HashSet<String, Integer>();

        Scanner scnr = null;
        try{
            scnr = new Scanner (new File(dataFile)); //scanner for files
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return;
        }
        String indivWord = null;
        Integer count = wordCounter.get(indivWord);

        while (scnr.hasNext()) { //adds words from text file to create list in code
            indivWord = scnr.next().toLowerCase();

            if (count == null){
                count =1;
            }
            else{
                count++;
            }
            wordCounter.put(indivWord, count);
        }
        scnr.close();
    } // end of DuplicateRemover method

    public void write (String dataFile) throws IOException{
        try {
            PrintWriter fileOut = new PrintWriter(new File(dataFile));
            for(String k:wordCounter.keySet()){
                fileOut.println(k + " is found " + wordCounter.get(k) + " times.");
            }
            fileOut.close();
        }
        catch (FileNotFoundException e){

        }

    }//end of write method
} // end of DuplicateCounter
