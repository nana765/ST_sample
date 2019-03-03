%%

"program"  { return PROGRAM; }
"write"        { return WRITE;}
"{"               { return LBRACE ;}
"}"             { return RBRACE; }
"+"       { return PLUS; }
"-"       { return MINUS; }
"*"       { return MULT; }
"/"       { return DIV; }
"="     { return EQ;}
";"       { return SEMI;}
[0-9]+    { yylval = atoi(yytext);
return NUM; }
[a-z]    { yylval = yytext[0];
return ID ;}
[  \t\n]+    {/*do nothing*/}
.              {/*do nothing*/}
