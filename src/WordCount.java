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
        Vector temps = new Vector();
        Scanner obj = new Scanner(System.in);
        String temp = obj.nextLine();

        String[] arr = temp.split(" ");
        for(String a : arr){
            temps.add(a);
            System.out.println(a);
        }
        int quit = 0;
        //System.out.println(temp.indexOf("quit") == -1);
        System.out.println(!temp.contains("contains"));
        while((!temp.contains("quit")) && (temp != null)){
            temp = obj.nextLine();
            System.out.println(temp);
            arr = temp.split(" ");
            for(String array : arr){
                temps.add(array);
                System.out.println(array);

            }
            System.out.println(temp.contains("quit"));


        }

        for(Object w : temps){
            System.out.println
            System.out.println((String)w);
        }


        //System.out.println("Map has size " + m.size() + " with depth " + m.depth());


    }

}
