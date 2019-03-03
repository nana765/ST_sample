%{
    /*  教科書p57図3.5(a)について
        左再帰
    */
    
%}
%token NUMBER
%token PLUS
%%

S:E;
E:E PLUS NUMBER | NUMBER;

%%

#include "lex.yy.c"

main(){
    yyparse();
}