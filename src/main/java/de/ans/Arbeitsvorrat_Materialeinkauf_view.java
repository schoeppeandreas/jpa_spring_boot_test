package de.ans;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the Arbeitsvorrat_Materialeinkauf_view database table.
 * 
 */
@Entity
@IdClass(Arbeitsvorrat_Materialeinkauf_view_Id.class)
@Table(name = "arbeitsvorrat_materialeinkauf_view")
public class Arbeitsvorrat_Materialeinkauf_view implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Arbeitsvorrat_Materialeinkauf_view() {
	}
	
	public Arbeitsvorrat_Materialeinkauf_view(String neuVon) {
		this.neuVon = neuVon;
	}
	

	@Column(name="Adresse1")
	private String adresse1;

	@Column(name="ArtikelGruppe")
	private String artikelGruppe;

	private String BE_Art;

	@Temporal(TemporalType.DATE)
	@Column(name="Bestelldatum")
	private Date bestelldatum;

	@Column(name="BestellNr")
	private String bestellNr;

	@Column(name="Ersatzteil_bez")
	private String ersatzteil_bez;

	@Id
	@Column(name="ErsatzteileArtikelNr")
	private String ersatzteileArtikelNr;

	@Column(name="HerstBez")
	private String herstBez;

	@Column(name="KundenNr")
	private String kundenNr;

	@Column(name="NettoTat_BE")
	private Integer nettoTat_BE;

	@Column(name="NettoTat_Reparatur")
	private Integer nettoTat_Reparatur;


	@Temporal(TemporalType.DATE)
	@Column(name="NeuAm")
	private Date neuAm;

	@Column(name="NeuVon")
	private String neuVon;

	private Double offene_Menge;

	@Column(name="Pos")
	private Integer pos;

	@Column(name="Projekt")
	private String projekt;

	@Temporal(TemporalType.DATE)
	@Column(name="RepErsatzteile_Neuam")
	private Date repErsatzteile_Neuam;

	@Id
	@Column(name="RepNr")
	private String repNr;

	public String getAdresse1() {
		return this.adresse1;
	}

	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

	public String getArtikelGruppe() {
		return this.artikelGruppe;
	}

	public void setArtikelGruppe(String artikelGruppe) {
		this.artikelGruppe = artikelGruppe;
	}

	public String getBE_Art() {
		return this.BE_Art;
	}

	public void setBE_Art(String BE_Art) {
		this.BE_Art = BE_Art;
	}

	public Date getBestelldatum() {
		return this.bestelldatum;
	}

	public void setBestelldatum(Date bestelldatum) {
		this.bestelldatum = bestelldatum;
	}

	public String getBestellNr() {
		return this.bestellNr;
	}

	public void setBestellNr(String bestellNr) {
		this.bestellNr = bestellNr;
	}

	public String getErsatzteil_bez() {
		return this.ersatzteil_bez;
	}

	public void setErsatzteil_bez(String ersatzteil_bez) {
		this.ersatzteil_bez = ersatzteil_bez;
	}

	public String getErsatzteileArtikelNr() {
		return this.ersatzteileArtikelNr;
	}

	public void setErsatzteileArtikelNr(String ersatzteileArtikelNr) {
		this.ersatzteileArtikelNr = ersatzteileArtikelNr;
	}

	public String getHerstBez() {
		return this.herstBez;
	}

	public void setHerstBez(String herstBez) {
		this.herstBez = herstBez;
	}

	public String getKundenNr() {
		return this.kundenNr;
	}

	public void setKundenNr(String kundenNr) {
		this.kundenNr = kundenNr;
	}

	public Integer getNettoTat_BE() {
		return this.nettoTat_BE;
	}

	public void setNettoTat_BE(Integer nettoTat_BE) {
		this.nettoTat_BE = nettoTat_BE;
	}

	public Integer getNettoTat_Reparatur() {
		return this.nettoTat_Reparatur;
	}

	public void setNettoTat_Reparatur(Integer nettoTat_Reparatur) {
		this.nettoTat_Reparatur = nettoTat_Reparatur;
	}

	public Date getNeuAm() {
		return this.neuAm;
	}

	public void setNeuAm(Date neuAm) {
		this.neuAm = neuAm;
	}

	public String getNeuVon() {
		return this.neuVon;
	}

	public void setNeuVon(String neuVon) {
		this.neuVon = neuVon;
	}

	public Double getOffene_Menge() {
		return this.offene_Menge;
	}

	public void setOffene_Menge(Double offene_Menge) {
		this.offene_Menge = offene_Menge;
	}

	public Integer getPos() {
		return this.pos;
	}

	public void setPos(Integer pos) {
		this.pos = pos;
	}

	public String getProjekt() {
		return this.projekt;
	}

	public void setProjekt(String projekt) {
		this.projekt = projekt;
	}

	public Date getRepErsatzteile_Neuam() {
		return this.repErsatzteile_Neuam;
	}

	public void setRepErsatzteile_Neuam(Date repErsatzteile_Neuam) {
		this.repErsatzteile_Neuam = repErsatzteile_Neuam;
	}

	public String getRepNr() {
		return this.repNr;
	}

	public void setRepNr(String repNr) {
		this.repNr = repNr;
	}

	@Override
	public String toString() {
		return String.format(
				"Arbeitsvorrat_Materialeinkauf_view [getAdresse1()=%s, getArtikelGruppe()=%s, getBE_Art()=%s, getBestelldatum()=%s, getBestellNr()=%s, getErsatzteil_bez()=%s, getErsatzteileArtikelNr()=%s, getHerstBez()=%s, getKundenNr()=%s, getNettoTat_BE()=%s, getNettoTat_Reparatur()=%s, getNeuAm()=%s, getNeuVon()=%s, getOffene_Menge()=%s, getPos()=%s, getProjekt()=%s, getRepErsatzteile_Neuam()=%s, getRepNr()=%s]",
				getAdresse1(), getArtikelGruppe(), getBE_Art(), getBestelldatum(), getBestellNr(), getErsatzteil_bez(),
				getErsatzteileArtikelNr(), getHerstBez(), getKundenNr(), getNettoTat_BE(), getNettoTat_Reparatur(),
				getNeuAm(), getNeuVon(), getOffene_Menge(), getPos(), getProjekt(), getRepErsatzteile_Neuam(),
				getRepNr());
	}
	
	

}