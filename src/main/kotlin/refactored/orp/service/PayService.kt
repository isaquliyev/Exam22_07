package refactored.orp.service

import refactored.orp.IPayment

class PayService() {
    fun payWith(iPayment: IPayment) {
        iPayment.payWith()
    }
}