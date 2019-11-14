package com.lzy.exception;

public class LoginFail extends RuntimeException {
    public LoginFail(String message) {
        super(message);
    }
}
