package arrays;

/**
 * Holds an integer array with 7 elements.
 * Contains a collection of methods for use with the array.
 *
 * @author Martin Winqvist
 */
public class Array7 {
    private int[] array = new int[7];

    /**
     * Empty default constructor.
     * Creates an array with all elements set to 0.
     */
    public Array7() {

    }

    /**
     * Creates an array with all elements set to the given value.
     *
     * @param value the value of all elements in the array.
     */
    public Array7(int value) {
        fillArray(value);
    }

    /**
     * Creates an array with all elements set to the values of the
     * elements in the given Array7.
     *
     * @param array7 the Array7 to copy elements from.
     */
    public Array7(Array7 array7) {
        setArray(array7);
    }

    /**
     * Creates an array with all elements set to the values of the
     * elements in the given integer array.
     *
     * @param intArray the integer array to copy elements from.
     */
    public Array7(int[] intArray) {
        for (int i = 0; i < array.length; i++) {
            array[i] = intArray[i];
        }
    }

    /**
     * Set the specified element in the array to the given value.
     *
     * @param pos   The position/index of the element.
     * @param value The given value.
     */
    public void setElement(int pos, int value) {
        array[pos] = value;
    }

    /**
     * Return the value of the specified element in the array.
     *
     * @param pos the position/index of the element.
     * @return the value of the element at the specified position.
     */
    public int getElement(int pos) {
        return array[pos];
    }

    /**
     * Set all the elements in the array to the value of the
     * elements in an Array7.
     *
     * @param array7 the Array7 to copy values from.
     */
    public void setArray(Array7 array7) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array7.getElement(i);
        }
    }

    /**
     * Fill the whole array with the given value.
     *
     * @param value the value to fill the array with.
     */
    public void fillArray(int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] = value;
        }
    }

    /**
     * Return the integer array in the Array7.
     *
     * @return the integer array in the Array7.
     */
    public int[] getArray() {
        return this.array;
    }

    /**
     * Return a copy of the Array7.
     *
     * @return a copy of the Array7.
     */
    public Array7 copy() {
        return new Array7(array);
    }

    /**
     * Returns a human-readable representation of the array.
     *
     * @return a human-readable string that represents the array.
     */
    public String toString() {
        String res = "{";
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                res += ",";
            }
            res += array[i];
        }
        res += "}";
        return res;
    }

}
