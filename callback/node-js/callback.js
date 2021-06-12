const express = require("express");
const app = express();

app.use(express.urlencoded({ extended: false }));
app.use(express.json());


app.post("/", (req, res) => {
let {
       transaction_id,
       amount_collected,
       source_currency,
       target_currency,
       subscriber_msisdn,
       reference_number,
       paybill_number,
       timestamp,
       mcc_network,
       mnc_network,
       network_name
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