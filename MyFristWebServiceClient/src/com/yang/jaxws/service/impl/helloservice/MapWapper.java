
package com.yang.jaxws.service.impl.helloservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>mapWapper complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="mapWapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="map" type="{http://impl.service.jaxws.yang.com/}UserMapArray" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mapWapper", propOrder = {
    "map"
})
public class MapWapper {

    protected UserMapArray map;

    /**
     * ��ȡmap���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link UserMapArray }
     *     
     */
    public UserMapArray getMap() {
        return map;
    }

    /**
     * ����map���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link UserMapArray }
     *     
     */
    public void setMap(UserMapArray value) {
        this.map = value;
    }

}
