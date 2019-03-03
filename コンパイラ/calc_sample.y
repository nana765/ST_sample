%{
  int yylex();
  void yyerror(const char *s);
  /***簡易電卓***/
  /* yacc calc_sample.y
   * lex calc_sample.l
   * gcc y.tab.c -ly -ll
   * ./a.out
   */
%}
%left PLUS MINUS
%left MULT DIV
%token NUMBER

%%

S: E { printf("ans : %d\n",$1);}
 ;
E: E PLUS E { $$ = $1 + $3; }
 | E MINUS E { $$ = $1 - $3; }
 | E MULT E { $$ = $1 * $3 ;}
 | E DIV E {
              if($3 == 0){
              printf("error\n");
              YYERROR;
              }
              $$ = $1 / $3;
            }
 | NUMBER { $$ = $1 ;}
 ;

%%

#include "lex.yy.c"

int main(){
  yyparse();
}
