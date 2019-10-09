package com.harry.ws.server.webservice.entity;

import java.io.Serializable;

/**
 * @author zhouhong
 * @version 1.0
 * @title: OrderResponse
 * @description: TODO
 * @date 2019/10/9 10:31
 */
public class OrderResponse implements Serializable {

    private String fasOrderNo;

    private String status;

    private String errorMsg;

    public String getFasOrderNo() {
        return fasOrderNo;
    }

    public void setFasOrderNo(String fasOrderNo) {
        this.fasOrderNo = fasOrderNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public OrderResponse() {
    }

    public OrderResponse(String fasOrderNo) {
        this.fasOrderNo = fasOrderNo;
        this.status = "Y";
        this.errorMsg = "操作成功";
    }
}
