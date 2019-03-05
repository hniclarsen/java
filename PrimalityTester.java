import static java.lang.Math.floor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * Class dedicated to determining the primality of numbers.
 * @author    Heather N. Larsen
 * @version   1.0    2019/03/04    18:11MST
 */
public class PrimalityTester {
    /**
     * Returns a list of prime numbers between a declared lower and upper bound
     * -- use ".size" with returned value to count number of discovered primes.
     * @param  lo  lower-bound integer
     * @param  hi  upper-bound integer
     * @return the list of primes between lo and hi
     */
    public List primes(int lo, int hi) {
        // initialize a linked-list storage container for discovered primes
        List primes = Collections.synchronizedList(new LinkedList());
        // check each integer between val lo and hi for primality
        for(int i = lo; i <= hi; ++i) {
            // skip 1 and 0 -- these are not prime
            if(i == 1 || i == 0) {
                continue;
            }
            // assume i is prime unless proven otherwise
            boolean prime = true;
            double half = (double)i/2;
            // test multiplicands up to half of i (second half mirrors the first half)
            // not necessary to test for multiplicand 1 as this is true for primes
            for(int j = 2; j <= floor(half); ++j) {
                double mltplr = (double)i/(double)j;
                // test if the multiplier is an integer 
                if(floor(mltplr) == mltplr) {
                    // i cannot be prime -- prime condition is factors [1, i] only
                    // non-primality found -- no further checks necessary
                    prime = false;
                    break;
                }
            }
            if(prime) {
                // i passes primality check -- i is prime, add to container
                primes.add(i);
            }
        }
        return primes;
    }
    //primes(int,int)===========================================================
}
//PrimalityTester.java==========================================================
