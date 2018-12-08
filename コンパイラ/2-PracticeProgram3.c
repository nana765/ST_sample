#include <stdio.h>
#include <string.h>
int dfatable [8][3] = {
  {1,2,-1},
  {1,3,-1},
  {1,2,-1},
  {4,5,6},
  {4,7,-1},
  {4,5,6},
  {-1,-1,-1},
  {4,5,6}
};

char buf[1024];

int main(){
  int i,len;
  int state = 0;

  printf("input:");
  fgets(buf,1024,stdin);

  len = strlen(buf) - 1;
  for(i=0;i<len;i++){
    state = dfatable[state][buf[i] - 'a'];
    if(state == -1){
      break;
    }
  }
  if(state == 6){
    printf("accepted!\n");
  }else{
    printf("not accepted!\n");
  }
  return 0;
}
