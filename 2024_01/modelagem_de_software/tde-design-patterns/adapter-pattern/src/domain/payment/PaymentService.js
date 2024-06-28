class PaymentService {
    static execute(paymentMethod) {
        paymentMethod.pay();
    }
}

module.exports = PaymentService;