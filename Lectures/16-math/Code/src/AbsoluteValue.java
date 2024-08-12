public final class AbsoluteValue {
    private AbsoluteValue() {
    }

    /*
     * Returns the absolute value of a number.
     */
    public static int getAbsValue(int number) {
        return number < 0 ? -number : number;
    }
}