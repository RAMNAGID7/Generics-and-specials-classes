// Assignment: 4
// Author: Ram Nagid, ID: 318692779
package enums.payments;
/**
 * Possible main check for ArrayQueue.
 */
public class PaymentTest {
    public static void main(String [] args){
    Payment p1=new Payment(5000,PaymentMethod.CASH);
    Payment p2=new Payment(6000,PaymentMethod.CREDIT_CARD);
    Payment p3=new Payment(7000,PaymentMethod.BANK_TRANSFER);
    p1.printPaymentDetails();
    p2.printPaymentDetails();
    p3.printPaymentDetails();
    }
}
