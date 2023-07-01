public class Main {
    public static String toBinary(BigInteger n) {
        String binary = "";
        while (n.signum() != 0) {
            binary = (n.remainder(BigInteger.TWO).toString() + binary);
            n = n.divide(BigInteger.TWO);
        }
        return binary;
    }

    public static void main(String[] args) {
        BigInteger n = new BigInteger("1000000000000000000000000000001");
        String binary = toBinary(n);
        System.out.println(binary);
    }
}
