package fr.ppptours.main;

import java.lang.String;
import java.util.ArrayList;

/**
 * Product class represents a product sold by the cafeteria
 */
public class Product {
    /**
     * The name of the product
     */
    private String name;
    /**
     * The list of the products tags
     */
    private ArrayList<ProductTag> tags;

    /**
     * Creates a Product with the name and list of tags entered as parameters
     * @param name The Products name
     * @param ProductTags ArrayList containing all the tags the Product will have
     */
    public Product(String name, ArrayList<ProductTag> tags) {
        this.name = name;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public ArrayList<ProductTag> getTags(){
        return tags;
    }
    public void setTags(ArrayList<ProductTag> newTags){
        tags = newTags;
    }

    /**
     * Adds the entered tag into the Products list of tags
     * @param newTag The ProductTag you want to add to the list
     */
    public void addTag(ProductTag newTag) {
        tags.add(newTag);
    }
    /**
     * Adds the entered tags to the Products list of tags
     * If newTags contains a tag that is already in the Products tag list, it will not get added
     * (this prevents duplicate tags)
     * @param newTags an ArrayList containing the tags you want to add
     */
    public void addTags(ArrayList<ProductTag> newTags){
        ArrayList<ProductTag> tempTags = newTags;
        tempTags.removeAll(tags);
        tags.addAll(tempTags);
    }

    /**
     * Removes the entered tag from the Products list of tags
     * @param remTag The ProductTag you want to remove from the list
     */
    public void removeTag(ProductTag remTag) {
        tags.remove(remTag);
    }
    /**
     * Removes the entered tags from the Products list of tags
     * @param remTags An ArrayList containing the tags you want to remove
     */
    public void removeTags(ArrayList<ProductTags> remTags){
        tags.removeAll(remTags);
    }
    }

}
