/*
/  Project Euler
/  Problem 4
/  Juan José López Delgado - 1/4/2013
*/

#include <iostream>
#include <string>
#include <sstream>
#include <vector>

using namespace std;

int main() {

  int mult;
  int poop = 0;
  string temp;
  string tamp;
  stringstream oss;
  for ( int i = 999; i >= 100; i-- ) { 
    for ( int j = 999; j >= 100; j-- ) {
      mult = i * j;
      oss << mult;
      temp = oss.str();
      tamp = string ( temp.rbegin(), temp.rend() );
      if(temp == tamp){
	int lop;
	istringstream ( temp ) >> lop;
	if ( lop > poop )
	  poop = lop;
      }
      oss.clear();
      oss.str("");
    }
  }
      
  cout<<poop << endl;
 
  return 0;
}
