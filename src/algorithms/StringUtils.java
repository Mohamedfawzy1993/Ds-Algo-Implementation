package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * The Class StringAlgo
 *
 * @author mohamed.fawzy
 */
public class StringUtils {

    public static int countVouls(String str) {
        if(str == null)
            return -1;
        // Find number of vowels ------------------------------
        char[] vowels = new char[]{'a', 'e', 'o', 'u', 'i'};
        int count = 0;
        for(char ch : str.toLowerCase().toCharArray()){
            for(Character v : vowels){
                if(v == ch)
                    count++;
            }
        }
       return count;
    }

    public static String reverse(String str){
        if(str == null)
            return "";
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length()-1 ; i>=0; i--){
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static String reverseWords(String str){
        String[] strSplited = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = strSplited.length-1 ; i>=0 ; i--){
            stringBuilder.append(strSplited[i]);
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    public static Boolean areRotate(String str1, String str2){
        String baseCompare = str1+str1;
        return (str1.length() == str2.length()) && baseCompare.contains(str2);
    }

    public static String removeDuplicate(String str){
        Set<Character> d = new HashSet();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(!d.contains(ch)){
                stringBuilder.append(ch);
                d.add(ch);
            }
        }
        return stringBuilder.toString();
    }

    public static Character mostRepeatedChar(String str){
        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        int max = 0;
        Character character = null;
        for(Character ch : str.toCharArray()){
            characterIntegerMap.put(ch, characterIntegerMap.get(ch) != null ? characterIntegerMap.get(ch)+1 : 1);
        }
        for(Character ch: characterIntegerMap.keySet()){
            if(characterIntegerMap.get(ch) > max){
                max = characterIntegerMap.get(ch);
                character = ch;
            }
        }
        return character;
    }

    public static Character mostRepeatedCharWithArr(String str){
        int[] arr = new int[256];
        int max = 0;
        int res = ' ';
        for(Character ch : str.toCharArray()){
            arr[ch]++;
        }

        for(int i = 0 ; i < arr.length; i++){
           if(arr[i] > max) {
               max = arr[i];
               res = i;
           }
        }

        return (char)res;
    }

    public static String capitalizeAll(String str){
        if(str.equals("") || str.length() == 0)
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0 ; i< str.length(); i++){
            if(((int)(str.charAt(i))) < 97)
                stringBuilder.append(str.charAt(i));
            else
                stringBuilder.append((char)((int)str.charAt(i)-32));
        }
        return stringBuilder.toString();
    }

    public static String capitalizeFirst(String str){

       StringBuilder stringBuilder = new StringBuilder();
       str = str.trim().replaceAll(" +", " ");
        if(str.isEmpty())
            return "";
       String[] lis = str.split(" ");

       for(String s : lis){
           stringBuilder.append(capitalizeChar(s.charAt(0)) + s.substring(1,s.length()) +" ");
       }
       return stringBuilder.toString();
    }

    public static boolean isAnagram(String a , String b){
        Map<Character, Integer> stringIntegerMap = new HashMap<>();
        a = a.toLowerCase();
        b = b.toLowerCase();
        for(Character x : a.toCharArray()) {
            stringIntegerMap.merge(x, 1, Integer::sum);
        }
        for(Character y : b.toCharArray())
            stringIntegerMap.merge(y, 1, Integer::sum);
        for(Character z : stringIntegerMap.keySet()){
            if(stringIntegerMap.get(z) < 2)
                return false;
        }
        return true;
    }

    public static boolean isPalindrome(String a){
        if(a == null)
            return false;
        a = a.toLowerCase();
        for(int i = 0 ; i < a.length()/2 ; i++){
            if(a.charAt(i) != a.charAt(a.length()-1-i))
                return false;
        }
        return true;
    }

    private static char capitalizeChar(char c) {
        if(((int)c) < 97)
            return c;
        else
            return (char)(((int)c)-32);
    }
}

    
