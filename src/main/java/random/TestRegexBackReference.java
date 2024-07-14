package random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegexBackReference {
    public static void main(String[] args) {
        String inputStr = "One:two:three:four";
        String regexStr = "(.+):(.+):(.+):(.+)";
        String replacementStr = "$4-$3-$2-$1";
        Pattern pattern = Pattern.compile(regexStr);
        Matcher matcher = pattern.matcher(inputStr);
        String outputStr = matcher.replaceAll(replacementStr);
        System.out.println(outputStr);

        while (matcher.find()) {
            System.out.println("find() found substring \"" + matcher.group()
                    + "\" starting at index " + matcher.start()
                    + " and ending at index " + matcher.end());
            System.out.println("Group count is: " + matcher.groupCount());
            for (int i = 0; i < matcher.groupCount(); ++i) {
                System.out.println("Group " + i + ": substring="
                        + matcher.group(i) + ", start=" + matcher.start(i)
                        + ", end=" + matcher.end(i));
            }
        }
    }
}
