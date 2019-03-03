%%
[a-z]     { return IDENT; }
[0-9]+    { return NUMBER; }
"+"       { return PLUS; }
"-"       { return MINUS; }
"*"       { return MULT; }
"/"       { return DIV; }
"("       { return LPAR; }
")"       { return RPAR; }
"="       { return EQ; }
"<="      { return LE; }
"<"       { return LT; }
">="      { return GE; }
">"       { return GT; }
"=="      { return EQEQ; }
"!="      { return NEQ; }
"print"   { rerurn PRINT; }
"while"   { return WHILE;}
"cond"    { return COND; }
"end"     { return END; }
[\t\n ]   {}
.         {
            printf("bad input character!");
            printf("ignored!\n");
          }
