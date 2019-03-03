%{
  int yylex();
  void yyerror(const char *s);
%}
%token NUMBER
%token PLUS MINUS MULT DIV
%token LPAR RPAR
%token IDENT
%token EQ
%token PRINT
%token WHILE END
%token LE LT GE GT EQEQ NEQ
%%

S: E | IDENT EQ E | PRINT E | WHILE COND Ss END;
E: E PLUS T | E MINUS T | T;
T: T MULT F | T DIV F | F;
F: NUMBER | LPAR E RPAR | IDENT;
Ss: Ss S | S;
COND: E LE E | E LE E | E GE E | E GT E | E EQEQ E | E NEQ E;
%%

#include "lex.yy.c"

int main(){
  yyparse();
}
