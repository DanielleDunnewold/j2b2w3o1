import java.security.KeyStore;

public class Stack<X> {
private final int maxSize;
private final X[] stackArray;
private int top;

public Stack(int max){
    maxSize = max;
    //makes an array of objects and cast it to X[] so the object can be determined later
    stackArray =(X[]) new Object[maxSize];
    top= -1;}

    /**
     * add an value to the top
     * @param j the value that needs to be added
     */
    public void push(X j){
    if(top+1<maxSize){   //checks if the stack isn't full
    stackArray[++top]=j;}     //move to the next place and add the value
    else {
        System.out.println("array is full");
    }
}

    /**
     * pops the last character of the stack
     * @return the value that got add last
     * @throws SyntaxError throws an error when the stack is empty
     */
    public X pop() throws SyntaxError{
    if (top>-1){ //checks if the stack isn't empty
      return stackArray[top--];  //return the value on top and moves one place back.
        // the value would still remain in the array, but infront of the top.
        // so we can no longer access it anymore with this object
        // If we add values later we simply overwrite it.
    }
    else{
        throw new SyntaxError("Syntax problem",
                stackArray[top].toString());
    }
}

    /**
     * checks if the stack is empty
     * @return a boolean, true when it is empty, false when it isn't
     */
    public boolean isempty(){
    return top == -1;// checks if it empty
}

    /**
     * print the top value if the print function is called
     * @return the top value
     */
    public String toString() {
    if (!this.isempty()) { //checks if it is not empty
        return String.valueOf(stackArray[top]);    //returns the top value
    }
    else{
        return "string is empy"; //if it is empty to prints that
    }
}


}
