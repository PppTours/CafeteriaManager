package fr.ppptours.cafeteria.model;

import fr.ppptours.cafeteria.model.tags.PersonTag;
import fr.ppptours.cafeteria.model.tags.TagManager;
import fr.ppptours.cafeteria.model.tags.YearTag;
import java.util. ArrayList;
import java.util.Collection;

/**
 * Class representing a client account, with its name, balance and tags for its information.
 */
public class ClientAccount {

    /**
     * First name of the client.
     */
    private String firstName;

    /**
     * Last name of the client.
     */
    private String lastName;

    /**
     * Balance of the client, to have the current money available.
     */
    private final Balance clientBalance;

    /**
     * Tags for the client's information, like if he's a student, working in the cafeteria, etc.
     */
    private final TagManager<PersonTag> personTagManager;

    /**
     * Tag representing the current year the client is in (like 3rd year, 4th year, etc.).
     */
    private YearTag currentYearTag;

    public ClientAccount(String firstName, String lastName, Collection<PersonTag> personTags, YearTag currentYearTag) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.clientBalance = new Balance();
        this.personTagManager = new TagManager<>();
        this.personTagManager.addTags(personTags);
        this.currentYearTag = currentYearTag;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Balance getClientBalance() {
        return clientBalance;
    }

    public YearTag getCurrentYearTag() {
        return currentYearTag;
    }

    /**
     * Change the identity of the client (first name and last name).
     * @param firstName New first name of the client.
     * @param lastName New last name of the client.
     */
    public void setIdentity(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCurrentYearTag(YearTag newYearTag) {
        this.currentYearTag = newYearTag;
    }

    /**
     * Change the year tag of the client to the next one (for example going from 3rd year to 4th year).
     */
    public void nextYear() {
        currentYearTag = currentYearTag.getNextYear();
    }


    //======================== PersonTag management ========================

    public void addPersonTag(PersonTag tag) {
        personTagManager.addTag(tag);
    }

    public void addPersonTags(Collection<PersonTag> tags) {
        personTagManager.addTags(tags);
    }

    public void removePersonTag(PersonTag tag) {
        personTagManager.removeTag(tag);
    }

    public void removePersonTags(Collection<PersonTag> tags) {
        personTagManager.removeTags(tags);
    }

    public Collection<PersonTag> getPersonTags() {
        return personTagManager.getTags();
    }

    public boolean hasPersonTag(PersonTag tag) {
        return personTagManager.hasTag(tag);
    }

    //======================================================================

}
