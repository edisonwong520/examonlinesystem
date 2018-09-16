package po;

import controller.MD5;

import java.util.Date;

public class Student {
    private Integer id;

    private String name;

    private String password;

    private String sex;

    private Date jointime;

    private String profesion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
       this.password = password == null ? null : MD5.stringToMD5(password.trim());
//        if (password==null){
//            this.password=password;
//
//        }
//        else{
//            String md5code=MD5.stringToMD5(password.trim());
//            this.password=md5code;
//        }

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getJointime() {
        return jointime;
    }

    public void setJointime(Date jointime) {
        this.jointime = jointime;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion == null ? null : profesion.trim();
    }
}