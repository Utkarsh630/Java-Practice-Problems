package strings;

//Input: Ram | Output: false
//Input: Nitin | Output: true
// Method 1- Standard method using string class and character arrays
// Method 2 using String builder or StringBuffer class using reverse method
public class PalindromeStrings {

    public static void main(String[] args) {
        String string = "Nitin";
        String reverse="";
        string=string.toLowerCase();
        char [] characters = string.toCharArray();
        for (int i = characters.length-1; i >=0 ; i--) {
            reverse += characters[i];
        }
        if(string.equals(reverse)){
            System.out.println("Palindrome String");
        }else{
            System.out.println("Not Palindrome");
        }

        // Method 2

//        StringBuilder sb1 = new StringBuilder(string);
//        if(sb1.equals(sb1.reverse())){
//            System.out.println("Palindrome String");
//        }else{
//            System.out.println("Not Palindrome");
//        }
    }

}
