%{
/*
- 予約語は無視
- 整数・小数も無視
*/

#include <stdio.h>
#include <stdlib.h>

//Line(行)の構造体設定
struct Line{
int data; //何行か数字を格納
struct line *next;
};
//Listの構造体設定
struct List{
  char *word; //識別子の名前
  struct Line* line_head;
  struct Line* line_tail;
  struct List* next;
};

int data = 1;
struct List *head,*tail,*p1,*p2;
struct Line *p3;

%}
%%
"auto"      {}
"break"      {}
"case"      {}
"char"      {}
"const"      {}
"continue"      {}
"default"      {}
"do"      {}
"double"      {}
"else"      {}
"enum"      {}
"extern"      {}
"float"      {}
"for"      {}
"goto"      {}
"if"      {}
"int"      {}
"long"      {}
"register"      {}
"return"      {}
"short"      {}
"signed"      {}
"sizeof"      {}
"static"      {}
"struct"      {}
"switch"      {}
"typedef"      {}
"union"      {}
"unsigned"      {}
"void"      {}
"volatile"      {}
"while"      {}
[_a-zA-Z][_a-zA-Z0-9]*    {
                            p2 = head;
                            //認識した識別子が登録済みかどうか確認する
                            while(p2->next != NULL){
                                if(strcmp(p2->next->word,yytext)){
                                      break;
                                }
                            }

                            p3 = (struct Line*)malloc(sizeof(struct Line)); //識別子に行番号を追加するためのノードを作成
                            if(p3 == NULL){
                              printf("ノードを作れませんでした。\n");
                              exit(1);  //異常終了
                            }

                            p3->data = data;
                            p3->next = NULL;
                            //認識した識別子が登録されてない場合
                            if(strcmp(yytext,p2->word)!=0){
                              p1 = (struct List*)malloc(sizeof(struct List)); //識別子を登録するためのノードを作成
                              if(p1 == NULL){
                                printf("ノードを作れませんでした。\n");
                                exit(1);  //異常終了
                              }
                              p1->word = (char*)malloc(strlen(yytext)+1); //識別子の文字列を格納するためのメモリを確保
                              if(p1 == NULL){
                                printf("ノードを作れませんでした。\n");
                                exit(1);  //異常終了
                              }
                              strcpy(p1->word,yytext); //識別子の文字列を格納
                              p1->line_head = p3;
                              p1->line_tail = p3;
                              p1->next = p2->next;
                              p2->next = p1;
                            }else{
                            //認識した識別子が登録済みの場合
                              p2->line_tail->next = p3;
                              p2->line_tail = p3;
                            }
                          }
[0-9]+        {}
[0-9]+\.[0-9]+ {}
^#.*\n      {}
%%
int main(){
  head = (struct List*)malloc(sizeof(struct List));
  if(head == NULL){
    printf("ノードを作れませんでした。\n");
    exit(1);  //異常終了
  }
  tail = head;
  head->next = NULL;
  head->word = "";

  while(yylex() != 0){}

  p1 = head->next;
  while(p1!=NULL){
    printf("%s : ",p1->word);
    p3 = p1->line_head;
    while(p3 != NULL){
    printf("%5d",p3->data);
    p3=p3->next;
    }
    printf("\n");
    p1=p1->next;
  }
}
