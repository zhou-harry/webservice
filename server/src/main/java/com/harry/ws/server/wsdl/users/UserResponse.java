
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
 *         &lt;element name="user" type="{http://harry.org/ws/schema}User"/&gt;
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
    "user",
    "timestamp"
})
@XmlRootElement(name = "UserResponse", namespace = "http://harry.org/ws/schema")
public class UserResponse {

    @XmlElement(namespace = "http://harry.org/ws/schema", required = true)
    protected User user;
    @XmlElement(namespace = "http://harry.org/ws/schema")
    protected long timestamp;

    /**
     * 获取user属性的值。
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * 设置user属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
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
