package com.harry.ws.server.webservice.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author zhouhong
 * @version 1.0
 * @title: OrderRequest
 * @description: TODO
 * @date 2019/10/9 10:35
 */
public class OrderRequest implements Serializable {

    private String fasOrderNo;

    private Date setlDate;

    public String getFasOrderNo() {
        return fasOrderNo;
    }

    public void setFasOrderNo(String fasOrderNo) {
        this.fasOrderNo = fasOrderNo;
    }

    public Date getSetlDate() {
        return setlDate;
    }

    public void setSetlDate(Date setlDate) {
        this.setlDate = setlDate;
    }
}
