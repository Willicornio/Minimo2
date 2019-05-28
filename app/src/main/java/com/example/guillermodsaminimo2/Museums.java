package com.example.guillermodsaminimo2;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Museums {

    @SerializedName("nom")
    @Expose
    private String nom;
    @SerializedName("machinename")
    @Expose
    private String machinename;
    @SerializedName("descripcio")
    @Expose
    private String descripcio;
    @SerializedName("paraules_clau")
    @Expose
    private List<String> paraulesClau = null;
    @SerializedName("llicencia")
    @Expose
    private String llicencia;
    @SerializedName("freq_actualitzacio")
    @Expose
    private Integer freqActualitzacio;
    @SerializedName("sector")
    @Expose
    private List<String> sector = null;
    @SerializedName("tema")
    @Expose
    private List<String> tema = null;
    @SerializedName("responsable")
    @Expose
    private String responsable;
    @SerializedName("idioma")
    @Expose
    private String idioma;
    @SerializedName("home_page")
    @Expose
    private String homePage;
    @SerializedName("referencies")
    @Expose
    private List<Referency> referencies = null;
    @SerializedName("tipus")
    @Expose
    private String tipus;
    @SerializedName("estat")
    @Expose
    private String estat;
    @SerializedName("creacio")
    @Expose
    private String creacio;
    @SerializedName("modificacio")
    @Expose
    private String modificacio;
    @SerializedName("entitats")
    @Expose
    private Integer entitats;
    @SerializedName("elements")
    @Expose
    private List<Element> elements = null;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public List<String> getParaulesClau() {
        return paraulesClau;
    }

    public void setParaulesClau(List<String> paraulesClau) {
        this.paraulesClau = paraulesClau;
    }

    public String getLlicencia() {
        return llicencia;
    }

    public void setLlicencia(String llicencia) {
        this.llicencia = llicencia;
    }

    public Integer getFreqActualitzacio() {
        return freqActualitzacio;
    }

    public void setFreqActualitzacio(Integer freqActualitzacio) {
        this.freqActualitzacio = freqActualitzacio;
    }

    public List<String> getSector() {
        return sector;
    }

    public void setSector(List<String> sector) {
        this.sector = sector;
    }

    public List<String> getTema() {
        return tema;
    }

    public void setTema(List<String> tema) {
        this.tema = tema;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getHomePage() {
        return homePage;
    }

    public void setHomePage(String homePage) {
        this.homePage = homePage;
    }

    public List<Referency> getReferencies() {
        return referencies;
    }

    public void setReferencies(List<Referency> referencies) {
        this.referencies = referencies;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getEstat() {
        return estat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public String getCreacio() {
        return creacio;
    }

    public void setCreacio(String creacio) {
        this.creacio = creacio;
    }

    public String getModificacio() {
        return modificacio;
    }

    public void setModificacio(String modificacio) {
        this.modificacio = modificacio;
    }

    public Integer getEntitats() {
        return entitats;
    }

    public void setEntitats(Integer entitats) {
        this.entitats = entitats;
    }

    public List<Element> getElements() {
        return elements;
    }

    public void setElements(List<Element> elements) {
        this.elements = elements;
    }

}
