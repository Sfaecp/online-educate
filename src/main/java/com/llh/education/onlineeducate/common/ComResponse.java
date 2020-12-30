package com.llh.education.onlineeducate.common;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ComResponse<T> {

    private String code;

    private String msg;

    private T data;

    public ComResponse(T data) {
        this.data = data;
    }
    public static <T> ComResponse<T> handleSuccess(T data) {
        return new ComResponse("000000", "success", data);
    }
}
