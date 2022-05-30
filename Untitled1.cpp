#include <stdio.h>

int main(){
  float nota1,nota2,nota3,nota4,media;
  printf("Insira nota 1: ");
  scanf("%f", &nota1);
  printf("Insira nota 2: ");
  scanf("%f", &nota2);
  printf("Insira nota 3: ");
  scanf("%f", &nota3);
  printf("Insira nota 4: ");
  scanf("%f", &nota4); 
  media=(nota1+nota2+nota3+nota4)/4;
  printf("Sua média foi %.1f", media); 
}
