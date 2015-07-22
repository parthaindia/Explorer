
package partha.explorer.dto;

import java.util.List;

/**
 *
 * @author Partha
 */
public class User {
    private Object _id;
    private String userName;
    private String publicName;
    private String gcmId;
    private String phoneNumber;
    private String emailId;
    private String points;
    private List<Badges> badgeList;
    private boolean isRouteShare;
    private boolean currentRouteStatus;
    private Request pendingRequest;
    private Uprouting userUprouting;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPublicName() {
        return publicName;
    }

    public void setPublicName(String publicName) {
        this.publicName = publicName;
    }

    public String getGcmId() {
        return gcmId;
    }

    public void setGcmId(String gcmId) {
        this.gcmId = gcmId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public List<Badges> getBadgeList() {
        return badgeList;
    }

    public void setBadgeList(List<Badges> badgeList) {
        this.badgeList = badgeList;
    }

    public boolean isIsRouteShare() {
        return isRouteShare;
    }

    public void setIsRouteShare(boolean isRouteShare) {
        this.isRouteShare = isRouteShare;
    }

    public boolean isCurrentRouteStatus() {
        return currentRouteStatus;
    }

    public void setCurrentRouteStatus(boolean currentRouteStatus) {
        this.currentRouteStatus = currentRouteStatus;
    }

    public Request getPendingRequest() {
        return pendingRequest;
    }

    public void setPendingRequest(Request pendingRequest) {
        this.pendingRequest = pendingRequest;
    }

    public Uprouting getUserUprouting() {
        return userUprouting;
    }

    public void setUserUprouting(Uprouting userUprouting) {
        this.userUprouting = userUprouting;
    }
    
    
}
