/*
/  Project Euler
/  Problem 3
/  Juan José López Delgado - 1/4/2013
*/ 

#include <iostream>
#include <vector>
#include <cmath>

using namespace std;


int main() {
  long num = 0;
  vector<long> primes;
  cout << "Please give a number to calculate its larget prime factor" << endl;
  cin >> num;

  //calculate factors
  for ( long i = 1; i < sqrt(num); i++ ) { 
    if ( num % i == 0 ) 
      primes.push_back(i);
  }
  
  vector<bool> primo;
  for ( long i = 0; i <= primes.back(); i++){
    primo.push_back(true);
  }
  primo[0] = false;
  primo[1] = false;

  for ( long i = 0; i <= primes.back(); i++ ){
    if (primo[i]){
      for (long j = i * 2; j <= primes.back(); j = j + i) {
        primo[j] = false;
      }
    }
  }
  
  while (true){
    if (primo[primes.back()]){
      cout << primes.back() << endl;
      return 0;
    } else {
      primes.pop_back();	
    }
  }
  
  return 0;

}
