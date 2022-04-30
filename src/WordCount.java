import immutable.Map;
import java.util.Scanner;
import java.util.Random;
import java.util.Vector;
public class WordCount {

    public static void main(String[] args){
        Map m = Map.create();
        Random r = new Random();
        int length;
        int random;
        Vector randoms = new Vector();
        Vector words = new Vector();
        Vector occurs = new Vector();
        Scanner obj = new Scanner(System.in);
        String temp = obj.nextLine();
        int i = 0;
        while(temp.indexOf("quit") != 0){




            String[] tempArray = temp.split(" ");
            length = tempArray.length;
            for(String word : tempArray){
                if(m.getValue(word) != null){
                    i--;
                    System.out.println("size1: " + occurs.size());
                    System.out.println(" i " + (i - 1));
                    occurs.set(i - 1, (Integer)occurs.get(i - 1) + 1);
                    m = m.setValue(word, m.getValue(word) + 1);

                }
                else{
                    words.add(word);
                    occurs.add(1);
                    random = r.nextInt(length);
                    if(randoms.contains(random)){
                        random = r.nextInt(length);
                    }
                    m = m.setValue(word, random);

                    randoms.add(random);
                }
                System.out.println(" i2: " + (i - 1));
                System.out.println("size2:" + occurs.size());
                i++;

            }

            temp = obj.nextLine();



        }
        System.out.print("/n");
        System.out.println("Map has size " + m.size() + " with depth " + m.depth());


    }

}
