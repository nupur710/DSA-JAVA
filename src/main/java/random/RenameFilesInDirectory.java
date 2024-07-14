package random;

import java.io.File;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RenameFilesInDirectory {
    public static void main(String[] args) {
        String regexStr= ".class$"; //ending with .class
        String replacementStr= ".out"; //replace with .out
        Pattern pattern= Pattern.compile(regexStr, Pattern.CASE_INSENSITIVE);
        Matcher matcher;
        File dir= new File(".");
        int count= 0;
        File[] files= dir.listFiles();
        for(File file : files) {
            if(file.isFile()) { //file not directory
                String inFileName= file.getName();
                matcher= pattern.matcher(inFileName); //input string is file name for each file in directoryy
                if(matcher.find()) {
                    ++count;
                    String outputFileName= matcher.replaceFirst(replacementStr);
                    System.out.println(inFileName + " -> " + outputFileName);

                    if(file.renameTo(new File(dir + "\\" + outputFileName))) { //execute rename file
                        System.out.println("SUCCESS");
                    } else {
                        System.out.println("FAIL");
                    }
                }
            }
        }
        System.out.println(count + " files processed");
    }
}
