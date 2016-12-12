package arrays;

/**
 * Holds a 7x7 integer array.
 * Contains a collection of methods for use with the array.
 *
 * @author Martin Winqvist
 */
public class Array7x7 {
    private int[][] array = new int[7][7];

    /**
     * Empty default constructor.
     * Creates an array with all elements set to 0.
     */
    public Array7x7() {

    }

    /**
     * Creates an array with all elements set to the given value.
     *
     * @param value The value of all elements in the array.
     */
    public Array7x7(int value) {
        fillArray(value);
    }

    /**
     * Creates an array with all elements set to the values of the
     * elements in the given Array7x7.
     *
     * @param array7x7 the Array7x7 to copy elements from.
     */
    public Array7x7(Array7x7 array7x7) {
        setArray(array7x7);
    }

    /**
     * Creates an array with all elements set to the values of the
     * elements in the given 2D integer array.
     *
     * @param intArray the integer array to copy elements from.
     */
    public Array7x7(int[][] intArray) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = intArray[row][col];
            }
        }
    }

    /**
     * Set the specified element in the array to the given value.
     *
     * @param row   the row.
     * @param col   the column.
     * @param value the given value.
     */
    public void setElement(int row, int col, int value) {
        array[row][col] = value;
    }

    /**
     * Returns the value of the specified element in the array.
     *
     * @param row the row.
     * @param col the column.
     * @return the value in the array at the specified position.
     */
    public int getElement(int row, int col) {
        return array[row][col];
    }

    /**
     * Set the value of the elements in a whole row to the
     * values of the elements in an Array7.
     *
     * @param row    the row to set.
     * @param array7 the Array7 that holds the values to copy.
     */
    public void setRow(int row, Array7 array7) {
        for (int i = 0; i < array[row].length; i++) {
            array[row][i] = array7.getElement(i);
        }
    }

    /**
     * Fill a specified row with the given value.
     *
     * @param row   the row to fill.
     * @param value the value the row will be filled with.
     */
    public void fillRow(int row, int value) {
        for (int i = 0; i < array[row].length; i++) {
            array[row][i] = value;
        }
    }

    /**
     * Return the specified row as an Array7.
     *
     * @param row the row to get.
     * @return an Array7 with the values of the specified row.
     */
    public Array7 getRow(int row) {
        Array7 array7 = new Array7();
        for (int i = 0; i < array.length; i++) {
            array7.setElement(i, array[row][i]);
        }
        return array7;
    }

    /**
     * Set the value of the elements in a whole column to the
     * values of the elements in an Array7.
     *
     * @param col    the column to set.
     * @param array7 the Array7 that holds the values to copy.
     */
    public void setCol(int col, Array7 array7) {
        for (int i = 0; i < array.length; i++) {
            array[i][col] = array7.getElement(i);
        }
    }

    /**
     * Fill a specified row with the given value.
     *
     * @param col   the column to fill.
     * @param value the value the column will be filled with.
     */
    public void fillCol(int col, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i][col] = value;
        }
    }

    /**
     * Return the specified row as an Array7.
     *
     * @param col the column to get.
     * @return an Array7 with the values of the specified column.
     */
    public Array7 getCol(int col) {
        Array7 array7 = new Array7();
        for (int i = 0; i < array.length; i++) {
            array7.setElement(i, array[i][col]);
        }
        return array7;
    }

    /**
     * Set all the elements in the array to the value of the
     * elements in an Array7x7.
     *
     * @param array7x7 the Array7x7 to copy values from.
     */
    public void setArray(Array7x7 array7x7) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = array7x7.getElement(row, col);
            }
        }
    }

    /**
     * Fill the whole array with the given value.
     *
     * @param value the value to fill the array with.
     */
    public void fillArray(int value) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = value;
            }
        }
    }

    /**
     * Return the 2D integer array in the Array7x7.
     *
     * @return the 2D integer array in the Array7x7.
     */
    public int[][] getArray() {
        return this.array;
    }

    /**
     * Return a copy of the Array7x7.
     *
     * @return a copy of the Array7x7.
     */
    public Array7x7 copy() {
        return new Array7x7(array);
    }

    /**
     * Return a human-readable representation of the array.
     * @return a human-readable string that represents the array.
     */
    public String toString() {
        String res = "";
        for (int row = 0; row < array.length; row++) {
            res += "{";
            for (int col = 0; col < array[row].length; col++) {
                if (col > 0) {
                    res += " ";
                }
                res += array[row][col];
            }
            res += "}";
            res += "\n";
        }
        return res;
    }

}
