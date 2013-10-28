/* 
/  Project Euler
/  Problem 2
/  Juan Jose Lopez Delgado - 1/4/2013
*/ 

#include <iostream>
#define LIMIT 4000000

using namespace std;

int main(){
  int start = 0;
  int current = 1;
  int temp;
  int sum = 0;
  
  while (current < LIMIT) {
    temp = current;
    current += start;
    start = temp;
    if (!( current % 2 )){ 
      cout << current << endl;
      sum += current;
    }
  }

  cout << "Sum of even-valued terms of Fibonacci up to " << LIMIT << "is: " << sum << endl;

  return 0;

}
