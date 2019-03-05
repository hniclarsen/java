import java.util.List;
import java.util.StringTokenizer;
/**
 * Main function for testing programs within this folder.
 * @author    Heather N. Larsen
 * @version   1.1    2019/03/04    18:32MST
 */
public class Test {
    public static void main(String[] args) {
        String program  = args[0];
        String function = args[1]; 
        //PrimalityTester.java
        if(program.compareTo("PrimalityTester")==0) {
            primalityTester(function);
        }
    }
    //main(String[])============================================================
    /**
     * Test the functions in the PrimalityTester class.
     * @param  fn  the function being tested
     */
    private static void primalityTester(String fn) {
        PrimalityTester test = new PrimalityTester();
        StringTokenizer tkn  = new StringTokenizer(fn,"(,)");
        //primes(int,int)
        if(tkn.nextToken().compareTo("primes")==0) {
            List primes = test.primes(Integer.parseInt(tkn.nextToken()),
                    Integer.parseInt(tkn.nextToken()));
            System.out.println(primes+"\nNumber of primes: "+primes.size());
        }
    }
    //primalityTester(String)===================================================
}
