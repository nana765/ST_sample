%{
    /*  教科書p57図3.5(b)について
        右再帰
    */
    
%}
%token NUMBER
%token PLUS

%%

S:E;
E:NUMBER PLUS E | NUMBER;

%%

#include "lex.yy.c"

main(){
    yyparse();
}