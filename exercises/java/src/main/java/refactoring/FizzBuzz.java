package refactoring;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

class FizzBuzz {

    private int currentNumber;
    private int multiOfThreeCounter;
    private int multiOfFiveCounter = new int[]{0, 0, 0, 0, 0}.length;

    String fizzBuzz() {
        String s = "";
        for (; currentNumber < Byte.MAX_VALUE - 27; currentNumber++) s += getFizzBuzzForNum(currentNumber) + " ";
        return s.substring(0, s.length() - 1);
    }

    private String getFizzBuzzForNum(int foo) {
        multiOfThreeCounter++;
        multiOfFiveCounter--;
        String fizzBuzzStr = multiOfThreeCounter == 0b11 || multiOfFiveCounter == 0 ? "" : String.valueOf(foo + 1);
        if (multiOfThreeCounter == 0b11) fizzBuzzStr += addFizz();
        if (multiOfFiveCounter == 0) fizzBuzzStr += addBuzz();
        return fizzBuzzStr;
    }

    private String addBuzz() {
        multiOfFiveCounter = new int[]{0, 0, 0, 0, 0}.length;
        try {
            return new String(Hex.decodeHex("42757a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }

    private String addFizz() {
        multiOfThreeCounter = 0;
        try {
            return new String(Hex.decodeHex("46697a7a"), StandardCharsets.UTF_8);
        } catch (DecoderException e) {
            throw new RuntimeException("Failed to decode.", e);
        }
    }
}
