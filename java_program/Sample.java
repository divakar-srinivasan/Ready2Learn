/*  Definition:
Token :

 A token is the smallest individual unit ( building block )
 of a java program that the java compiler can understand.

int age = 20;

token 1 : int
token 2 : age 
token 3 : =
token 4 : 20
token 5 : ;

I learn java
I
learn 
java

5 types of Tokens:

1.Keywords
2.identifiers
3.literals
4.Operators
5.Separators


1. Keywords:

Keywords are reserved words that have a predefined meaning
in java.

example:
* int
* class
* if

2. Identifiers:

Identifiers are names given by the programmer.

int age = 20;

age is an identifier.

[name ] = [identifier]

3. literals:

literals are fixed values written directly in the program.

int age = 20;

20 - literals
3.14 - literals
'A' - literals
true - literals
"Hello" - literals

[value] - [literals]

4. Operator 

Operators perform operations.

[Operand] [operator] [operand]

Example:
+ ,  - ,  * ,  /

5. Separators:

Separators are symbols that separate different parts of a java
program.

example:
[] 
()
{}
.
;
,

System.out.println("hello");

int age = 20;


Keywords:

1. Data type keywords:

int 
double
float
char
boolean
byte
short
long

2. Access Keywords:

public
private
protected

3. class Keywords:

class
interface
extends
implements

4. Object keywords:

new
this
super

5. Decision making keywords:

if
else
switch
case
default

6. Loop Keywords:

for 
while
do
break
continue

7. Exception Handling Keywords:

try
catch
finally
throw
throws

8. Return Keyword:

return

----------------------

Identifiers:

Identifier are names created by the programmer.

Naming- convention:

java naming conventions are standard rules for naming classes,
variables, methods, packages and constants. they improve code 
readability, maintainability and teamwork.

programmer 1 : StudentDetails
programmer 2 : studentdetails
programmer 3 : Studentdetails
programmer 4 : studentDetails

Naming conventions - Standard naming 

Types of naming conventions:

1. PascalCase ( StudentDetails )
2. CamelCase  ( studentDetails )
3. snake_case   ( student_details )
4. UPPER_SNAKE_CASE ( STUDENT_ID )

1. class names: public class SampleProgram
-> PascalCase

2. Interface name:
-> PascalCase

3.Method Names:
->camelCase

4. Variable Names:  Ex: studentName
-> camelCase

5. Constant Names Ex: PI
-> UPPER_SNAKE_CASE

6. Package Names:
-> lowerscase Letters

7. Object Names:
-> camelCase

[ $ _ ]

Valid Names:
1. student
2. student1
3. $Cost
4. _marks

Not Valid Names:
1. 1student
2. @gmail
3. hash#1

-> Variables :

A variable is a named memory used to store data.
Simple Analogy : Variable ( container or bottle )
                 to store water ( value)

30 -> student1Mark
30 -> student2Mark
50 -> student3Mark

Identifier -> Name 
Variable -> memory storage

Bottle (variable) -> Milton, Bizlari (identifer)


-> Variable Declaration:
Before using a variable, we must declare it.

Tokens:
int age;

-> Variable Initialization:
Assigning a value to a variable is called Initialization
age = 10;

-> Declaration + Initialization
int age = 20;

-> Updating a variable:
int age = 20;
age = 21;


Types of Variables ( Basic Intro )

-> Local Variable
-> Instance Variable
-> Static Variable

-> Data Types:

A data type specifies what kind of data a variable
can store

Data Types:
-> Primitive 
-> Non-primitive

-> Primitive Data Types ( 8 types )

1. byte  ( byte marks = 100 )
2. short    ( short year = 2026 )
3. int  ( int pin = 636123 )
4. long ( long phone = 1234567890L )
5. float ( float price = 99.5f )
6. double   ( double salary = 550000.465849 )
7. char     ( char grade = 'A' )
8. boolean  ( boolean success = true / false )

Non-Primitive Data Types:

These are created using classes and objects.

Examples.
-> String
-> Arrays
-> Classes
-> Interfaces


-> Literals:

A literals is a fixed value written directly in the
source code.

value -> literals

-> Expression:

An expression is a combination of variables,
literals, operators and method calls that
produces a single.

Simple :
An expression is any statement that java can
evalute to produce one result.

[Operand] [operator] [operand] <- Maths
[Variable] [Operator] [Variable] <- Java

a+b => 10 + 10 -> 20
        10 + 10 * 5 = 100 || 60



-> Comments:

Comments are used to explain the code to humans,
not to the computer.

types:

singel line -> //
multi line -> 


Java Operators:

An operator is a symbol that perform an operations on one or more
values.

Types of operators:

1. Arithmetic: 
    Used to perform mathematical calculations
    ( + - * / % )

    Ex: int c = a+b;

2. Assignment:  
    used to asign values to variable;
    ( =  +=  -=  *=  /=  %= ) 

    Ex: int age = 20; 
        age +=10; 


3. Relational:   
    Used to compare two values(operand) ( a<b )
    (   ==  !=  >   <   >=  <=  )
    Ex : a==b

4. Unary:
    Unary operators works with only one operand
    (   ++  --  +   -   !   ~   )
    Ex: a++

5. Logical
    used to combine multiple conditions.  
    (   && (Logical AND)    || (Logical OR)     ! (Logical NOT))


6. Bitwise:

    word on the binary ( 0s and 1s) represents of number

    & (AND)   -   Bitwise AND  
    | (Pipe)  -   Bitwise OR
    ^ (Cap)  -   Bitwise XOR
    ~ (tilde)   - Bitwise NOT
    <<          - left shift
    >>          - Right Shift


7. Ternary:

    if(Condition){
     true -> runs v1
    }else{
     false -> runs v2
    }

    A shorthand for an if-else statement:

    condition ? return v1 : return v2;

    class Main {
    public static void main(String[] args) {
        
        int age = 20;
        System.out.println(age > 18 ? "Adult" : "Minor");
}
}


8. Instanceof

Checks whether an object belongs to a particular class

String name = "Divakar";

------------------------------


Bitwise Operator:

Binary :
binary number is a number represented using only two digits(0 1)

decimal:
Numerical representation (1,2,3,4...)

1 byte = 8 bits (byte)
2 byte = 16 bits (short)
4 byte = 64 bits (int)
8 byte = 128 bits (long)

0001 0010 
0011 0100

1 2
3 4

1 - 0001
2 - 0010
3 - 0011
15 - 1111

    128 64 32 16 8 4 2 1
    0   0   0  1 0 0 1 1 = 19


16 - 0001 0000
..
255 - 1111 1111

0000 0000 0000 0000

Bitwise operators works only on integer types:

byte 
short
int 
long 
char - A B C D ... Z


1. Bitwise AND (&)

if both bits 1 , then 1
otherwise 0

a   b   output
0   0   0
0   1   0
1   0   0
1   1   1

int a=5;
int b=3;
System.out.println(a&b);

0101
0011
----
0001

result = 1

2. Bitwise OR (|)

atleast one bit 1, then 1
else 0

a   b   output
0   0   0
0   1   1
1   0   1
1   1   1

int a=5;
int b=3;
System.out.println(a&b);

0101
0011
----
0111

result = 7

3. Bitwise XOR (^)

Same bits -> 0
different bits -> 1

a   b   output
0   0   0
0   1   1
1   0   1
1   1   0

int a=5;
int b=3;
System.out.println(a^b);

0101
0011
----
0110

result = 6

4. Bitwise NOT (~)

it works on only one number and reverses every bits

0 -> 1
1 -> 0

int a=5;
System.out.println(~a);

Bitwise 32 bits work

0000 0000 0000 0000 0000 0000 0000 0101

1111 1111 1111 1111 1111 1111 1111 1010

{-(a+1)}

result = -6

a=10

0000 0000 0000 0000 0000 0000 0000 1010
1111 1111 1111 1111 1111 1111 1111 0101

result = -11


5. left shift (<<)

-> 1010
-> 0101

6. right shift (>>)

-> 1101
-> 1110


Type Casting:

Type casting is the process of converting one data type into
another data type.

java performs this conversion in two ways:

1. Implicit  type casting
2. Explicit type casting

Example :

int -> double 

1. Implicit Type casting:

java automatically converts a smaller data type into a larger 
data type.

possible:
int age = 20;  
double result = age; 20.0000000

impossible:
double age = 20.00;
int result = age;


byte -> short -> int -> long 
                     -> float -> double

2. Explicit Type casting:

java converts a larger data type into a smaller data type
only when the programmer explicitly specifies the 
conversion.

Example:

double price = 99.99;
int value = (int)price; 99


double marks = 95.75;
int result = (int)marks;


-> User Input (Scanner):

Scanner is a predefined java class used to read input from the
keyboard.

import java.util.Scanner;
public class Sample{
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        int age = sc.nextInt();
        double salary = sc.nextDouble();
        float weight =  sc.nextFloat();
        long mobile = sc.nextLong();
        short year = sc.nextShort();
        Byte number =  sc.nextByte();
        Boolean value = sc.nextBoolean();
        char grade = sc.next.charAt();
        String name =  sc.next();
        String fullName= sc.nextLine();
    }
}

Ouput Methods:

Output methods display information to the console(Screen)

1. print():
print text without moving to the next line.

EX:
System.out.print("Hello");

2. println():
print text and moves to the next line.

Ex:
System.out.println("Hello");

3. printf()
used for formatted output.

Ex:
String name = "Divakar";
System.out.printf("Name : %s ",name);



























*/


class Solution{
    //addition
    public int sum(int num1, int num2){
        return num1+num2;
    }
    //subraction
        public int sub(int num1, int num2){
        return num1-num2;
    }
    //multiplication
        public int mul(int num1, int num2){
        return num1*num2;
    }
    //division
        public int div(int num1, int num2){
        return num1/num2;
    }
}


public class Sample{
    public static void   main(String agrs[]){
        Solution         sol =    new Solution();
        System . out . println ( sol . sum(12,5) );
    }
}