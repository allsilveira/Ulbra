const IPayment = require('../payment/payment-methods/IPayment.js');

class PaypalAdapter extends IPayment {
    constructor() {
        super()
    }

    pay() {
        console.log('Pago paypal');
    }
}

module.exports = PaypalAdapter;