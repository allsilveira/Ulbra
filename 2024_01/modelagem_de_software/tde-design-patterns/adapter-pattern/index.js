const PaypalAdapter = require('./adapters/PaypalAdapter.js');
const PixAdapter = require('./adapters/PixAdapter.js');
const CreditCardAdapter = require('./adapters/CreditCardAdapter.js');
const BoletoAdapter = require('./adapters/BoletoAdapter.js');

const PaymentService = require('./payment/PaymentService.js');

const paypal = new PaypalAdapter();
const pix = new PixAdapter();
const creditCard = new CreditCardAdapter();
const boleto = new BoletoAdapter();

PaymentService.execute(boleto);

