%{
  int yylex();
  void yyerror(const char *s);
%}
%token NUMBER
%token PLUS
%%

S:E;
E:E PLUS E | NUMBER;

%%

#include "lex.yy.c"

main(){
    yyparse();
}

void yyerror(){
    printf("syntax error\n");
    exit(1);
}