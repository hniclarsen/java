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
  The first parameter is a lower-bound integer and the second parameter is an upper-bound integer used to declare a range of
  integer numbers the user wishes to find the primes in-between (note: these bounds are inclusive).
  
  The Test.java class will return the list of prime numbers along with a count of how many prime numbers are found.
  
  Example:
  
  **java Test PrimalityTester primes(2,100)**
  
  [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
  Number of primes: 25
