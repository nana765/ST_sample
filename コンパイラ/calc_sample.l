%%
[0-9]+  {
          yylval = atoi(yytext);
          return NUMBER;
        }
"+"       { return PLUS; }
"-"       { return MINUS; }
"*"       { return MULT; }
"/"       { return DIV; }
[\t\n ] {}
.       { printf("bad input character!!\n"); }
