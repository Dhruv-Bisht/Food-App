package com.dhruv.FoodApp.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response<T> {

    private int statusCode; // 200, 404
    private String message; // additional info about the response
    private T data;  // actual data payload
    private Map<String, Serializable> meta;

}
