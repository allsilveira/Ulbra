class IPayment {
    pay() {
        throw new Error('pay not implemented');
    }
}
module.exports = IPayment;
