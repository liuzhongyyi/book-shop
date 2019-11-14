package com.lzy.exception;

public class RepeatRegister extends RuntimeException {
    public RepeatRegister(String message) {
        super(message);
    }
}
