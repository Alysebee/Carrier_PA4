import java.io.IOException;

public class Application {
    public static void main(String[] arg) throws IOException{
        DuplicateCounter dupRem = new DuplicateCounter();
        dupRem.count("problem2.txt");
        dupRem.write("unique_words_count.txt");

        System.out.println("Word count can be found in file \"unique_words_count.txt\"");
    }
}