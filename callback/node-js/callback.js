const express = require("express");
const bodyParser = require("body-parser");
const app = express();

app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

//  parameters to be passed 

app.post("/", (req, res) => {
let {
       transaction_id,
       remote_transaction_id,
       successful,
       amount_collected,
       currency_from,
       currency_to,
       exchange_rate,
       subscriber_msisdn,
       reference_number,
       paybill_number,
       timestamp,
       network_mcc,
       network_mnc,
       network_name
}
    } = req.body;

     // sending response.
    res.json({
        transaction_id,
        "successful": "true"
    });

    });

app.listen(7000, () => {
console.log("app running on port 7000");
});