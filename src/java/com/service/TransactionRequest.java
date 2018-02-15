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
@XmlRootElement(name = "TransactionRequest")
public class TransactionRequest {
    
    @XmlElement(name = "Stan")
   private String Stan;
     
     @XmlElement(name = "ReferenceNo")
   private String ReferenceNo;
      
     @XmlElement(name = "Amount")
   private BigDecimal Amount;
       
     @XmlElement(name = "AccountNo")
   private String AccountNo;
        
     @XmlElement(name = "TransactionType")
   private String TransactionType;
         
     @XmlElement(name = "TerminalID")
   private String TerminalID;
     
      @XmlElement(name = "ServiceCode")
   private String ServiceCode;
}
