package exception;

public class BalansOverflowException extends RuntimeException {

    public BalansOverflowException() {
        this("Overbelasting");
    }

    public BalansOverflowException(String message) {
        super(message);
    }

}
