package strings;


// Input: Hello
// Output: olleH

public class ReverseString {
    public static void main(String[] args) {

// Method 1: Using String Class
        String string = "Hello";
        String reversed = "";
        char [] characters = string.toCharArray();
        for(int i=characters.length-1;i>=0;i--){
            reversed+=characters[i];
        }
        System.out.println(reversed);

//Method 2 Using String Builder Class

        /*
        StringBuilder sb = new StringBuilder(string);
        System.out.println(sb.reverse());
        */

    }
}
