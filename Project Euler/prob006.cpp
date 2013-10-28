/*
/  Project Euler
/  Problem 6
/  Juan José López Delgado - 1/4/2013
*/

#include <iostream>

using namespace std;

int main(){
  int lim =0;
  cout << "Please give a number to find the difference between the sum of squares and the square of its sum" << endl;
  cin >> lim;
  long sumofsq = 0;
  long sqofsum = 0;

  for (int i = 1; i <= lim; i++) {
    sumofsq += i*i;
    sqofsum += i;
  }

  long diff = (sqofsum*sqofsum)-sumofsq;
  cout << diff<< endl;
  return 0;

}
