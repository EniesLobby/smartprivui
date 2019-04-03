package com.thetehnocafe.gurleensethi.retrofitexample;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.*;

/**
 * This is a class that represents model of the response
 * The response from API backend returns code and flows array
 * This is done through retrofit library that makes serialization (from json to java object) automatically
 */

public class ApiResponse {

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("flows")
    @Expose
    private List<flows> flows = new ArrayList<>();

    public String getCode() {
        return this.code;
    }

    public List<flows> getFlows() { return this.flows; }

}
