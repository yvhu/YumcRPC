package com.huyv.client.rpc;

import lombok.Data;

@Data
public class Result {
    private Boolean success;
    private String message;
    private String resultType;
    private String resultValue;
}
