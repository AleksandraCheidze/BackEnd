package exceptions_error.task_4;

public class TooSmallAgeException extends RuntimeException {

  public TooSmallAgeException(String message) {
    super(message);
  }
}
