%{
int yylex();
void yyerror(const char *s);
/***実行手順
* yacc ex1.y
* lex ex1.l
* gcc y.tab.c -ly -ll
* ./a.out
***/
%}

%token PLUS MINUS MULT DIV
%token NUM NL
%%

S   :  Ls;
Ls   : Ls Line | Line ;
Line : E NL {printf("%d\n",$1);}
E    : E PLUS T { $$ = $1 + $3; } | E MINUS T { $$ = $1 - $3; } | T { $$ = $1;} ;
T    : T MULT F {$$ = $1 *  $3;} | T DIV F {$$ = $1 / $3 ;} | F { $$ = $1;};
F    : NUM { $$ = $1;};

%%

#include "lex.yy.c"

main(){
yyparse();
}
