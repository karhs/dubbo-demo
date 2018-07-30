package com.demo.model;

import java.io.Serializable;

public class ResultDto implements Serializable {

    private int errCode;
    private String msg;
    private Object result;

    public ResultDto() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ResultDto(int errCode, String msg) {
        super();
        this.errCode = errCode;
        this.msg = msg;
    }

    public ResultDto(int errCode, String msg, Object result) {
        super();
        this.errCode = errCode;
        this.msg = msg;
        this.result = result;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }


}
