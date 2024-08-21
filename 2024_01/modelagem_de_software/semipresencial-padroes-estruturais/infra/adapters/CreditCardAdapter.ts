import { IPayment } from "../../domain/ports/IPayment";

export class CreditCardAdapter implements IPayment {
    pay(value: number) {
        console.log(`Pagando R$${value.toFixed(2)} com cartão de crédito`);
    }
}
