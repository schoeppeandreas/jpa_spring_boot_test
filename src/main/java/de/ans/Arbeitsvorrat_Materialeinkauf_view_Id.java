package de.ans;

import java.io.Serializable;
public class Arbeitsvorrat_Materialeinkauf_view_Id implements Serializable {
	private static final long serialVersionUID = 1L;
	

	private String ersatzteileArtikelNr;
	private String repNr;


	public String getErsatzteileArtikelNr() {
		return ersatzteileArtikelNr;
	}

	public void setErsatzteileArtikelNr(String ersatzteileArtikelNr) {
		this.ersatzteileArtikelNr = ersatzteileArtikelNr;
	}

	public String getRepNr() {
		return repNr;
	}

	public void setRepNr(String repNr) {
		this.repNr = repNr;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ersatzteileArtikelNr == null) ? 0 : ersatzteileArtikelNr.hashCode());
		result = prime * result + ((repNr == null) ? 0 : repNr.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Arbeitsvorrat_Materialeinkauf_view_Id other = (Arbeitsvorrat_Materialeinkauf_view_Id) obj;
		if (ersatzteileArtikelNr == null) {
			if (other.ersatzteileArtikelNr != null)
				return false;
		} else if (!ersatzteileArtikelNr.equals(other.ersatzteileArtikelNr))
			return false;
		if (repNr == null) {
			if (other.repNr != null)
				return false;
		} else if (!repNr.equals(other.repNr))
			return false;
		return true;
	}

}
