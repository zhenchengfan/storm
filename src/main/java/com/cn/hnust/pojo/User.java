package com.cn.hnust.pojo;

import java.util.Date;

public class User {
    private String userId;

    private String userName;

    private String usePwd;

    private Date insterDate;

    private Date updateDate;
    
    private String userImg;
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUsePwd() {
        return usePwd;
    }

    public void setUsePwd(String usePwd) {
        this.usePwd = usePwd == null ? null : usePwd.trim();
    }

    public Date getInsterDate() {
        return insterDate;
    }

    public void setInsterDate(Date insterDate) {
        this.insterDate = insterDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

	public String getUserImg() {
		return userImg;
	}

	public void setUserImg(String userImg) {
		this.userImg = userImg;
	}
    
}