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
        for(int i = lo; i <= hi; ++i) {
            if(isPrime(i)) {
                // i passes primality check -- i is prime, add to container
                primes.add(i);
            }
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
        if(n<=1)   { return false; }        // <=1 are not prime numbers
        if(n<=3)   { return true;  }        // 2, 3 are prime numbers
        if(n%2==0 || n%3==0) { return false; }

        for(int i = 5; i*i<=n; i+=6) {
            if(n%i==0 || n%(i+2)==0) { return false; }
        }
        return true;
    }
    //isPrime(int)==============================================================
}
//PrimalityTester.java==========================================================
