package characters;

import arrays.Array7x7;

import javax.swing.*;

/**
 * Easy way to test the characters class.
 * If the color is black, print "#".
 * Otherwise print ".".
 *
 * Created by Martin on 2016-12-19.
 */
public class TestCharacters {

    public static void testChar(Array7x7 array) {
        int[][] getArray = array.getArray();
        char[][] displayArray = new char[7][7];

        for(int x = 0; x < getArray.length; x++) {
            for(int y = 0; y < getArray[x].length; y++) {
                if(getArray[x][y] == -16777216) {
                    displayArray[x][y] = '#';
                }
                else {
                    displayArray[x][y] = '.';
                }
            }
        }

        String res = "";
        for (int row = 0; row < displayArray.length; row++) {
            res += "{";
            for (int col = 0; col < displayArray[row].length; col++) {
                if (col > 0) {
                    res += " ";
                }
                res += displayArray[row][col];
            }
            res += "}";
            res += "\n";
        }
        System.out.println(res);

    }

    public static void main (String[] args) {
        Characters chars = Characters.getInstance();

        String input = JOptionPane.showInputDialog("Enter a string");
        Array7x7[] charArray = new Array7x7[input.length()];

        for(int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            charArray[i] = new Array7x7(chars.getCharacter(currentChar));
            testChar(charArray[i]);
        }

    }
}
