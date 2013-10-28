/*
/  Project Euler
/  Problem 9
/  Juan José López Delgado - 1/4/2013
*/

#include <iostream>
#define LIM 1000
using namespace std;

int main() {
  int temp = 0;
  for( int i = 0 ; i < LIM ; i++ ){
    for ( int j = 0 ; j < i ; j++ ){
      for ( int k = 0 ; k < j ; k++ ){
	temp = k*k + j*j;
	if (temp == i*i){
	  if ((i+j+k) == 1000){
	    cout << i*j*k << endl;
	    return 0;
	  }
	}
      }
    }
  }
  return 0;

}
