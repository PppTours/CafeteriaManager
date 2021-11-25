package fr.ppptours.cafetaria.model.tags;

/**
 * Abstract class for all tags
 */
public abstract class Tag {

    /**
     * The tag name, used to identify the tag
     */
    private String tagName;

    /**
     * general constructor
     * @param tagName name for the created tag
     */
    public Tag(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return the tagName
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * set a new tag Name
     * @param tagName new tag name to set
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
