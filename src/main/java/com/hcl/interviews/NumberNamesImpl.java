package com.hcl.interviews;

/**
 * This class is responsible for number to word conversion.
 */
public class NumberNamesImpl implements NumberNames {
    private static final String[] LOW_NAMES = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
        "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
        "nineteen"};

    private static final String[] TENS_NAMES = {"twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty",
        "ninety"};

    private static final String[] BIG_NAMES = {"thousand", "million", "billion"};

    //@Override
    public String int2Text(long input) {
        String prefix = "";
        if (input < 0) {
            input = -input;
            prefix = "negative ";
        }
        if (input <= 999) {
            return prefix + convertToWord((int) input);
        }
        String value = null;
        int count = 0;
        while (input > 0) {
            if (input % 1000 != 0) {
                String word = convertToWord((int) (input % 1000));
                if (count > 0) {
                    word = word + " " + BIG_NAMES[count - 1];
                }
                if (value == null) {
                    value = word;
                } else {
                    value = word + ", " + value;
                }
            }
            input /= 1000;
            count++;
        }
        return prefix + value;
    }

    // Range 0 to 999.
    private static String convertToWord(int input) {
        String word = LOW_NAMES[input / 100] + " hundred";
        String smallerWord = convertToWordSmaller(input % 100);
        if (input <= 99) {
            return smallerWord;
        } else if (input % 100 == 0) {
            return word;
        } else {
            return word + " " + smallerWord;
        }
    }

    // Range 0 to 99.
    private static String convertToWordSmaller(int input) {
        if (input < 20) {
            return LOW_NAMES[input];
        }
        String smallerWord = TENS_NAMES[input / 10 - 2];
        if (input % 10 == 0) {
            return smallerWord;
        }
        return smallerWord + "-" + LOW_NAMES[input % 10];
    }

}
