package exception.basic.unchecked;

// unchecked exception
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
