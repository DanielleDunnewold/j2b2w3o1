public class SyntaxError extends Exception {
    public SyntaxError(String reason, String statement) {
        super(reason + ":" + statement);
    }

    public SyntaxError(String reason, String statement, Throwable cause) {
        super(reason + ":" + statement, cause);
    }
}
