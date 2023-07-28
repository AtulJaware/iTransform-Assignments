package org.core_java.stringclass_stringbuffer;

public class Q3_OperationsOnString {
    public static void main(String[] args) {
        String str="Java String pool refers to collection of Strings which are stored in heap memory";

        // 1) Print the string in lowercase
        System.out.println("1] String in lowercase :");
        System.out.println(str.toLowerCase());


        // 2) Print the String in uppercase
        System.out.println("2] String in Uppercase :");
        System.out.println(str.toUpperCase());


        // 3) Replace all 'a' character in string with $ sign
        System.out.println("3] Replace 'a' with $ : ");
        System.out.println(str.replace('a','$'));


        // 4) Check if the String contains the word "collection"
        System.out.println("4] String Contains collection word : "+ str.contains("collection"));

        // 5) Check the following String matches the original
        String str2= "java string pool refers to collection of strings which are stored in heap memory";
        System.out.println("5] str1 matches str2 : "+str.matches(str2));

        // 6) Check with another method
        System.out.println("6] Both Strings are Equals : "+str.equalsIgnoreCase(str2));
    }
}
