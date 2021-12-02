package fr.ppptours.cafeteria.model.paymentmethod;

/**
 * Class to represent a payment method (cash, card, ...)
 */
public class PaymentMethod {


    /**
     * The payment method id
     */
    private int id;

    /**
     * The payment method name
     */
    private String name;


    /**
     * Creates a payment method from a given string
     * @param name The payment method as a string
     */
    public PaymentMethod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     * String representation of a payment method
     * @return the string representation
     */
    @Override
    public String toString() {
        return "id : "+id+", name = "+name;
    }

    /**
     * Checks if the payment method is the same as the one given
     * If a payment method is an int/Integer, it will be compared to the id
     * @param o the payment method to compare to
     * @return true if the payment method is the same, false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentMethod that = (PaymentMethod) o;
        return equals(that);
    }

    /**
     * Checks if two payment methods are equal.
     */
    protected boolean equals(PaymentMethod otherMethod){
        return this.id == otherMethod.id;
    }
}
