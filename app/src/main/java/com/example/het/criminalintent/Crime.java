package com.example.het.criminalintent;

import java.util.UUID;

/**
 * Created by HET on 22.7.2014.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public UUID getmId() {
        return mId;
    }

    public void setmId(UUID mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }
    public Crime(){


        //Generate unique identifier
        mId = UUID.randomUUID();
    }
}
