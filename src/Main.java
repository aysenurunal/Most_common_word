import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.util.Collections.max;

public class Main {
    public static void main(String[] args) {
        //please enter a sentence:
        Scanner sc = new Scanner(System.in);
        String given= sc.nextLine();

        String[] strSplit = given.split(" ");

        HashMap <String,Integer> hm= new HashMap<>();
        for(String word: strSplit){
            if (hm.containsKey(word)){
              int a= hm.get(word);
              a ++;
              hm.put(word,a);
            }else{
                hm.put(word,1);
            }
        }
        //aysenur nilufer istanbul galata brolar gül nilufer aysenur nilufer
        //System.out.println(hm.values());
        int m=max(hm.values());
        //System.out.println(m);
        for (String my_key : hm.keySet()){
            System.out.println(my_key + " " + hm.get(my_key));
        }
        Integer valueToFind = m;
        for(String my_key : hm.keySet()){
            if (hm.get(my_key)== valueToFind){
                System.out.println("Most common word: "+my_key);
            }
        }
    }
}