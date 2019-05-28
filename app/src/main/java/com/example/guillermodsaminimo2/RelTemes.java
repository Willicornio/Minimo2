package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelTemes {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("elements")
    @Expose
    private String elements;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getElements() {
        return elements;
    }

    public void setElements(String elements) {
        this.elements = elements;
    }

}
