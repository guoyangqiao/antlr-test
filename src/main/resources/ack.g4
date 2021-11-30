grammar ack;

prog : stat+;

stat: expr NEWLINE          # exp
    | 'set' ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;

expr:
   'select' select_clause 'from' from_clause ('where' where_clause)? ('limit' limit_clause)? #select
  | field             #string
  | POSITIVE_INT   #int
  |'print' '${'ID'}'  #print
  |'visit http'  url     #visitHttp
;

url:
'http://' ID('.' ID)?
;

select_clause:
    field (',' field)?;

from_clause:
    field                                  # FROM_BASIC
  | field 'join ' field 'on' field '=' field  # FROM_JOIN
;

limit_clause: POSITIVE_INT;

where_clause:
   comparable '=' comparable   # EQ
 | comparable '<>' comparable  # NEQ
 | comparable '>' comparable   # GT
 | comparable '<' comparable   # LT

;
comparable:
    field            #C_FIELD
    | POSITIVE_INT  #P_INT
    ;

field :
  field '.' field             #RECURISVE_REF
| ID                        #ATOMIC
;

ID : [a-zA-Z]+ ;
POSITIVE_INT : [1-9] | [1-9][0-9]+ ;
NEWLINE: ';';
WS : [ \t\n]+ -> skip;