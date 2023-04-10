package top.brightzm.exception;

/**
 * @description:
 * @author: bright
 * @time: 2023/4/3 上午11:09
 */
public class NameFormatException extends RuntimeException{

    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}
