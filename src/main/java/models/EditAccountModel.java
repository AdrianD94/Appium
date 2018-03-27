package models;

/**
 * Created by casab on 11/2/2017.
 */
public class EditAccountModel {
    private String newEmailAddress;
    private String oldPassword;
    private String newPassword;
    private String newPassword2;
    private String badEmail;
    private String zip;


    public String getNewEmailAddress() {
        return newEmailAddress;
    }

    public void setNewEmailAddress(String newEmailAddress) {
        this.newEmailAddress = newEmailAddress;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }


    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword2() {
        return newPassword2;
    }

    public void setNewPassword2(String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    public String getBadEmail() {
        return badEmail;
    }

    public void setBadEmail(String badEmail) {
        this.badEmail = badEmail;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }









}