package refactored.orp

import refactored.orp.managers.PayWithCreditCard
import refactored.orp.managers.PayWithPayPal
import refactored.orp.service.PayService


fun main() {
    val payService = PayService()
    payService.payWith(PayWithCreditCard())
    payService.payWith(PayWithPayPal())

}