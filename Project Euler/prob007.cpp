#include <iostream>

using namespace std;

int main() {
  int total = 10002;
  long prime[total];
  int i = 1, j = 2, count = 1, curr = 0;
  
  prime[0] = 1;
  prime[1] = 2;

  while (count < total) {
    for (i = 1; i <= j; i++) {
      if (! (j % i)) {
	curr++;
      }
    }
    
    if (curr == 2) {
      prime[count] = j;
      count++;
    }

    j++;
    curr = 0;
  }

  cout << prime[10001] << endl;
  return 0;

}
