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

            str.startsWith(String prefix, int startIndex) -return True if String starts with "prefix", from the "startIndex" index
                          (String prefix)

                          

         */
    private String str;

    public StringProblems(String str){
        this.str = str;
    }





}