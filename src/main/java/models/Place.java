package models;

import java.util.List;

public class Place extends Base {
    private OrganizationWithoutUsers author;
    private String name;
    private String address;
    private String description;
    private List<Tag> tags;

    public OrganizationWithoutUsers getAuthor() {
        return author;
    }

    public void setAuthor(OrganizationWithoutUsers author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
