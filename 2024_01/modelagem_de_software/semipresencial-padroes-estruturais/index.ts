import { CreditCardAdapter } from "./infra/adapters/CreditCardAdapter";
import { PaymentService } from "./domain/payment/PaymentService";
import { PixAdapter } from "./infra/adapters/PixAdapter";

function main() {
    const creditCardPayment = new CreditCardAdapter();
    const pixPayment = new PixAdapter();
    const paymentService = new PaymentService();

    paymentService.execute(creditCardPayment, 599.90);
    paymentService.execute(pixPayment, 19.90);
}
main();