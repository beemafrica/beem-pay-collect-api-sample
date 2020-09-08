package com.dp.api.model;

/**
 * ReceivedPaymentMessage .
 * 
 * @author admin
 *
 */
//@Getter
//@Setter
public class PaymentMessageDetail {

    /**
     * transaction_id .
     * 
     */
    public String transaction_id;
    
    /**
     * remote_transaction_id .
     * 
     */
    public String remote_transaction_id;
    
    /**
     * amount_collected .
     * 
     */
    public int amount_collected;
    
    /**
     * currency_from .
     * 
     */
    public String currency_from;
	
	/**
     * currency_to .
     * 
     */
    public String currency_to;
	
	
	/**
     * exchange_rate .
     * 
     */
    public int exchange_rate;
	
	/**
     * subscriber_msisdn .
     * 
     */
    public String subscriber_msisdn;
	/**
     * reference_number .
     * 
     */
    public String reference_number;
	/**
     * paybill_number .
     * 
     */
    public String paybill_number;
	/**
     * timestamp .
     * 
     */
    public String timestamp;
	/**
     * network_mcc .
     * 
     */
    public int network_mcc;
	
	/**
     * network_mnc .
     * 
     */
    public int network_mnc;
	
	/**
     * network_name .
     * 
     */
    public String network_name;
	
}
