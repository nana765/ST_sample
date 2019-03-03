%%
[0-9]+  {
          yylval = atof(yytext);
          return NUM;
        }
"^"     { return POWER; }
[\t\n ] {}
.       { printf("bad input character!!\n"); }
