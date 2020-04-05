package com.aladdin.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 统一返回结果
 * @param <T>
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ResponseResult<T> {

    private int code;
    private String msg;
    private T data;// 数据

}