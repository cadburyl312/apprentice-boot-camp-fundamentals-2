package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    public static final int THREE = 0b11;
    public static final String BUZZ_HEX = "42757a7a";
    public static final String FIZZ_HEX = "46697a7a";
    private int currentNumber;
    private int multiOfThreeCounter;
    private int multiOfFiveCounter = new int[]{0, 0, 0, 0, 0}.length;
    private static final int ONE_HUNDRED = 100;

    String fizzBuzz() {
        String s = "";
        for (; currentNumber < ONE_HUNDRED; currentNumber++) s += getFizzBuzzForNum(currentNumber) + " ";
        return s.substring(0, s.length() - 1);
    }

    private String getFizzBuzzForNum(int foo) {
        moveCounters();
        boolean isDivisibleByFive = multiOfFiveCounter == 0;
        boolean isDivisibleByThree = multiOfThreeCounter == THREE;
        return buildFizzBuzzString(foo, isDivisibleByThree, isDivisibleByFive);
    }

    private String buildFizzBuzzString(int foo, boolean isDivisibleByThree, boolean isDivisibleByFive) {
        String fizzBuzzStr = isDivisibleByThree || isDivisibleByFive ? "" : String.valueOf(foo + 1);
        if (isDivisibleByThree) fizzBuzzStr += addFizz();
        if (isDivisibleByFive) fizzBuzzStr += addBuzz();
        return fizzBuzzStr;
    }

    private void moveCounters() {
        multiOfThreeCounter++;
        multiOfFiveCounter--;
    }

    private String addBuzz() {
        multiOfFiveCounter = new int[]{0, 0, 0, 0, 0}.length;
        return decodeToHex(BUZZ_HEX);
    }

    private String addFizz() {
        multiOfThreeCounter = 0;
        return decodeToHex(FIZZ_HEX);
    }

    private String decodeToHex(String hex) {
        try {
            byte[] fizzInHex = Hex.decodeHex(hex);
            return new String(fizzInHex, StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
