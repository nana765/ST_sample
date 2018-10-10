/*---------------------------------------------------------
[1]キーボードから入力された複数の文字列を内部でリンクトリストで保持し、
入力が終了したら、逆順に表示するプログラム
-----------------------------------------------------------*/
#include <stdio.h>
#include <stdlib.h>
#define SIZE 256

//双方向リストを利用
struct List{
  char data[SIZE];
  struct List* prev;
  struct List* next;
};

//リストの作成・追加
struct List* add(struct List* list){
  struct List* new;
    new = (struct List*)malloc(sizeof(struct List));
    list->next = new;
    new->prev = list;
    scanf("%s",new->data);
    return new;
}
//リストを逆順で表示
void display(struct List* list){
  if(list->prev == NULL)return;
  printf("%s\n",list->data);
  display(list->prev);
}

int main(){
  struct List* head; //リストの先頭を示すポイント変数
  struct List* p; //作業用ポインタ
  struct List* tail; //リストの末尾を指すポインタ変数
  int flag = 0;
  char str[SIZE];

  p = head = (struct List*)malloc(sizeof(struct List));//ダミーノード

  while(1){
    printf("1追加/2入力終了? --->");
    scanf("%d",&flag);
    if(flag == 1){

      p = tail = add(p);
    }else if(flag == 2){
      display(tail);
      break;
    }
  }
  return 0;
}
