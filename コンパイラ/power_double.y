%{
#include <math.h>
#define YYSTYPE double
/***実行手順
* yacc power_double.y
* lex power_double.l
* gcc y.tab.c -ly -ll -lm
* ./a.out
***乗算の計算***
***/
%}

%token POWER
%token NUM
%%

S   : E {printf("%f\n",$1);}
    ;
E   : E POWER E {$$ = pow($1,$3);}
    | NUM {$$ = $1;}
    ;
%%

#include "lex.yy.c"

main(){
yyparse();
}
