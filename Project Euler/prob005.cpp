#include <iostream>

using namespace std;

int main() {
  long currN = 20;
  int i = 1;
  int limit = 20;

  for(i = 1; i < limit; i ++) {
    if((currN % i) != 0) {
      i = 1;
      currN = currN + 1;
    }
  }

  cout << currN << endl;

  return 0;

}
