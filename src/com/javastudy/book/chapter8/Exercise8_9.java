package com.javastudy.book.chapter8;

class UnsupportedFuctionException extends RuntimeException {
    private final int ERR_CODE;

    UnsupportedFuctionException(String msg, int code) {
        super(msg); //RuntimeException
        ERR_CODE = code;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    @Override
    public String getMessage() { //Exception 클래스의 getMessage 오버라이딩
        return "[" + ERR_CODE + "] " + super.getMessage();
    }
}

public class Exercise8_9 {
    public static void main(String[] args) throws Exception {
        throw new UnsupportedFuctionException("지원하지 않는 기능입니다.", 100);
    }
}
