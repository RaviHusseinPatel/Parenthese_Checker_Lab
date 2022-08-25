import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Stack;


//    parentheses include (), {}, []
//    For parentheses to be balanced:Our opening bracket must have a closing counterpart, in correct order.


//    The no. of opening parenthesis must = no. of closing ones (this is their counterpart
//    We can count this as: count of opening=count of closing,
//    but this won't work to test balance in some cases e.g.
//    )(   <<Rule 1 xx. Parentheses can close only when those after it are closed
//    { ( } ) : Here, closing curly brace can't close unless normal bracket is first.

//    We can scan the expression from left to right, so we can keep track of any unclosed Parentheses.
//    We create a list, whenever an opening symbol (opening parentheses/ opening curly brace/open square bracket
//    the following symbol in our list should be the closer for the last element in the list.
//    If there is an inconsistency resulting in unbalanced parentheses, we can print this

//    Each time we scan a symbol, it will be added to our list. It will ONLY be removed from our list
//    once it is closed, so this we'll end up with an empty list at the end if it oru Parentheses are balanced.

//    When we want to add and remove elements from the same end (FILO), we use a Stack (biscuittin) list.
//    when we get an opening symbol, we PUSH it onto the stack.
//    When we get a closing symbol: If of same type we POP, if not "Parenthesis unbalanced"

public class ParenthesesChecker {

//    let's create our stack (based on our Test File solution we call it checker) :
public static void main(String[] args) {

}
    static String isBalanced (String checker) {
        Stack<Character> stack = new Stack<Character>();  //content of our stack are characters

// Let's loop through our string using a for loop:

        for (int i = 0, i<checker.length(); i++) {

            if (checker.charAt(i)== '(' || checker.charAt(i)== '{' || checker.charAt(i)== '['); //char.at is character at this point, || is or
            stack.push(checker.charAt(i))  //= then push that character onto stack


    }
}





}
