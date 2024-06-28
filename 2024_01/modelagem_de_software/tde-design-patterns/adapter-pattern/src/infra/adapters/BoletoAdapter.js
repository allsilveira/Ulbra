const IPayment = require('../payment/payment-methods/IPayment.js');

class BoletoAdapter extends IPayment {
    constructor() {
        super();
    }

    pay() {
        console.log('Pagando com boleto');
    }
}

module.exports = BoletoAdapter;