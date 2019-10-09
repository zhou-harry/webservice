
package com.harry.ws.server.wsdl.settlement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>orderRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="orderRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fasOrderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="setlDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orderRequest", namespace = "http://harry.org/ws/schema", propOrder = {
    "fasOrderNo",
    "setlDate"
})
public class OrderRequest {

    @XmlElement(namespace = "http://harry.org/ws/schema")
    protected String fasOrderNo;
    @XmlElement(namespace = "http://harry.org/ws/schema")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar setlDate;

    /**
     * 获取fasOrderNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFasOrderNo() {
        return fasOrderNo;
    }

    /**
     * 设置fasOrderNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFasOrderNo(String value) {
        this.fasOrderNo = value;
    }

    /**
     * 获取setlDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSetlDate() {
        return setlDate;
    }

    /**
     * 设置setlDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSetlDate(XMLGregorianCalendar value) {
        this.setlDate = value;
    }

}
