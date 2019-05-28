
package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupComarca {

    @SerializedName("comarca_codi")
    @Expose
    private String comarcaCodi;
    @SerializedName("comarca_nom")
    @Expose
    private String comarcaNom;

    public String getComarcaCodi() {
        return comarcaCodi;
    }

    public void setComarcaCodi(String comarcaCodi) {
        this.comarcaCodi = comarcaCodi;
    }

    public String getComarcaNom() {
        return comarcaNom;
    }

    public void setComarcaNom(String comarcaNom) {
        this.comarcaNom = comarcaNom;
    }

}
