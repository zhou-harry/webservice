package com.harry.ws.server.webservice.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouhong
 * @version 1.0
 * @title: SettlementResponse
 * @description: TODO
 * @date 2019/10/9 10:30
 */
public class SettlementResponse implements Serializable {

    private String batchNo;

    private List<OrderResponse> orderDetails;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public List<OrderResponse> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<OrderResponse> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
