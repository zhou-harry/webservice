
package com.harry.ws.server.wsdl.users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="timestamp" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userId",
    "timestamp"
})
@XmlRootElement(name = "UserIdRequest", namespace = "http://harry.org/ws/schema")
public class UserIdRequest {

    @XmlElement(namespace = "http://harry.org/ws/schema")
    protected long userId;
    @XmlElement(namespace = "http://harry.org/ws/schema")
    protected long timestamp;

    /**
     * 获取userId属性的值。
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * 设置userId属性的值。
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * 获取timestamp属性的值。
     * 
     */
    public long getTimestamp() {
        return timestamp;
    }

    /**
     * 设置timestamp属性的值。
     * 
     */
    public void setTimestamp(long value) {
        this.timestamp = value;
    }

}
