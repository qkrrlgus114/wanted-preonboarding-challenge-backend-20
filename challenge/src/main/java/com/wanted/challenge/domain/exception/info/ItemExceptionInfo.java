package com.wanted.challenge.domain.exception.info;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ItemExceptionInfo {
    NOT_FOUND_ITEM(HttpStatus.BAD_REQUEST, "2001", "상품이 존재하지 않습니다.");


    private HttpStatus status;
    private String code;
    private String message;

    ItemExceptionInfo(HttpStatus status, String code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }
}
