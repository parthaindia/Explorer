package partha.explorer.dto;

import java.util.List;

/**
 *
 * @author Partha
 */
public class Blog {

    private Object _id;
    private List<String> blogInfo;
    private String name;
    private String status;
    private String url;
    private String createdate;
    private String updatedate;

    public List<String> getBlogInfo() {
        return blogInfo;
    }

    public void setBlogInfo(List<String> blogInfo) {
        this.blogInfo = blogInfo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getId() {
        return _id;
    }

    public void setId(Object _id) {
        this._id = _id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
