package top.brightzm.exception;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/3 上午11:14
 */
public class AgeOutOfBoundsException extends RuntimeException{

    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}
