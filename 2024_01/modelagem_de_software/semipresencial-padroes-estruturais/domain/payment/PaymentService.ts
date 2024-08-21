import { IPayment } from "../ports/IPayment";

export class PaymentService {
    execute(paymentMethod: IPayment, value: number) {
        paymentMethod.pay(value);
    }
}