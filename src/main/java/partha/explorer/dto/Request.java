package partha.explorer.dto;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Partha
 */
public class Request {

    private Object _id;
    private String requestTo;
    private Map requestFrom;
    private String requestMessage;
    private Boolean reqFlag;

    private String status;
    private String createdate;
    private String updatedate;

 

    public Map getRequestFrom() {
        return requestFrom;
    }

    public void setRequestFrom(Map requestFrom) {
        this.requestFrom = requestFrom;
    }

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
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

    public String getRequestTo() {
        return requestTo;
    }

    public void setRequestTo(String requestTo) {
        this.requestTo = requestTo;
    }

    public Boolean getReqFlag() {
        return reqFlag;
    }

    public void setReqFlag(Boolean reqFlag) {
        this.reqFlag = reqFlag;
    }

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

}
