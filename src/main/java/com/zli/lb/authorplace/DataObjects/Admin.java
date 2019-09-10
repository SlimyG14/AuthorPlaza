package com.zli.lb.authorplace.DataObjects;

public class Admin {
    private Boolean Bypass;
    private int AdminId;

    public Boolean getBypass() {
        return Bypass;
    }

    public void setBypass(Boolean bypass) {
        Bypass = bypass;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }


    private int deleteUser(Author author) {
       int authorid = author.getAuthorId();
       return author.setAuthorId(authorid --);
    }
}
