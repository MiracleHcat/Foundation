public class BigInteger {
    private int[] digits;    // 用于存储整数的数字
    private boolean isNegative;   // 标记整数是否为负数

    public BigInteger(String n) {
        // 从字符串构造BigInteger
        // ...
    }

    public BigInteger remainder(BigInteger b) {
        // 执行 this % b 的取余运算
        // ...
        return new BigInteger(resultDigits, isNegative);
    }

    public BigInteger divide(BigInteger b) {
        // 执行 this / b 的除法运算
        // ...
        return new BigInteger(resultDigits, isNegative);
    }

    @Override
    public String toString() {
        // 返回BigInteger的字符串表示
        String result = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            result = digits[i] + result;
        }
        if (isNegative) result = "-" + result;
        return result;
    }
}