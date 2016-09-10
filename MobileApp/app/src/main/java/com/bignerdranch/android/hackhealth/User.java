package com.bignerdranch.android.hackhealth;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by edmundliang on 9/10/16.
 */

@IgnoreExtraProperties
public class User {


    public String email;

    public User() {

    }

    public User(String email) {

        this.email = email;

    }

}
