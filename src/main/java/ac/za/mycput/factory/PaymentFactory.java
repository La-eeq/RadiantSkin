package ac.za.mycput.factory;

// Tebogo Makgato 230116086

import ac.za.mycput.domain.Payment;
import ac.za.mycput.domain.PaymentMethod;
import ac.za.mycput.domain.PaymentStatus;
import ac.za.mycput.util.Helper;

public class PaymentFactory {

    public static Payment createPayment(Long paymentId, double amount, PaymentStatus paymentStatus, PaymentMethod paymentMethod, String transactionReference){

        if(!Helper.isValidPaymentId(paymentId)){
            return null;
        }
        if(!Helper.isValidAmount(amount)){
            return null;
        }
        if (!Helper.isValidTransactionReference(transactionReference)) {
            return null;
        }
        if (paymentStatus == null) {
            return null;
        }
        if (paymentMethod == null) {
            return null;
        }
        return new Payment.Builder()
                .setPaymentId(paymentId)
                .setAmount(amount)
                .setPaymentStatus(paymentStatus)
                .setPaymentMethod(paymentMethod)
                .setTransactionReference(transactionReference)
                .build();

    }
}
