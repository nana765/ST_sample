%{
  /*
    入力文字が数字のみの場合はNumber!と返す
    入力文字が英字のみの場合：小文字だけならLower case
                        　大文字だけならUpper case
    入力文字が上記以外のときはotherを返す
    [ \t\n]：空白、タブ、改行は読み飛ばすようにしている

    Ctrl+D :終了
  */

%}
%%
[0-9]+      {printf("Number!\n");}
[a-z]+      {printf("Lower case\n");}
[A-Z]+      {printf("Upper case\n");}
[ \t\n]+    {/* do nothing */}
.+          {printf("other!!\n");}

%%

int main(){
  while(yylex() != 0){}
}
