import immutable.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

public class WordCount {

    public static void main(String args[]){
        Scanner obj = new Scanner(System.in);
        //ArrayList<String> userInput = new ArrayList<String>();
        Vector<String> inputs = new Vector<String>();
        Vector<String> words = new Vector<String>();
        String temp = obj.nextLine();
        int space;

        int quit = temp.indexOf("quit");
        while(quit != 0){
            inputs.add(temp);
            temp = obj.nextLine();
            quit = temp.indexOf("quit");
        }
        for(int i = 0; i < inputs.size(); i++){
            temp = inputs.elementAt(i);
            space = temp.indexOf(' ');
            while(space != -1){
                words.add(temp.substring(0, space));
                System.out.println("SubString: " + temp.substring(space, temp.indexOf(' ', space)));
                temp = temp.substring(space, temp.indexOf(' ', space));
                space = temp.indexOf(' ');
            }

        }
        System.out.println(words);
    }

}
