// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package enums.payments;

import java.util.Random;

/**

 The Payment class represents a payment with an amount, payment method, and reference number.
 */
public class Payment {
    private double amount;
    private PaymentMethod method;
    private String referenceNumber = "REF";

    /**

     Constructs a Payment object with the specified amount and payment method.
     @param amount the amount of the payment
     @param method the payment method
     */
    public Payment(double amount, PaymentMethod method) {
        this.amount = amount;
        this.method = method;
        referenceNumber += referenceNumber();
    }
    /**

     Generates a random reference number for the payment.
     @return the generated reference number
     */
    String referenceNumber() {
        Random rnd = new Random();
        int number = rnd.nextInt(999999);
        return String.format("%06d", number);
    }
    /**

     Prints the details of the payment, including the amount, payment method, and reference number.
     */
    void printPaymentDetails() {
        System.out.println("Payment amount: " + amount);
        System.out.println("Payment method: " + method);
        System.out.println("Reference number: " + referenceNumber);
        System.out.println();
    }
}
