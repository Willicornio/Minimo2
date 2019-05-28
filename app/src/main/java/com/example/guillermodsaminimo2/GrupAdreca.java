package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupAdreca {

    @SerializedName("adreca")
    @Expose
    private String adreca;
    @SerializedName("codi_postal")
    @Expose
    private String codiPostal;
    @SerializedName("municipi_nom")
    @Expose
    private String municipiNom;
    @SerializedName("adreca_completa")
    @Expose
    private String adrecaCompleta;

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getMunicipiNom() {
        return municipiNom;
    }

    public void setMunicipiNom(String municipiNom) {
        this.municipiNom = municipiNom;
    }

    public String getAdrecaCompleta() {
        return adrecaCompleta;
    }

    public void setAdrecaCompleta(String adrecaCompleta) {
        this.adrecaCompleta = adrecaCompleta;
    }

}
