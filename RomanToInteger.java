package veer.com;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = map.get(s.charAt(i));

            // If next value is larger, subtract current
            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                total -= current;
            } else {
                total += current;
            }
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println("III  → " + romanToInt("III"));     // 3
        System.out.println("LVIII → " + romanToInt("LVIII"));   // 58
        System.out.println("MCMXCIV → " + romanToInt("MCMXCIV")); // 1994
        System.out.println("IX → " + romanToInt("IX"));         // 9
    }
}

/*
🧩 Problem Statement

Given a Roman numeral, convert it to an integer.

Roman Symbol Values
Symbol	Value
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
🔹 Roman Numeral Rules

Symbols are added when a smaller value is after or equal to a larger one.

Example:
VI = 5 + 1 = 6, XVII = 10 + 5 + 1 + 1 = 17

Symbols are subtracted when a smaller value is before a larger one.

Example:
IV = 5 - 1 = 4, IX = 10 - 1 = 9, XC = 100 - 10 = 90

✅ Approach

We loop through the string:

Convert each Roman character to its integer value.

If the current value < next value, subtract it.

Otherwise, add it.

Time: O(n)

Space: O(1)

*/