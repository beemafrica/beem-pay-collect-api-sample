from flask import Flask,request,jsonify,Response;
import json;
import requests;
import pyodbc;
app = Flask(__name__)


@app.route('/submit',methods=['POST'])
def USSDCallback():
    data=request.get_json()
       transaction_id=data['transaction_id']
       amount_collected=data['amount_collected']
       source_currency=data['source_currency']
       target_currency=data['target_currency']
       subscriber_msisdn=data['subscriber_msisdn']
       reference_number=data['reference_number']
       paybill_number=data['paybill_number']
       timestamp=data['timestamp']
       mcc_network=data['mcc_network']
       mnc_network=data['mnc_network']
       network_name=data['network_name']
    
    return Response(
        transaction_id,
        "successful": "true"
        status=200,
    )
    
    
@app.errorhandler(500)
def server_error(e):
    errorName="Error"
    return Response(
        json.dumps(errorName),
        status=500,
    )


if __name__ == '__main__':
    app.run(debug=True)