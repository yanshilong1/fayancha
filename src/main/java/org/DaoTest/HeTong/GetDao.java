package org.DaoTest.HeTong;

/**
 * @Author: yanshilong
 * @Date: 18-8-21 下午1:58
 * @Version 1.0
 */
public class GetDao {
    private int userid;
    private  int id;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getHetongid() {
        return hetongid;
    }

    public void setHetongid(String hetongid) {
        this.hetongid = hetongid;
    }

    private String hetongid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
