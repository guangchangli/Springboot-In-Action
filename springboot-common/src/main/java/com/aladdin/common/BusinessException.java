package com.aladdin.common;

import lombok.Getter;

/**
 * @author lgc
 **/
@Getter
public class BusinessException  extends RuntimeException{
    private Integer errCode;
    private String errMsg;
    public BusinessException(Integer errCode,String errMsg){
        super(errMsg);
        this.errCode=errCode;
        this.errMsg=errMsg;
    }
    public BusinessException(ResponseResult responseResult){
        super(responseResult.getMsg());
        this.errCode=responseResult.getCode();
        this.errMsg=responseResult.getMsg();
    }
    public BusinessException(EnumErrCode errCode){
        super(errCode.getMsg());
        this.errMsg=errCode.getMsg();
        this.errCode=errCode.getCode();
    }
}
