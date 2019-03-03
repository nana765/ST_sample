%{
int yylex();
void yyerror(const char *s);
int var[26];
/***実行手順
* yacc ex2.y
* lex ex2.l
* gcc y.tab.c -ly -ll
* ./a.out
***/
%}


%token PROGRAM
%token WRITE
%token LBRACE RBRACE
%token ID EQ
%token PLUS MINUS MULT DIV NUM
%token SEMI

%%
LANG : PROGRAM BLOCK;
BLOCK : LBRACE STATEMENTS RBRACE;
STATEMENTS : STATEMENTS ASTATEMENT | ASTATEMENT ;
ASTATEMENT : ID EQ E SEMI { var[$1-'a']=$3;} | WRITE E SEMI { printf("%d\n",$2);} ;

E    : E PLUS T { $$ = $1 + $3;} | E MINUS T { $$ = $1 - $3; } | T { $$ = $1 ;} ;
T    : T MULT F { $$ = $1 * $3; } | T DIV F { $$ = $1;} | F {$$ = $1;};
F    : NUM { $$ = $1;} | ID { $$ = var[$1 - 'a'];} ;

%%

#include "lex.yy.c"

main(){
yyparse();
}
