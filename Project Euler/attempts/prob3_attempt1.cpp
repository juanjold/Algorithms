/*
/  Project Euler
/  Problem 3
/  Juan José López Delgado - 1/4/2013
*/

#include <iostream>
//#define LIMIT 600851475143 
//#define REALIM (LIMIT+1)/2

using namespace std;

int main(){
  long num = 0;
  long factor = 0;
  cout << "Please give a number to calculate its largest prime factor: " << endl;
  cin >> num;
  
  cout << num <<endl;
  bool primes [13200];
  for ( long i = 0; i < num; i++ ) {
    primes[i] = true;
  }
  
  primes[0] = false;
  primes[1] = false;
  
  for ( long i = 0; i < num; i++ ) {
    if (primes[i]) {
      for (int j = i*2; j < num; j = j + i) { 
	primes[j] = false;
      }
    }
  } 

  for ( long i = 0; i < num; i++ ) {
    if (!(num % i )) {
      if (!( primes[i] )) {
	factor = i;
      }
    }
  }

  cout << "The largest prime factor of " << num << " is: " << factor << endl;

  return 0;

}
