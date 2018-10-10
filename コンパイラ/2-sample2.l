%{
/*
      Ctrl+D :　入力した行・文字数が表示される
      .:改行以外の任意の文字
*/
int line=0;
int moji=0;
%}
%%
\n      {
          line++;
          moji++;
        }
.       {moji++;}
%%
int main(){
  while(yylex() != 0){}
  printf("%d lines %d 文字\n",line,moji);
}
