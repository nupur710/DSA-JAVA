package random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexNumbers {
    public static void main(String[] args) {
        String inputStr= "abc00123xyz456_0"; //input string for matching
        String regexStr= "[0-9]+"; //regex to be matched
        Pattern pattern= Pattern.compile(regexStr); //compile a regex via static method Pattern.compile(), default case sensitive
        Matcher matcher= pattern.matcher(inputStr); //allocate a matching machine from the compiled regex pattern, and bind to input string
        while(matcher.find()) { //matcher.find() finds next result
            System.out.println("find() found substring \"" + matcher.group() + "\" starting at index " + matcher.start()
            + " and ending at index " + matcher.end()); //perform matching and process results
        }

        if(matcher.matches()) { //mather.matches() tries to match the entire input (^...$)
            System.out.println("matches() found substring \"" + matcher.group() + "\" starting at index " + matcher.start()
            + " and ending at index " + matcher.end());
        } else {
            System.out.println("mathes() found nothing");
        }

        if(matcher.lookingAt()) { //tries to match from start of the input (^...)
            System.out.println("lookingat() found substring \"" + matcher.group() + "\" starting at index " + matcher.start()
                    + " and ending at index " + matcher.end());
        } else {
            System.out.println("lookingat() found nothing");
        }

        String replacementStr= "**";
        String outputStr= matcher.replaceFirst(replacementStr); //replaces first match only
        System.out.println(outputStr);

        replacementStr= "++";
        outputStr= matcher.replaceAll(replacementStr); //replaces all occurences
        System.out.println(outputStr);
    }
}
