package edu.dmacc.codedsm.hw8a;

import java.util.Random;
import java.util.regex.Pattern;


public class arrayStuff {
    public static String[] something = new String[5];


    public static int arrayCount = 1;
    public static void main(String[] args) {
        // Link to a list of all the string functions -- https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#matches%28java.lang.String%29
        // Link to how to create a regex -- https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html

        int a = 1;
        for(int i=0; i<20; i++)
        {
            String tempS = createRandomAlphaNumericString(5);
            if(Pattern.matches( "[AEIOU][a-zA-Z][a-zA-Z][a-zA-Z][a-zA-Z]" , tempS))
            {
                //array.push(tempS);
                //arrayCount++;
                System.out.println( "Good pattern: " + tempS + " : " + a);
                a++;
            } else
            {
                System.out.println( "Bad Pattern: " + tempS );
            };
        }
    }
    public static String createRandomAlphaNumericString(int randomStringLength) {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(randomStringLength);
        for (int i = 0; i < randomStringLength; i++) {
            if (random.nextInt(10) >= 9) {
                buffer.append(random.nextInt(9));
            } else {
                int randomLimitedInt = leftLimit + (int)
                        (random.nextFloat() * (rightLimit - leftLimit + 1));
                char characterForString = (char) randomLimitedInt;
                if (random.nextBoolean()) {
                    characterForString = Character.toUpperCase(characterForString);
                }
                buffer.append(characterForString);
            }
        }
        return buffer.toString();
    }
}



