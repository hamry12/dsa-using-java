package String;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String s="MCMXCIV";
        romanToInteger(s);

    }

    private static void romanToInteger(String s) {
        int sum=0;
        for(int i=0; i<s.length();i++){

            Integer data = switch (s.charAt(i)) {
                case 'V' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        yield 4; // IV => 4
                    }
                    yield 5; // V => 5
                }

                case 'X' -> {
                    if (i > 0 && s.charAt(i - 1) == 'I') {
                        yield 9; // IX => 9
                    }
                    yield 10; // X => 10
                }

                case 'L' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        yield 40; // IX => 9
                    }
                    yield 50; // X => 10
                }

                case 'C' -> {
                    if (i > 0 && s.charAt(i - 1) == 'X') {
                        yield 90; // IX => 9
                    }
                    yield 100; // X => 10
                }

                case 'D' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        yield 400; // IX => 9
                    }
                    yield 500; // X => 10
                }

                case 'M' -> {
                    if (i > 0 && s.charAt(i - 1) == 'C') {
                        yield 900; // IX => 9
                    }
                    yield 1000; // X => 10
                }

                default -> 1; // Default case to handle unexpected characters
            };
            sum=data+sum;
        }
        System.out.println(sum);
    }
}
