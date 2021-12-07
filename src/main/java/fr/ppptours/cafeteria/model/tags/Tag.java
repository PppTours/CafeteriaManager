package fr.ppptours.cafeteria.model.tags;

/**
 * Base class for tags.
 */
public abstract class Tag {

    /**
     * The tag's id
     */
    private int id;

    /**
     * The tag name, used to identify the tag
     */
    private String tagName;


    public Tag(int id, String tagName) {
        this.id = id;
        this.tagName = tagName;
    }

    public int getId() {
        return id;
    }

    /**
     * Sets a new tag id
     * @param id New tag id to set
     */
    protected void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    /**
     * Sets a new tag Name
     * @param tagName New tag name to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
