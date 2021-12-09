package fr.ppptours.cafeteria.model;
import java.util.Map;
import java.util.HashMap;

/**
 * Stock class represents the stock, the sum of all Products currently in stock at the cafeteria
 */
public class Stock {
    /**
     * A HashMap containing the products as keys and the amount in invetory as the value
      */
    private Map<Product, Integer> products;

    /**
     * Creates an empty new Stock object
     */
    public Stock() {
        products = new HashMap<Product, Integer>();
    }

    /**
     * Creates a new Stock containing the entered products
     * @param newProducts a Map of the products you want to add to the stock and their quantity
     */
    public Stock(Map<Product,Integer> newProducts){
        products = newProducts;
    }

    /**
     * Adds a product to the Stock in the specified quantity
     * @param newProduct the product you want to add to the Stock
     * @param quantity the amount of this product you want to add to the Stock
     */
    public void addProduct(Product newProduct, int quantity){
        if (products.containsKey(newProduct)){
            products.put(newProduct, products.get(newProduct) + quantity);
        } else {
            products.put(newProduct, quantity);
        }
    }

    /**
     * Adds all of the entered Products to the Stock with the specified quantities
     * @param newProducts a Map of the products you want to add to the Stock and the amounts you want to add
     */
    public void addProducts(Map<Product,Integer> newProducts){
        for(Product currentProduct : newProducts.keySet()){
            if (products.containsKey(currentProduct)){
                products.put(currentProduct,products.get(currentProduct)+newProducts.get(currentProduct));
            }
            else{
                products.put(currentProduct,newProducts.get(currentProduct));
            }
        }
    }

    /**
     * Removes a product from the Stock in the specified quantity
     * If the Entered Product is not contained in the Stock, nothing happens
     * If the quantity you want to remove is greater than the quantity currently in stock, nothing happens, an exception is thrown
     * @param remProduct the product you want to remove from the Stock
     * @param remQty the amount you want to remove from the Stock
     */
    public void removeProduct(Product remProduct,int remQty){
        if (products.containsKey(remProduct)){
            if (remQty<=products.get(remProduct)){
                products.put(remProduct,products.get(remProduct)-remQty);
            }
            else{
                throw new IllegalArgumentException("You cannot remove more than what is in stock");
            }
        }
        else{
            throw new IllegalArgumentException("You cannot remove a product that is not in stock");
        }
    }

    /**
     * Removes all of the entered Products from the Stock in their respective specified quantities
     * If a Product is not contained in the Stock, nothing happens, an exception is thrown
     * If the quantity you want to remove is greater than the quantity currently in stock, nothing happens, an exception is thrown
     */
    public void removeProducts(Map<Product,Integer> remProducts){
        //checking if all the products are in stock
        for (Product currentProduct : remProducts.keySet()) {
            if (!products.containsKey(currentProduct)) {
                throw new IllegalArgumentException("You cannot remove a product that is not in stock");
            }
            if (products.get(currentProduct) < remProducts.get(currentProduct)) {
                throw new IllegalArgumentException("You cannot remove more than what is in stock");
            }
        }
        //removing the products
        for (Product currentProduct : remProducts.keySet()){
            products.put(currentProduct,products.get(currentProduct)-remProducts.get(currentProduct));
        }
    }

}
