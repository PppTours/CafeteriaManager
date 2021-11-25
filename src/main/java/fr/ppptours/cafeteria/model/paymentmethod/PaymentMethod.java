package fr.ppptours.cafeteria.model.paymentmethod;

/**
 * Class to represent a payment method (cash, card, ...)
 */
public class PaymentMethod {

    /**
     * The payment method
     * The only current possible values are :
     * - CASH
     * - CARD
     * - LYDIA
     * - ACCOUNT (means its taken from the client's cafetaria account)
     */
    private Method method;

    /**
     * Creates a payment method from a given method
     * @param method The method to use
     */
    public PaymentMethod(Method method) {
        this.method = method;
    }


    /**
     * Creates a payment method from a given string
     * @param method The string to parse
     * @throws IllegalArgumentException if the string is not a valid payment method
     */
    public PaymentMethod(String method) throws IllegalArgumentException {
        this.method = parseMethodFromString(method);
    }

    /**
     * Attempts to parse the given string to get a payment method
     * @param methodString the string to parse
     * @return The correct payment method
     * @throws IllegalArgumentException if the string is not a valid payment method
     */
    private Method parseMethodFromString(String methodString) {
        String methodUpperCase = methodString.toUpperCase();

        // Checks all the possible payment methods
        for(Method method : Method.values()) {
            if(methodUpperCase.equals(method.toString())) {
                return method;
            }
        }

        throw new IllegalArgumentException("Invalid payment method : " + methodString);

    }

    public Method getMethod() {
        return method;
    }

    /**
     * Checks if the payment method of the object is the same as the given one
     * @param method the payment method to compare to
     * @return true if the payment method is the same, false otherwise
     */
    public boolean isMethod(Method method) {
        return this.method == method;
    }

    /**
     * Checks if the payment method of the object is the same as the given one
     * @param method the payment method to compare to
     * @return true if the payment method is the same, false otherwise
     * @throws IllegalArgumentException if the given string is not a valid payment method
     */
    public boolean isMethod(String method) {
        return this.method == parseMethodFromString(method);
    }

    /**
     * Checks if the payment method is cash
     * @return true if the payment method is cash, false otherwise
     */
    public boolean isCash() {
        return method == Method.CASH;
    }

    /**
     * Checks if the payment method is a card
     * @return true if the payment method is a card, false otherwise
     */
    public boolean isCard() {
        return method == Method.CARD;
    }

    /**
     * Checks if the payment method is Lydia
     * @return true if the payment method is Lydia, false otherwise
     */
    public boolean isLydia() {
        return method == Method.LYDIA;
    }

    /**
     * Checks if the payment method is an account from the cafeteria
     * @return true if the payment method is an account, false otherwise
     */
    public boolean isAccount() {
        return method == Method.ACCOUNT;
    }

    /**
     * String representation of a payment method
     * @return the string representation
     */
    @Override
    public String toString() {
        return method.toString();
    }

}
