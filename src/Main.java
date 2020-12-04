import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	try{
    String input="{stringtobetested}";  //this is the string that needs to be tested
	checkStack(input);}                   //tests the String
	catch (SyntaxError e){               // and catches an error when something goes wrong
        JOptionPane.showMessageDialog(null,
                e.getMessage());
        }

    }

    /**
     * checks if the symbols (,{ and [ are paired up with the right symbol
     * @param input String that is going to be tested
     * @throws SyntaxError if the symbols (, { and [ aren't match up properly it throws this error
     */
    public static void checkStack(String input) throws SyntaxError{
        Stack<Character> theStack= new Stack<>(10);
        //loops over the String
        for (int i=0; i<input.length();i++){
            char ch =input.charAt(i);              // get the char at the position we are
            switch (ch) {
                case '{', '[', '(' ->{ theStack.push(ch);}    //put the symbol on the stack if it is a {,[ or(
                case '}', ']', ')' -> {
                    if(!theStack.isempty()){           //checks if the string isn't empty
                    char chx = theStack.pop();         //checks the symbol before on the stack
                    if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '(')) {
                        //cheks if the symbol matches so a closing brackets follows up a opening one. if not
                        //it throws an error
                        throw new SyntaxError("Syntax problem", Character.toString(ch)); } }

                    else{   //stack empty to early, so exception is thrown
                        throw new SyntaxError("Syntax problem",Character.toString(ch));} }
        }}
        if (!theStack.isempty()){
            //on the end it get checked if the stack is empty, when it is not a exception is thrown
            throw new SyntaxError("Syntax problem",theStack.toString());
        } }}
