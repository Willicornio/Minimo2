package com.example.guillermodsaminimo2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GrupAjuntament {

    @SerializedName("adreca-completa")
    @Expose
    private String adrecaCompleta;
    @SerializedName("adreca")
    @Expose
    private String adreca;
    @SerializedName("codi_postal")
    @Expose
    private String codiPostal;
    @SerializedName("localitzacio")
    @Expose
    private String localitzacio;
    @SerializedName("telefon_contacte")
    @Expose
    private String telefonContacte;
    @SerializedName("fax")
    @Expose
    private String fax;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("url_general")
    @Expose
    private String urlGeneral;
    @SerializedName("cif")
    @Expose
    private String cif;

    public String getAdrecaCompleta() {
        return adrecaCompleta;
    }

    public void setAdrecaCompleta(String adrecaCompleta) {
        this.adrecaCompleta = adrecaCompleta;
    }

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

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

    public String getTelefonContacte() {
        return telefonContacte;
    }

    public void setTelefonContacte(String telefonContacte) {
        this.telefonContacte = telefonContacte;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrlGeneral() {
        return urlGeneral;
    }

    public void setUrlGeneral(String urlGeneral) {
        this.urlGeneral = urlGeneral;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

}
