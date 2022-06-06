package com.ll.dto;

/**
 * Created with IntelliJ IDEA.
 * author: 紫月
 * Date: 2022/06/01 22:00
 * Description:
 *
 * @author - -
 */

public class WorkerLL {
    private Integer wid;
    private String userName;
    private String password;

    public WorkerLL() {
    }

    public WorkerLL(Integer wid, String userName, String password) {
        this.wid = wid;
        this.userName = userName;
        this.password = password;
    }

    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "WorkerLL{" +
                "wid=" + wid +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
