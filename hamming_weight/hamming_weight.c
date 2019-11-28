#include <stdint.h>
#include <stdio.h>

int hammingWeight(uint32_t n) {
  uint32_t count = 0;
  while (n != 0) {
    if (n % 2 != 0.0) {
      count++;
    }
    n = n >> 1;
  }
  return count;
}

int main() { printf("%d\n", hammingWeight(19)); }