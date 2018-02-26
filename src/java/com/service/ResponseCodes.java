/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

/**
 *
 * @author Temitope
 */



 public enum ResponseCodes {
  SUCCESS("00","Approved or completed successfully"),
  Refer_to_card_issuer("01","Refer to card issuer"),
  Error("06","Error"),
  No_action_taken("21","No action taken"),
  Dormant_Account("26","Dormant Account"),
  Invalid_Account("52","Invalid Account"),
  Do_not_honor("05","Do not honor"),
  Request_processing_in_progress("09","Request processing in progress"),
  Invalid_transaction("12","Invalid transaction"),
  Invalid_Amount("13","Invalid Amount"),
  Invalid_Batch_Number("14","Invalid Batch Number"),
  Invalid_Session_or_Record_ID("15","Invalid Session or Record ID"),
  Unknown_Bank_Code("16","Unknown Bank Code"),
  Invalid_Channel("17","Invalid Channel"),
  Wrong_Method_Call("18","Wrong Method Call"),
  Unable_to_locate_record("25","Unable to locate record"),
  Duplicate_record("26","Duplicate record"),
  Format_error("30","Format error"),
  Contact_sending_bank("35","Contact sending bank"),
  No_sufficient_funds("51","No sufficient funds"),
  Transaction_not_permitted_to_sender("57","Transaction not permitted to sender"),
  Transaction_not_permitted_on_channel("58","Transaction not permitted on channel"),
  Transfer_limit_Exceeded("61","Transfer limit Exceeded"),
  Security_violation("63","Security violation"),
  Exceeds_withdrawal_frequency("65","Exceeds withdrawal frequency"),
  Response_received_too_late("68","Response received too late"),
  Unsuccessful_Account_Amount_block("69","Unsuccessful Account/Amount block"),
  Unsuccessful_Account_Amount_unblock("70","Unsuccessful Account/Amount unblock"),
  Empty_Mandate_Reference_Number("71","Empty Mandate Reference Number"),
  Beneficiary_Bank_not_available("91","Beneficiary Bank not available"),
  Routing_error("92","Routing error"),
  Duplicate_transaction("94","Duplicate transaction"),
  System_malfunction("96","System malfunction"),
  Timeout("97","Timeout waiting for response from destination")
  ;
  
  
  private String code, message;
 
    private ResponseCodes(String value, String message) {
    this.code = value;
    this.message = message;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getMessage(){
        
        return message;
    }
    
  }

