#include <iostream>

using namespace std;

int main(){
  int limit = 1000;
  int i, sum = 0;
  bool multiples[limit];

  for(i = 0; i < limit; i++) {
    multiples[i] = false;
  }

  for(i = 0; i < limit; i++) {
    if ((i % 3 == 0) || (i % 5 == 0)) {
      multiples[i] = true;
    }
  }

  for(i = 0; i < limit; i++) {
    if(multiples[i]) {
      sum += i;
    }
  }

  cout << sum << endl;

  return 0;

}
