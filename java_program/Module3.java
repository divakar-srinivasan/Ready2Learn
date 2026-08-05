/*
Java Decision Making:

Decision making statemets allow a program to make decisions and 
execute different blocks of code based on conditions.

                    condition
                        |
                true        false

                A block     B block


1. if Statement:

The if statements executes a block of code only if the condition
is true.

if condition is false, nothing happens

Syntax:

if(condition){
    //statement
}

Example:

public class Example{
    public static void main(String args[]){
        int age = 18;
        if(age>=18){
            System.out.println("Eligible for vote");
        }
    }
}


2. if-else Statement:

where there are twoo possible outcomes, use if-else

true -> if block
false -> else block

if(condition){
    //true block
}else{
    //false block
    }

Example:

public class Example{
    public static void main(String args[]){
        int age = 18;
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not Eligible for vote");
            }
    }
}


else-if Ladder:

used when three are multiple conditions.
the program checks from top to bottom.
the first true condition is executed
remaining skipped.

Syntax:

if(Condition 1){
    // block 1
}
else if(Condition 2){
    // block 2
}
else if( Condition 3){
    //block 3
}
else{
    // false block
}


Example:

public class GradeExample{
    public static void main(String agrs[]){
        int mark = 55;

        if(mark >= 90){
            System.out.println("Grade A");
        }
        else if(mark >= 80){
            System.out.println("Grade B");
        }
        else if(mark >= 70){
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
    }
}

4. Nested if:

An if statement inside another if statement is called nested if.

Syntax :

if(condition1){
    if(condition2){
        if(condition 3){
            // block execute
        }
    }
}

Example:

public class ATM{
    public static void main(String args[]){
        int pin = 1234;
        int balance = 1000;
        int withdraw = 500;

        if(pin == 1234){
            if(balance >= withdraw){
                System.out.println("Sucessful");
            }
        }
    }
}


5.Switch Statement:

the switch statement is used when one variable has multiple fixed choices.

Example:

public class SwitchExample{
    public static void main(String agrs[]){
        int day =3 ;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}

Modern Switch Case:

public class Main{
    public static void main(String agrs[]){
        int day = 3 ;
        
        String name = switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };
        System.out.println(name);
        
    }
}



2. Looping Statements
Definition

Loops execute a block of code repeatedly until a condition becomes false.

-> for Loop:

The for loop is used when the number of iterations is known.

Syntax
        for (initialization; condition; update) {

        }

Flow:

Initialization
      ↓
Condition
      ↓
True → Statements
      ↓
Update
      ↓
Condition Again

Example:

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println(i);

        }

    }
}

Output:
1
2
3
4
5


-> while Loop:

The while loop executes as long as the condition remains true.

Syntax:

while (condition) {

}

Example:

public class Main {

    public static void main(String[] args) {

        int i = 1;

        while (i <= 5) {

            System.out.println(i);

            i++;
        }

    }
}

Output
1
2
3
4
5

-> do-while Loop:

The do-while loop executes the block at least once, even if the condition is false.

Syntax:

do {

} while (condition);

Example:

public class Main {

    public static void main(String[] args) {

        int i = 6;

        do {

            System.out.println(i);

            i++;

        } while (i <= 5);

    }
}
Output
6


-> Enhanced for Loop (For-Each):

The Enhanced for loop is used to iterate through arrays or collections without using an index.

Syntax:

for (datatype variable : array) {

}

Example:

public class Main {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};

        for (int number : numbers) {

            System.out.println(number);

        }

    }
}

Output:

10
20
30
40


-> break:

The break statement immediately terminates the loop or switch statement.

Example:

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);

        }

    }
}

Output
1
2
3
4
5

-> continue:


The continue statement skips the current iteration and moves to the next iteration of the loop.

Example

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);

        }

    }
}
Output
1
2
4
5

-> return:


The return statement ends the execution of a method and optionally returns a value to the caller.

Example 1: Returning a Value
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int result = add(10, 20);

        System.out.println(result);

    }
}
Output
30
Example 2: Exiting a Method Early
public class Main {

    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Not Eligible");
            return;
        }

        System.out.println("Eligible");

    }

    public static void main(String[] args) {

        checkAge(16);

    }
}
Output
Not Eligible

The return statement stops the method immediately, so "Eligible" is never printed.

*/