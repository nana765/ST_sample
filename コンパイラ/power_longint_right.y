%{
#define YYSTYPE long int

//乗算の計算右から
/***実行手順
* yacc power_longint_right.y
* lex power_longint.l
* gcc y.tab.c -ly -ll
* ./a.out
***/

long int power(long int a, long int b){
  int i;
  long int x;
  for(x=1,i=0;i<b;i++){
      x *= a;
  }
  return x;
}

%}

%right POWER
%token NUM
%%

S   : E {printf("%ld\n",$1);}
    ;
E   : E POWER E {$$ = pow($1,$3);}
    | NUM {$$ = $1;}
    ;
%%

#include "lex.yy.c"

main(){
yyparse();
}
