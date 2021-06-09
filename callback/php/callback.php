<?php

$data = file_get_contents('php://input');
$data = json_decode($data, true);


    $transaction_id=$data['transaction_id'];
    $remote_transaction_id=$data['remote_transaction_id'];
    $successful=$data['successful'];
    $amount_collected=$data['amount_collected'];
    $currency_from=$data['currency_from'];
    $currency_to=$data['currency_to'];
    $exchange_rate=$data['exchange_rate'];
    $subscriber_msisdn=$data['subscriber_msisdn'];
    $reference_number=$data['reference_number'];
    $paybill_number=$data['paybill_number'];
    $timestamp=$data['timestamp'];
    $network_mcc=$data['network_mcc'];
    $network_mnc=$data['network_mnc'];
    $network_name=$data['network_name'];
      

$res= array('transaction_id' => $transaction_id, 
            'successful'=>'TRUE');

    
$json = json_encode($res);
echo $json;
?>