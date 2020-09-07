from flask import Flask,request,jsonify,Response;
import json;
import requests;
import pyodbc;
app = Flask(__name__)


@app.route('/submit',methods=['POST'])
def PaymentCallback():
    data=request.get_json()
    transaction_id1=data['transaction_id']
    remote_transaction_id1=data['remote_transaction_id']
    amount_collected1=data['amount_collected']
    currency_from1=data['currency_from']
    currency_to=data['currency_to']
    
    exchange_rate=data['exchange_rate']
    subscriber_msisdn=data['subscriber_msisdn']
    reference_number=data['reference_number']
    paybill_number=data['paybill_number']
    timestamp=data['timestamp']
    network_mcc=data['network_mcc']
    network_mnc=data['network_mnc']
    network_name=data['network_name']
    
    newData = {
    "transaction_id":transaction_id1,
    "successful":"true"
    }
    return Response(
        json.dumps(newData),
        status=200,
    )
    
    
@app.errorhandler(500)
def server_error(e):
    errorName="Server Error"
    return Response(
        json.dumps(errorName),
        status=500,
    )


if __name__ == '__main__':
    app.run(debug=True)
