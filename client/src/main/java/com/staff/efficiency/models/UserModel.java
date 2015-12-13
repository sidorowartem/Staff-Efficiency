package com.staff.efficiency.models;

import java.io.Serializable;

public class UserModel implements Serializable {

    private static final long serialVersionUID = -3535685329761592446L;
    private String userName;

    public UserModel(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
}
