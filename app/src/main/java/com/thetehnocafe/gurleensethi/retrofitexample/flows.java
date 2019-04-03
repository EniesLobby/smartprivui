package com.thetehnocafe.gurleensethi.retrofitexample;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * This is a class that represents model of the flows inside main response
 * serializes sanitizer, source and sink parameters of the response
 */

public class flows {

    @SerializedName("sanitizer")
    @Expose
    private String sanitizer;

    @SerializedName("sink")
    @Expose
    private String sink;

    @SerializedName("source")
    @Expose
    private String source;

    public String getSanitizer() {
        return this.sanitizer;
    }

    public String getSink() {
        return this.sink;
    }

    public String getSource() {
        return this.source;
    }
}
