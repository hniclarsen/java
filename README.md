### AUTHOR:  Heather N. Larsen
### VERSION: 1.1    2019/03/04    18:33MST

# OVERVIEW
  The file Test.java, along with all other dependencies in this folder, will allow the user to test each of the programs in this
  folder by passing commands to the Test.java class.
  
# USAGE
  From a command-line, the user can compile the Test.java file and all dependencies with the following:
  
  javac Test.java
  
  To pass arguments to the Test program, simply state the class name as the first parameter and the method(along with arguments)
  as the second parameter as so:
  
  **java Test <Class Name> <Method with Arguments>**
  
  For example, to use the primes(int,int) method in PrimalityTester to find all primes between 2 and 100:
  
  **java Test PrimalityTester primes(2,100)**
  
  The output of all prime numbers between 2 and 100 will be printed to the console, as well as a count of those primes.
