package partha.explorer.dto;

import java.util.List;

/**
 *
 * @author Partha
 */
public class Route {

    private List<Location> locationList;
    private String name;
    private String type;
    private String subtype;
    private String rating;
    private List<String> reviews;
    private String valueForMoney;
    private Location startLocation;
    private List<Location> meetupPoint;
    private Location destinationLocation;
    private List<String> routeBlogData;
    private List<String>userGroupIds;
    private boolean isShareOnline;
    private String requirements;
    private String planningData;
    private List<Request>routeRequests;
    private Uprouting routeUproute;

    public List<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(List<Location> locationList) {
        this.locationList = locationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<String> getReviews() {
        return reviews;
    }

    public void setReviews(List<String> reviews) {
        this.reviews = reviews;
    }

    public String getValueForMoney() {
        return valueForMoney;
    }

    public void setValueForMoney(String valueForMoney) {
        this.valueForMoney = valueForMoney;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Location startLocation) {
        this.startLocation = startLocation;
    }

    public List<Location> getMeetupPoint() {
        return meetupPoint;
    }

    public void setMeetupPoint(List<Location> meetupPoint) {
        this.meetupPoint = meetupPoint;
    }

    public Location getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(Location destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public List<String> getRouteBlogData() {
        return routeBlogData;
    }

    public void setRouteBlogData(List<String> routeBlogData) {
        this.routeBlogData = routeBlogData;
    }

    public List<String> getUserGroupIds() {
        return userGroupIds;
    }

    public void setUserGroupIds(List<String> userGroupIds) {
        this.userGroupIds = userGroupIds;
    }

    public boolean isIsShareOnline() {
        return isShareOnline;
    }

    public void setIsShareOnline(boolean isShareOnline) {
        this.isShareOnline = isShareOnline;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getPlaningData() {
        return planningData;
    }

    public void setPlaningData(String planingData) {
        this.planningData = planingData;
    }

    public List<Request> getRouteRequests() {
        return routeRequests;
    }

    public void setRouteRequests(List<Request> routeRequests) {
        this.routeRequests = routeRequests;
    }
    
    @Override
    public String toString() {
        return "Route{" + "locationList=" + locationList + ", name=" + name + ", type=" + type + ", subtype=" + subtype + ", rating=" + rating + ", reviews=" + reviews + ", valueForMoney=" + valueForMoney + ", startLocation=" + startLocation + ", meetupPoint=" + meetupPoint + ", destinationLocation=" + destinationLocation + ", routeBlogData=" + routeBlogData + ", userGroupIds=" + userGroupIds + ", isShareOnline=" + isShareOnline + ", requirements=" + requirements + ", planningData=" + planningData + ", routeRequests=" + routeRequests + '}';
    }

    public Uprouting getRouteUproute() {
        return routeUproute;
    }

    public void setRouteUproute(Uprouting routeUproute) {
        this.routeUproute = routeUproute;
    }
    
}
