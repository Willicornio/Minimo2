
package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Referency {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("nom")
    @Expose
    private String nom;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
