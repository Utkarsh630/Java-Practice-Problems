package strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacter {

    public static  void main(String [] args){
        String input1 = "aabsgdssd";
        firstUniqueChar ( input1 );
    }

    public static void firstUniqueChar(String str){

        Map <Character, Integer> map = new LinkedHashMap <> (  );
        for(int i=0; i<str.length ();i++){
            map.put(str.charAt ( i ), map.getOrDefault ( str.charAt ( i ),0 )+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet ()){
            if(entry.getValue () == 1){
                System.out.println (entry.getKey () );
                break;
            }
        }

        System.out.println("No non-repeating character found");
    }

}
