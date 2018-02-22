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
    
   
   private String Stan;
     
     
   private String ReferenceNo;
      
     
   private String Amount;
       
     
   private String AccountNo;
        
     
   private String TransactionType;
         
     
   private String TerminalID;
     
      
   private String ServiceCode;
      
       
   private String Narration;
       
        
   private String Currency;
        
         
   private String LogDate;
   
   private String T24Reference;
}
