import { IPayment } from "../../domain/ports/IPayment";

export class PixAdapter implements IPayment {
    pay(value: number) {
        console.log(`Pagando R$${value.toFixed(2)} com pix`);
    }
}
