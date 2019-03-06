#### AUTHOR:  Heather N. Larsen
#### VERSION: 1.1    2019/03/04    18:33MST

# OVERVIEW
  The file Test.java, along with all other dependencies in this folder, will allow the user to test each of the programs in this
  folder by passing commands to the Test.java class.
  
# USAGE
  From a command-line, the user can compile the Test.java file and all dependencies with the following:
  
  javac Test.java
  
  To pass arguments to the Test program, simply state the class name as the first parameter and the method(along with arguments)
  as the second parameter as so:
  
  **java Test \<Class Name> \<Method with Arguments>**
  
  For example, to use the primes(int,int) method in PrimalityTester to find all primes between 2 and 100:
  
  **java Test PrimalityTester primes(2,100)**
  
  The output of all prime numbers between 2 and 100 will be printed to the console, as well as a count of those primes.

# PROGRAM CLASSES
## PrimalityTester
  The PrimalityTester class is dedicated to determining the primality of numbers through the declared methods.
  
  ### primes(int,int)
  Returns a list of prime numbers between a declared lower and upper bound -- can be used with ".size" to return the count of
  the discovered primes.
  The first parameter (lo) is a lower-bound integer and the second parameter (hi) is an upper-bound integer used to declare a range of
  integer numbers the user wishes to find the primes in-between (note: these bounds are inclusive).
  
  The Test.java class will return the list of prime numbers along with a count of how many prime numbers are found.
  
  Example:
  
  **java Test PrimalityTester primes(2,100)**
  
  _[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]_
  
  _Number of primes: 25_

## LinkedToken
  The LinkedToken class is dedicated to storing a token that has an index and may have a preceding or following token. The 
  storage container can be navigated either by accessing the previous or next tokens (if they exist) from the current token
  or by looking up the token through its index.
  
  ### LinkedToken(T)
  This is the original constructor that will initialize the first token and consequentially the entire set. The parameter
  tkn represents the token to be stored as the LinkedToken.
  
  **no test available**
  
  ### LinkedToken(T,int,Map<Integer,LinkedToken>,LinkedToken)
  Stores the consequential tokens associated with the parent token which is created by the user. This method can only be
  accessed by the original LinkedToken itself. All tokens following the initialization of the first must be created using
  createNext(T) instead of creating new LinkedTokens outside of the program.
  
  **no test available**
  
  ### createNext(T)
  Creates the next token in the sequence, linking it to the previous (calling) token. The parameter tkn represents the token
  to be stored as the LinkedToken.
  
  **WARNING: CAN BREAK THE LIST STRUCTURE IF CALLED FROM A TOKEN WHICH ALREADY HAS A NEXT TOKEN**
  
  **no test available**
  
  ### getNext()
  Returns the next token in the set based on the previous (calling) token.
  
  **no test available*
  
  ## getPrev()
  Returns the previous token in the set based on the next (calling) token.
  
  **no test available**
  
  ## getLastToken()
  Returns the last LinkedToken in the set.
  
  **no test available**
  
  ## getLastIndex()
  Returns the index of the last LinkedToken in the set.
  
  **no test available**
  
  ## getToken(int)
  Returns the token associated to the provided index (idx) parameter stored on the table.
  
  **no test available**
  
  ## getIndex()
  Returns the index of the current LinkedToken.
  
  **no test available**
  
  ## iterateTokens()
  Returns a String comprised of the current LinkedToken and all next LinkedTokens.
  
  **no test available**
  
  ## toString()
  Returns a String representation of the current token.
  
  **no test available**
