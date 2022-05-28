package models;

import java.util.List;

public class Organization extends Base {
    private String name;
    private String description;
    private String address;
    private String phoneNumber;
    private String vkURL;
    private String instURL;
    private String tgURL;
    private List<User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVkURL() {
        return vkURL;
    }

    public void setVkURL(String vkURL) {
        this.vkURL = vkURL;
    }

    public String getInstURL() {
        return instURL;
    }

    public void setInstURL(String instURL) {
        this.instURL = instURL;
    }

    public String getTgURL() {
        return tgURL;
    }

    public void setTgURL(String tgURL) {
        this.tgURL = tgURL;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
