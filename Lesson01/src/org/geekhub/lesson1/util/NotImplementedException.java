package org.geekhub.lesson1.util;

public class NotImplementedException extends RuntimeException {
    public NotImplementedException() {
        super("Implement me, please!");
    }
}
