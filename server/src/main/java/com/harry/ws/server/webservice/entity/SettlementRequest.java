package com.harry.ws.server.webservice.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouhong
 * @version 1.0
 * @title: SettlementRequest
 * @description: TODO
 * @date 2019/10/9 10:33
 */
public class SettlementRequest implements Serializable {

    private String batchNo;

    private List<OrderRequest> orders;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public List<OrderRequest> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderRequest> orders) {
        this.orders = orders;
    }
}
