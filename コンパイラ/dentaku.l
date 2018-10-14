%{
/*
- 電卓（+ / - *）ができるように作る
*/
int a,b;
char enzan;
int ans[SIZE];

%}
%%

{"0"|[1-9][0-9]*}   {
                      a = yytext;
                    }
{"+"|"-"|"*"|"/"}   {
                      enzan = yytext;
                    }
[" ""\t"]           {}



%%
int main(){
  while(yylex() != 0){}
  i=0;
  while(ans[i] != NULL){
  printf("%d\n",ans[i]);
  }
}
