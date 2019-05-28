package com.example.guillermodsaminimo2;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Element {

    @SerializedName("punt_id")
    @Expose
    private String puntId;
    @SerializedName("adreca_nom")
    @Expose
    private String adrecaNom;
    @SerializedName("descripcio")
    @Expose
    private String descripcio;
    @SerializedName("grup_adreca")
    @Expose
    private GrupAdreca grupAdreca;
    @SerializedName("localitzacio")
    @Expose
    private String localitzacio;
    @SerializedName("imatge")
    @Expose
    private List<String> imatge = null;
    @SerializedName("url_general")
    @Expose
    private String urlGeneral;
    @SerializedName("email")
    @Expose
    private List<String> email = null;
    @SerializedName("telefon_contacte")
    @Expose
    private List<String> telefonContacte = null;
    @SerializedName("fax")
    @Expose
    private List<Object> fax = null;
    @SerializedName("horaris")
    @Expose
    private String horaris;
    @SerializedName("rel_municipis")
    @Expose
    private RelMunicipis relMunicipis;
    @SerializedName("rel_temes")
    @Expose
    private RelTemes relTemes;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("categoria")
    @Expose
    private List<String> categoria = null;
    @SerializedName("rel_comarca")
    @Expose
    private List<String> relComarca = null;
    @SerializedName("id_secundari")
    @Expose
    private String idSecundari;
    @SerializedName("cercador_codi")
    @Expose
    private String cercadorCodi;
    @SerializedName("director")
    @Expose
    private String director;
    @SerializedName("xarxes_socials")
    @Expose
    private List<Object> xarxesSocials = null;
    @SerializedName("url_relacionades")
    @Expose
    private List<String> urlRelacionades = null;
    @SerializedName("inici_horari_hivern")
    @Expose
    private String iniciHorariHivern;
    @SerializedName("inici_horari_estiu")
    @Expose
    private String iniciHorariEstiu;

    public String getPuntId() {
        return puntId;
    }

    public void setPuntId(String puntId) {
        this.puntId = puntId;
    }

    public String getAdrecaNom() {
        return adrecaNom;
    }

    public void setAdrecaNom(String adrecaNom) {
        this.adrecaNom = adrecaNom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public GrupAdreca getGrupAdreca() {
        return grupAdreca;
    }

    public void setGrupAdreca(GrupAdreca grupAdreca) {
        this.grupAdreca = grupAdreca;
    }

    public String getLocalitzacio() {
        return localitzacio;
    }

    public void setLocalitzacio(String localitzacio) {
        this.localitzacio = localitzacio;
    }

    public List<String> getImatge() {
        return imatge;
    }

    public void setImatge(List<String> imatge) {
        this.imatge = imatge;
    }

    public String getUrlGeneral() {
        return urlGeneral;
    }

    public void setUrlGeneral(String urlGeneral) {
        this.urlGeneral = urlGeneral;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getTelefonContacte() {
        return telefonContacte;
    }

    public void setTelefonContacte(List<String> telefonContacte) {
        this.telefonContacte = telefonContacte;
    }

    public List<Object> getFax() {
        return fax;
    }

    public void setFax(List<Object> fax) {
        this.fax = fax;
    }

    public String getHoraris() {
        return horaris;
    }

    public void setHoraris(String horaris) {
        this.horaris = horaris;
    }

    public RelMunicipis getRelMunicipis() {
        return relMunicipis;
    }

    public void setRelMunicipis(RelMunicipis relMunicipis) {
        this.relMunicipis = relMunicipis;
    }

    public RelTemes getRelTemes() {
        return relTemes;
    }

    public void setRelTemes(RelTemes relTemes) {
        this.relTemes = relTemes;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<String> categoria) {
        this.categoria = categoria;
    }

    public List<String> getRelComarca() {
        return relComarca;
    }

    public void setRelComarca(List<String> relComarca) {
        this.relComarca = relComarca;
    }

    public String getIdSecundari() {
        return idSecundari;
    }

    public void setIdSecundari(String idSecundari) {
        this.idSecundari = idSecundari;
    }

    public String getCercadorCodi() {
        return cercadorCodi;
    }

    public void setCercadorCodi(String cercadorCodi) {
        this.cercadorCodi = cercadorCodi;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public List<Object> getXarxesSocials() {
        return xarxesSocials;
    }

    public void setXarxesSocials(List<Object> xarxesSocials) {
        this.xarxesSocials = xarxesSocials;
    }

    public List<String> getUrlRelacionades() {
        return urlRelacionades;
    }

    public void setUrlRelacionades(List<String> urlRelacionades) {
        this.urlRelacionades = urlRelacionades;
    }

    public String getIniciHorariHivern() {
        return iniciHorariHivern;
    }

    public void setIniciHorariHivern(String iniciHorariHivern) {
        this.iniciHorariHivern = iniciHorariHivern;
    }

    public String getIniciHorariEstiu() {
        return iniciHorariEstiu;
    }

    public void setIniciHorariEstiu(String iniciHorariEstiu) {
        this.iniciHorariEstiu = iniciHorariEstiu;
    }

}
