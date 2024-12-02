package src.backend.lastLogin;

import java.sql.Date;

public class LastLogin {

    private int id;
    private int userId;
    private Date loginTime;

    public LastLogin(int id, int userId, Date loginTime) {
        this.id = id;
        this.userId = userId;
        this.loginTime = loginTime;
    }

    public LastLogin(int userId, Date loginTime) {
        this.userId = userId;
        this.loginTime = loginTime;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

}