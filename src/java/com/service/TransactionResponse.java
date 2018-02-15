/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author wumoru
 */
@Getter @Setter
@XmlRootElement(name = "TransactionResponse")
public class TransactionResponse {
    
     @XmlElement(name = "ResponseCode")
    private String ResponseCode;
      
     @XmlElement(name = "ResponseMessage")
    private String ResponseMessage;
       
      
}
