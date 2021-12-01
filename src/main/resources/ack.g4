grammar ack;
// 一个program是多个stat组成
prog : stat+;
// 一个stat是  expr 或 赋值 或 newline
stat: expr NEWLINE          # exp
    | 'set' ID '=' expr NEWLINE   # assign
    | NEWLINE               # blank
    ;
// 一个expr 是 SQL 或 字符串 或 int 或 打印 或 访问http
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
// 一个select cluase 是 至少一个域
select_clause:
    field (',' field)?;
// 一个from clause 不是 一个简单的表 就是两表 join
from_clause:
    field                                  # FROM_BASIC
  | field 'join ' field 'on' field '=' field  # FROM_JOIN
;
// limit 是一个正整数
limit_clause: POSITIVE_INT;
// where 是 单个数学运算比较
where_clause:
   comparable '=' comparable   # EQ
 | comparable '<>' comparable  # NEQ
 | comparable '>' comparable   # GT
 | comparable '<' comparable   # LT
;
// 操作数不是一个域就是一个正整数
comparable:
    field            #C_FIELD
    | POSITIVE_INT  #P_INT
    ;
// 域 不是一个单字段引用 就是一个深度引用
field :
  field '.' field             #RECURISVE_REF
| ID                        #ATOMIC
;
// id是大小写字符组成的
ID : [a-zA-Z]+ ;
//正整数定义
POSITIVE_INT : [1-9] | [1-9][0-9]+ ;
//新一行定义
NEWLINE: ';';
//换行忽略
WS : [ \t\n]+ -> skip;