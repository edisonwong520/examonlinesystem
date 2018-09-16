package po;

import java.sql.Timestamp;

public class Studentresult {
    private Integer id;

    private String examnumber;

    private Integer lessonid;

    private Integer resingle;

    private Integer resmore;

    private Integer restotal;

    private Timestamp createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExamnumber() {
        return examnumber;
    }

    public void setExamnumber(String examnumber) {
        this.examnumber = examnumber == null ? null : examnumber.trim();
    }

    public Integer getLessonid() {
        return lessonid;
    }

    public void setLessonid(Integer lessonid) {
        this.lessonid = lessonid;
    }

    public Integer getResingle() {
        return resingle;
    }

    public void setResingle(Integer resingle) {
        this.resingle = resingle;
    }

    public Integer getResmore() {
        return resmore;
    }

    public void setResmore(Integer resmore) {
        this.resmore = resmore;
    }

    public Integer getRestotal() {
        return restotal;
    }

    public void setRestotal(Integer restotal) {
        this.restotal = restotal;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }
}