%{
/*
      Ctrl+D :　入力した行・文字数・単語数が表示される

      [^\t \n]:タブ、空白、改行以外の任意の文字
               マッチした場合：文字列（単語ひとつ分）がyytextに格納されている状態
      yytext:入力文字列があるパターンにマッチした場合、マッチした文字列を格納する変数
*/
int line=0;
int moji=0;
int tango=0;
%}
%%
[^\t \n]+   {
              tango++;
              moji += strlen(yytext);
            }
\n          {
              line++;
              moji++;
}
[\t ]       {moji++;}
%%
int main(){
  while(yylex() != 0){}
  printf("%d lines %d 文字 単語数:%d\n",line,moji,tango);
}
