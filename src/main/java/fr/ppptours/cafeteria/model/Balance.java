package fr.ppptours.cafeteria.model;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * Class to represent a user balance, containing a list of transactions and a current balance.
 */
public class Balance {

    /**
     * Current currency balance of the object.
     */
    double currentBalance;

    /**
     * List of transactions.
     */
    List<Transaction> transactions;


    Balance() {
        this.transactions = new ArrayList<>();
        currentBalance = 0;
    }

    Balance(Balance balance) {
        this.transactions = new ArrayList<>();
        transactions.addAll(balance.getTransactions());
        this.currentBalance = balance.getCurrentBalance();
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public List<Transaction> getTransactions() {
        return Collections.unmodifiableList(transactions);
    }

    /**
     * Add a new transaction to the balance, updating the current balance.
     * @param transaction Transaction to add.
     * @return true if the transaction was added, false otherwise.
     */
    public boolean addTransaction(Transaction transaction) {
        if(transaction == null) {
            throw new IllegalArgumentException("Transaction cannot be null");
        }

        // Check if the transaction is already in the list
        for(Transaction t : transactions) {
            if(t.equals(transaction)) {
                return false;
            }
        }

        currentBalance += transaction.getAmount();
        return transactions.add(transaction);
    }

    /**
     * Redo the calculation of the current balance.
     */
    public void reCalculateBalance() {
        currentBalance = 0;
        for(Transaction transaction : transactions) {
            currentBalance += transaction.getAmount();
        }
    }


}
