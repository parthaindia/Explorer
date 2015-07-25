
package partha.explorer.dto;

import java.util.List;

/**
 *
 * @author Partha
 */
public class Location {
    private Object _id;
    private String lattitude;
    private String longitude;
    private List<String> businessCenterId;
    private Integer primarySeqNumber;
    private Integer secondarySeqNumber;
    private String type;
       
    private String status;
     private String createdate;
    private String updatedate;

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public List<String> getBusinessCenterId() {
        return businessCenterId;
    }

    public void setBusinessCenterId(List<String> businessCenterId) {
        this.businessCenterId = businessCenterId;
    }

    public Integer getPrimarySeqNumber() {
        return primarySeqNumber;
    }

    public void setPrimarySeqNumber(Integer primarySeqNumber) {
        this.primarySeqNumber = primarySeqNumber;
    }

    public Integer getSecondarySeqNumber() {
        return secondarySeqNumber;
    }

    public void setSecondarySeqNumber(Integer secondarySeqNumber) {
        this.secondarySeqNumber = secondarySeqNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
