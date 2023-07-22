package smells.ocp

enum class PaymentType{
    Cash , PayPal , CreditCard
}
class ViolatedPaymentProcessor {
    fun processPayment(payment : PaymentType) {
        when(payment) {
            PaymentType.CreditCard -> paymentWithCreditCard()
            PaymentType.PayPal -> paymentWithPayPal()
            else -> unknownPaymentType()
        }



    }

    private fun unknownPaymentType() {
        TODO("Not yet implemented")
    }

    private fun paymentWithPayPal() {
        TODO("Not yet implemented")
    }

    private fun paymentWithCreditCard() {
        TODO("Not yet implemented")
    }
}