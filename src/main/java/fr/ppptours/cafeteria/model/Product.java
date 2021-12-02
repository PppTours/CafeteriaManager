package fr.ppptours.cafeteria.model;

import fr.ppptours.cafeteria.model.tags.ProductTag;

import java.util.Collection;
import java.util.Collections;
import java.util.List;


/**
 * Product class represents a product sold by the cafeteria
 */
public class Product{
    /**
     * The name of the product
     */
    private String name;
    /**
     * The list of the products tags, this list is not meant to be modified outside this Classes methods
     */
    private List<ProductTag> tags;

    /**
     * Creates a Product with the name entered as a parameter, the tags list will be empty after creation
     * @param name The Products name
     */
    public Product(String name) {
        this.name = name;
    }

    /**
     * Comfort constructor that creates a Product with the name and list of tags entered as parameters
     * @param name The Products name
     * @param tags Collection containing all the tags the Product will have
     */
    public Product(String name, Collection<ProductTag> tags) {
        this.name = name;
        this.tags = (List<ProductTag>) tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    /**
     * Returns the list of tags of the current product
     * it returns an iterable
     * @return an Iterable containing all the current Products tags
     */
    public List<ProductTag> getTags(){
        return Collections.unmodifiableList(tags);
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
     * @param newTags A List containing the tags you want to add
     */
    public void addTags(Collection<ProductTag> newTags){
        newTags.removeAll(tags);
        tags.addAll(newTags);
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
     * @param remTags A Collection containing the tags you want to remove
     */
    public void removeTags(Collection<ProductTag> remTags){
        tags.removeAll(remTags);
    }
}
