import java.io.IOException;

public class Application {

    public static void main(String[] arg) throws IOException{
        DuplicateRemover dupRem = new DuplicateRemover();
        dupRem.remove("problem1.txt");
        dupRem.write("unique_words.txt");
    }

}