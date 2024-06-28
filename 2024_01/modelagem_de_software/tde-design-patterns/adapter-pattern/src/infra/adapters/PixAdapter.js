const IPayment = require('../payment/payment-methods/IPayment.js');

class PixAdapter extends IPayment {
    constructor() {
        super()
    }

    pay() {
        console.log('Pago com pix');
    }
}

module.exports = PixAdapter;

