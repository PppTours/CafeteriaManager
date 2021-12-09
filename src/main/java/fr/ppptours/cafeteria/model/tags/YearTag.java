package fr.ppptours.cafeteria.model.tags;

/**
 * Tag Class to represent a year/class ( for example a client being in 3rd year, or in preparatory class)
 */
public class YearTag extends Tag {

    /**
     * the next year the client will be in
     */
    private YearTag nextYear;

    public YearTag(int id, String tagName, YearTag nextYear){
        super(id, tagName);
        this.nextYear = nextYear;
    }

    public YearTag(int id, String tagName) {
        super(id, tagName);
    }

    public YearTag getNextYear(){
        return nextYear;
    }

    public void setNextYear(YearTag nextYear){
        this.nextYear = nextYear;
    }
}
