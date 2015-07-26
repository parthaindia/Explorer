
package partha.explorer.dto;

import java.util.List;

/**
 *
 * @author Partha
 */
public class BusinessCenter {
    private Object _id;
    private String name;
    private String type;
    private String subtype;
    private String rating;
    private String reviews;
    private String valueForMoney;
    private List<String>Others;
       
    private String status;
     private String createdate;
    private String updatedate;

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
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

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

    public String getValueForMoney() {
        return valueForMoney;
    }

    public void setValueForMoney(String valueForMoney) {
        this.valueForMoney = valueForMoney;
    }

    public List<String> getOthers() {
        return Others;
    }

    public void setOthers(List<String> Others) {
        this.Others = Others;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(String updatedate) {
        this.updatedate = updatedate;
    }
}
