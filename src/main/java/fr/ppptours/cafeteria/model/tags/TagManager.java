package fr.ppptours.cafeteria.model.tags;

import java.util.*;

/**
 * This class should be used whenever an entity can have an undefined number of a specific type of tag.
 * @param <T> The type of tag we need to use.
 */
public class TagManager<T extends Tag> {

    /**
     * Set of all the tags currently stored.
     */
    private final Set<T> tags;

    public TagManager() {
        this.tags = new HashSet<>();
    }

    public TagManager(Collection<T> initialElements) {
        this();
        tags.addAll(initialElements);
    }

    /**
     * Returns an unmodifiable set of the tags.
     */
    public Set<T> getTags() {
        return Collections.unmodifiableSet(tags);
    }

    /**
     * Adds a tag to the set.
     */
    public void addTag(T tag) {
        tags.add(tag);
    }

    /**
     * Adds several tags with only one method.
     */
    public void addTags(Collection<T> tagsToAdd) {
        tags.addAll(tagsToAdd);
    }

    /**
     * Removes a tag from the set.
     */
    public void removeTag(T tag) {
        tags.remove(tag);
    }

    /**
     * Removes several tags with only one method.
     */
    public void removeTags(Collection<T> tagsToRemove) {
        tags.removeAll(tagsToRemove);
    }

    /**
     * Checks if a tag is present in the set.
     */
    public boolean hasTag(T tag) {
        return tags.contains(tag);
    }
}
