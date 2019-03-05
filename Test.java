import java.util.List;
/**
 * Main function for testing programs within this folder.
 * @author    Heather N. Larsen
 * @version   1.0    2019/03/04    18:11MST
 */
public class Test {
    public static void main(String[] args) {
        // Test primes(int,int) for PrimalityTester.java
        ///*
        PrimalityTester test = new PrimalityTester();
        List primes = test.primes(1, 1000);
        System.out.println(primes+"\nNumber of primes: "+primes.size());
        //*/
    }
}
