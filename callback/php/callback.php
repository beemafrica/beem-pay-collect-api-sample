<?php

$data = file_get_contents('php://input');
$data = json_decode($data, true);


    $transaction_id=$data['transaction_id'];
    $amount_collected=$data['amount_collected'];
    $source_currency=$data['source_currency'];
    $target_currency=$data['target_currency'];
    $subscriber_msisdn=$data['subscriber_msisdn'];
    $reference_number=$data['reference_number'];
    $paybill_number=$data['paybill_number'];
    $timestamp=$data['timestamp'];
    $mcc_network=$data['mcc_network'];
    $mnc_network=$data['mnc_network'];
    $network_name=$data['network_name'];
      

$res= array('transaction_id' => $transaction_id, 
            'successful'=>'TRUE');

    
$json = json_encode($res);
echo $json;
?>