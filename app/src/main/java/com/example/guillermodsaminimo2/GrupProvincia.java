
package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupProvincia {

    @SerializedName("provincia_codi")
    @Expose
    private String provinciaCodi;
    @SerializedName("provincia_nom")
    @Expose
    private String provinciaNom;

    public String getProvinciaCodi() {
        return provinciaCodi;
    }

    public void setProvinciaCodi(String provinciaCodi) {
        this.provinciaCodi = provinciaCodi;
    }

    public String getProvinciaNom() {
        return provinciaNom;
    }

    public void setProvinciaNom(String provinciaNom) {
        this.provinciaNom = provinciaNom;
    }

}
