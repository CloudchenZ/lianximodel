package com.example.monthsix;

public class UserBean {
   private String name;
   private String love;

    public UserBean(String name, String love) {
        this.name = name;
        this.love = love;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLove(String love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public String getLove() {
        return love;
    }
}
