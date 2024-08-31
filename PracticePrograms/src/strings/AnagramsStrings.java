package strings;
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
// Anagram Strings - if two string have same frequency of letters then those are anagram
// for ex- if S1 = 'listen' & S2 = 'silent'
// frequency of each letter in S1:- l =1, i =1, s=1, t=1, e=1, n=1;
// ferquency of each letter in S2:- s=1, i=1, l=1, e=1, n=1, t=1;
// S1 & S2 are anagrams
public class AnagramsStrings {

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "selent";
        if(s1.length()!=s2.length()) {
            System.out.println("Not Anagrams");
        }

//        System.out.println(anagramCheckUsingHashMap(s1,s2));
//        System.out.println(anagramCheckUsingStreams(s1,s2));
//        System.out.println(anagramCheckSimpleMethod(s1,s2));
        if(anagramCheckUsingStreams(s1,s2)){
            System.out.println("Anagram");
        }else {
            System.out.println("not Anagram");
        }
       }

       public static boolean anagramCheckUsingHashMap(String s1, String s2){
           // METHOD 2: Using HASHMAP

           Map<Character, Integer> mp = new HashMap<Character, Integer>();

           for(char ch: s1.toCharArray()){
               mp.put(ch, mp.getOrDefault(ch,0)+1);
           }

           for(char ch: s2.toCharArray()){
               if(!mp.containsKey(ch)){
                   return false;
               }
               mp.put(ch, mp.getOrDefault(ch,0)-1);
               if(mp.get(ch)==0){
                   mp.remove(ch);
               }
           }
           return mp.isEmpty();
       }

       public static boolean anagramCheckUsingStreams(String s1, String s2){

        Map<Character, Long> mp1 = s1.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           Map<Character, Long> mp2 = s2.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
           return mp1.equals(mp2);
       }

    public static boolean anagramCheckSimpleMethod(String s1, String s2){
        int [] ch1 = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            ch1[s1.charAt(i)]++;
            ch1[s2.charAt(i)]--;
        }
        for(int count : ch1){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    }

