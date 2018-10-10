/*---------------------------------------------------------
[2]英単語を15個用意し、各々を2分木のノードにもたせ、キーボードから入
力された単語がその中にあるかないか探索するプログラム
-----------------------------------------------------------*/
#include <stdio.h>
#include <string.h>
#define SIZE 15

struct node {
  char name[10];
} Node;

//あらかじめ辞書順で格納しておくこと！
struct node data[SIZE] = {
    {"orange"},
    {"peach"},
    {"milk"},
    {"suit"},
    {"book"},
    {"sweater"},
    {"bone"},
    {"lemon"},
    {"pentas"},
    {"flower"},
    {"grimm"},
    {"joy"},
    {"crime"},
    {"dear"},
    {"register"}
};

int Search(char *word){
    int left = 0;
    int right = SIZE - 1;
    int mid;
    int x;

    while (left <= right) {
        mid = left + (right - left) / 2;
        x = strcmp(data[mid].name, word);
        if (x > 0)
            right = mid -1;
        else if (x < 0)
            left = mid + 1;
        else {
            return 0;
        }
    }
    return 1;
}

int main(){
    char word[100];
    int flag;
    scanf("%s",word);
    flag=Search(word);
    if(flag==0){
      printf("単語が見つかりました\n");
    }else{
      printf("単語が見つかりませんでした\n");
    }
    return 0;
}
