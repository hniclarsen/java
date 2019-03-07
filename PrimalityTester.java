import static java.lang.Math.floor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
/**
 * Class dedicated to determining the primality of numbers.
 * @author    Heather N. Larsen
 * @version   2.0    2019/03/06    18:30MST
 */
public class PrimalityTester {
    /**
     * Returns a list of prime numbers between a declared lower and upper bound
     * -- use ".size" with returned value to count number of discovered primes.
     * @param  lo  inclusive lower-bound integer
     * @param  hi  inclusive upper-bound integer
     * @return the list of primes between lo and hi
     */
    public List listPrimes(int lo, int hi) {
        // initialize a linked-list storage container for discovered primes
        List primes = Collections.synchronizedList(new LinkedList());
        // check each integer between val lo and hi for primality
        int k = 1;                              // for prime pattern incrementation
        if(lo<=2 && hi>=2) { primes.add(2); }   // 2 is prime
        if(lo<=3 && hi>=3) { primes.add(3); }   // 3 is prime
        if(lo<=1) { lo = 5; }                   // n<2 is not prime
        for(int i = lo; i <= hi; i+=k) {
            // remove even numbers
            if(i%2==0) {
                continue;
            }
            if(isPrime(i)) {
                // i passes primality check -- i is prime, add to container
                primes.add(i);
                if(k == 1 || k == 4) {
                    k = 2;
                }
                else if(k == 2) {
                    k = 4;
                }
            }
            else { k = 1; }
        }
        return primes;
    }
    //listPrimes(int,int)=======================================================
    /**
     * Determines if the passed parameter is a prime number or not.
     * @param  n  number being tested for primality
     * @return true if n is prime, false if n is composite
     */
    public boolean isPrime(int n) {
        // assume i is prime unless proven otherwise
            boolean prime  = true;
            double  sqrt   = Math.sqrt((double)n);
            // test multiplicands up to the sqrt of i (multiplication mirroring)
            // not necessary to test for multiplicand 1 as this is true for primes
            for(int i = 3; i <= floor(sqrt); i+=2) {
                double mltplr = (double)n/(double)i;
                // test if the multiplier is an integer 
                if(floor(mltplr) == mltplr) {
                    // i cannot be prime -- prime condition is factors [1, i] only
                    // non-primality found -- no further checks necessary
                    return false;
                }
            }
            return true;
    }
    //isPrime(int)==============================================================
}
//PrimalityTester.java==========================================================
