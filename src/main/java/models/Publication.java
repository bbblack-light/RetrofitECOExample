package models;

import java.time.LocalDate;
import java.util.List;

public class Publication extends Base {
    private List<Tag> tags;
    private List<Images> images;
    private PublicationType publicationType;
    private OrganizationWithoutUsers author;
    private Long countInFavorites;
    private Place place;
    private String name;
    private LocalDate publicationDate;
    private LocalDate eventDate;
    private String text;

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<Images> getImages() {
        return images;
    }

    public void setImages(List<Images> images) {
        this.images = images;
    }

    public PublicationType getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }

    public OrganizationWithoutUsers getAuthor() {
        return author;
    }

    public void setAuthor(OrganizationWithoutUsers author) {
        this.author = author;
    }

    public Long getCountInFavorites() {
        return countInFavorites;
    }

    public void setCountInFavorites(Long countInFavorites) {
        this.countInFavorites = countInFavorites;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
