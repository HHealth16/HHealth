package com.bignerdranch.android.hackhealth;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by edmundliang on 9/10/16.
 */

@IgnoreExtraProperties
public class User {


    public String email;
    public String name;
    public String age;

    public User() {

    }

    public User(String email, String name, String age) {

        this.email = email;
        this.name = name;
        this.age = age;

    }

}
