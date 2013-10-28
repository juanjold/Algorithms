#include <iostream>

using namespace std;

int main() {
  long sum = 0, i = 0, j = 0;
  long limit = 2000000;
  bool prime[limit];
  
  for (i = 0; i < limit; i++) {
    prime[i] = true;
  }
  
  prime[0] = false;
  prime[1] = false;

  for (i = 0; i < limit; i++) {
    if (prime[i]) {
      for (j = i * 2; j < limit; j = j + i) {
	prime[j] = false;
      }
    }
  }

  for (i = 0; i < limit; i++) {
    if (prime[i]) {
      sum += i;
    }
  }
  
  cout << sum << endl;
  
  return 0;

}
