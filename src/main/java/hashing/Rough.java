package hashing;

public class Rough {

    //Simple hashing function for strings
    public static void main(String[] args) {
        String s= "abcd";
        int x= 6;
        System.out.println(generateHash("dog", 6));
        System.out.println(generateHash("gdo", 6));
    }


    public static int generateHash(String s, int x) {
        int hash= 0;
        for(int i= 0; i<s.length(); i++)  {
            hash= (s.charAt(i)*(x^2));
        } return hash;
    }

}
