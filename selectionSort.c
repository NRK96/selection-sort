#include<stdio.h>
#include<stdlib.h>
int main(int argc, char *argv[]){
  int array[argc-1];
  int swap;
  for(int i = 1; i < argc; i++)
    array[i-1] = atoi(argv[i]);
  int min = 0;
    for(int i = 0; i < argc-1; i++){
      min = i;
      for(int j = i+1; j < argc-1; j++){
        if(array[min] > array[j])
          min = j;
      }
      swap = array[min];
      array[min] = array[i];
      array[i] = swap;
    }
  for(int i = 0; i < argc-1; i++)
    printf("%d ", array[i]);
  printf("\n");
  return 0;
}