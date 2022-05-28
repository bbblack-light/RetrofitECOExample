package models;

public class LoginResponse {
    public String operationMessage;
    public String landingPage;
    public LoginResponseUser item;

    public String getOperationMessage() {
        return operationMessage;
    }

    public void setOperationMessage(String operationMessage) {
        this.operationMessage = operationMessage;
    }

    public String getLandingPage() {
        return landingPage;
    }

    public void setLandingPage(String landingPage) {
        this.landingPage = landingPage;
    }

    public LoginResponseUser getItem() {
        return item;
    }

    public void setItem(LoginResponseUser item) {
        this.item = item;
    }
}
