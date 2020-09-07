using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using PaymentAPI.Models;

namespace PaymentAPI.Controllers
{
    [Route("api/[controller]")]
    [ApiController]
    public class PaymentCallbackController : ControllerBase
    {
        [HttpPost]
        [Route("[action]")]
        public async Task<ActionResult<PaymentCallbackResponse>> PaymentCallback(PaymentCallback paymentCallback)
        {
            PaymentCallbackResponse paymentCallbackResponse = new PaymentCallbackResponse();
            paymentCallbackResponse.transaction_id = paymentCallback.transaction_id;
            paymentCallbackResponse.successful = true;

            return new OkObjectResult(paymentCallback);
        }
    }
}
