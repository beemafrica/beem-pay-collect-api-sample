using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;

namespace PaymentAPI.Models
{
    public class PaymentCallback
    {
        public string transaction_id { get; set; }
        public string remote_transaction_id { get; set; }
        public double amount_collected { get; set; }
        public string currency_from { get; set; }
        public string currency_to { get; set; }
        public double exchange_rate { get; set; }
        public string subscriber_msisdn { get; set; }
        public string reference_number { get; set; }
        public string paybill_number { get; set; }
        public string timestamp { get; set; }
        public int network_mcc { get; set; }
        public int network_mnc { get; set; }
        public string network_name { get; set; }
    }

    public class PaymentCallbackResponse{
        public string transaction_id { get; set; }
        public bool successful { get; set; }
    }
}
