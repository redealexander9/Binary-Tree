import immutable.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Vector;

public class WordCount {

    public static void main(String args[]){
        Map m = Map.create();






        //System.out.println(m.getValue("Mango"));
        Scanner obj = new Scanner(System.in);
        //ArrayList<String> userInput = new ArrayList<String>();
        //Vector<String> words = new Vector<String>();
        String temp = obj.nextLine();
        int i = 0;

        while(temp.indexOf("quit") != 0){




            String tempArray[] = temp.split(" ");
            for(String word : tempArray){
                if(m.getValue(word) != null){
                    m.setValue(word, m.getValue(word) + 1);
                }
                else{
                    m.setValue(word, i);
                    i++;
                }

            }

            temp = obj.nextLine();



        }

    }

}
