const IPayment = require('../payment/payment-methods/IPayment.js');

class CreditCardAdapter extends IPayment {
    constructor() {
        super()
    }

    pay() {
        console.log('Pago com cartão de crédito');
    }
}

module.exports = CreditCardAdapter;