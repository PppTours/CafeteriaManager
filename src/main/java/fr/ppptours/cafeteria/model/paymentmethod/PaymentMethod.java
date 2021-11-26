package fr.ppptours.cafeteria.model.paymentmethod;

/**
 * Class to represent a payment method (cash, card, ...)
 */
public class PaymentMethod {

    /**
     * The payment method name
     */
    private String method;


    /**
     * Creates a payment method from a given string
     * @param method The payment method as a string
     */
    public PaymentMethod(String method) {
        this.method = method;
    }


    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * Checks if the payment method given is the same as the object's one
     * @param method the payment method to compare to
     * @return true if the payment method is the same, false otherwise
     */
    public boolean isMethod(String method) {
        String methodLower = method.toLowerCase();
        return this.method.toLowerCase().equals(methodLower);
    }


    /**
     * String representation of a payment method
     * @return the string representation
     */
    @Override
    public String toString() {
        return method;
    }

}
