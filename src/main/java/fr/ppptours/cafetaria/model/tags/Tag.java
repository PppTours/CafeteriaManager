package fr.ppptours.cafetaria.model.tags;

/**
 * Abstract class for all tags
 */
public abstract class Tag {

    /**
     * The tag name, used to identify the tag
     */
    private String tagName;

    public Tag(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return The tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * Set a new tag Name
     * @param tagName New tag name to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
