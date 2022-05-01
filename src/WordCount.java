import immutable.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
public class WordCount {

    public static void main(String[] args){
        Map m = Map.create();
        //Random r = new Random();
        int length;
        //int random;
        //Vector randoms = new Vector();
        Vector words = new Vector();
        Vector occurs = new Vector();
        //Vector temps = new Vector();
        Scanner obj = new Scanner(System.in);
        String temp = obj.nextLine();
        String[] arr = temp.split(" ");
        int i = 0;
        //System.out.println(temp.indexOf("quit") == -1);
        while(temp.indexOf("quit") == -1){
            arr = temp.split(" ");
            System.out.println(arr);
            temp = obj.nextLine();
        }

        for(String word : arr){
            System.out.println(word);
        }


        //System.out.println("Map has size " + m.size() + " with depth " + m.depth());


    }

}
