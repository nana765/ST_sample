%{
int yylex();
void yyerror(const char *s);
/***実行手順
* yacc ex2.y
* lex ex2.l
* gcc y.tab.c -ly -ll
* ./a.out
***/
%}

%token PLUS MINUS MULT DIV
%token NUM NL
%%

S   :  Ls;
Ls   : Ls Line | Line ;
Line : E NL {printf("\n");} ;
E    : E PLUS T { printf("  +"); } | E MINUS T { printf("  -"); } | T { } ;
T    : T MULT F {printf("  *");} | T DIV F {printf("  /");} | F { };
F    : NUM { printf("%4d",$1);};

%%

#include "lex.yy.c"

main(){
yyparse();
}
