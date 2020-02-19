import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringProblems {
    /*
            str.length()

            str.charAt(int index)

            str.toCharArray()

            str.subString(int beginIndex, int endIndex)
                         (int beginIndex)

            str.subSequence(int beginIndex, int endIndex) - simillar to subSting but returns interface CharSequence
                           (int beginIndex)

            str.trim() - function that eliminates leading and trailing spaces

            str.toUpperCase()

            str.toLowerCase()

            str.isEmpty() - return True if String's length equals 0

            str.split(String regex, int limit) -  turns a String into an array of strings, by separating the string at each instance of a separator string(regex)
                     (String regex)

            str.replace(CharSequence target, CharSequence replacement)
                       (char oldChar, char newChar)

            str.replaceAll(String regex, String replacement)

            str.replaceFirst(String regex, String replacement)

            str.matches(String regex) - returns True if str is equal to the regex.

            str.indexOf(String st, int fromIndex) - searches for the "st" string from the "fromIndex" index and returns the index of such first finding
                       (String st)

            str.lastIndexOf(String st, int fromIndex)
                           (String st)

            str.equals(Object anObject)

            str.equalsIgnoreCase(String anotherString)

            str.startsWith(String prefix, int startIndex) - return True if String starts with "prefix", from the "startIndex" index
                          (String prefix)

            str.endsWith(String suffix)

            str.contains(CharSequence s) - returns True if "str" contains "s"

            str.compareTo(String anotherStr) - returns 0 if "str" equals to "anotherStr",
                                               more than 0 if lexicographically, "str" is greater than "anotherStr",
                                               if is lesser, returns less tan 0 (negative)

            str.comapreToIgnoreCase(String anotherStr)

            str.getBytes() - converts "str" to an array of bytes

            str.concat(CharSequence s)
         */

    public StringProblems(){
    }

    // reads a string and return the string without the first two characters.
    // Except keep the first char if it is 'g' and keep the second char if it is 'h'
    public String task1(String str){

        if(str.charAt(0) == 'g'){
            if(str.charAt(1) == 'h'){
                return str;
            } else {
                return str.substring(0,1).concat(str.substring(2));
            }
        } else {
            if(str.charAt(1) == 'h'){
                return str.substring(1);
            } else {
                return str.substring(2);
            }
        }
    }

    // reads a string and seperates it, by "-" into an array of Strings and deletes all the white spaces
    public List<String> task2(String str){
        List<String> strArr = new ArrayList<>();

        String newStr = str.replaceAll("\\s+", "");
        strArr = Arrays.asList(newStr.split("-"));
        return strArr;
    }

}
