/**
 * 
 */
package proiect;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ioana
 *
 */
public class Ticket {
	
	//List<Skills> l;
	int luniMin;
	Pozitie Pozitie;
	Stage Stage;
	String Angajat;
	String Descriere;
	String NumeTicket;
	
	public Ticket() {
		super();
		//this.l=new ArrayList<Skills>();
		this.luniMin = 0;
		this.Pozitie = Pozitie.FARA;
		this.Stage = Stage.CREAT;
		this.Angajat= "";
		this.Descriere="";
		this.NumeTicket="";
	}

	public Ticket(List<Skills> l, int luniMin, int luniMax, proiect.Pozitie pozitie, Boolean asignat,
			proiect.Stage stage) {
		super();
		//this.l = l;
		this.luniMin = luniMin;
		this.Pozitie = pozitie;
		this.Stage = stage;
		this.Angajat = Angajat;
		this.Descriere = Descriere;
		this.NumeTicket=NumeTicket;
	}

	/**
	 * @return the l
	 */
	//public List<Skills> getL() {
	//	return l;
	//}

	/**
	 * @param l the l to set
	 */
	//public void setL(List<Skills> l) {
	//	this.l = l;
	//}

	/**
	 * @return the luniMin
	 */
	public int getLuniMin() {
		return luniMin;
	}

	/**
	 * @param luniMin the luniMin to set
	 */
	public void setLuniMin(int luniMin) {
		this.luniMin = luniMin;
	}


	/**
	 * @return the pozitie
	 */
	public Pozitie getPozitie() {
		return Pozitie;
	}

	/**
	 * @param pozitie the pozitie to set
	 */
	public void setPozitie(Pozitie pozitie) {
		Pozitie = pozitie;
	}

	/**
	 * @return the angajat
	 */
	public String getAngajat() {
		return Angajat;
	}

	/**
	 * @param angajat the angajat to set
	 */
	public void setAngajat(String angajat) {
		Angajat = angajat;
	}

	/**
	 * @return the descriere
	 */
	public String getDescriere() {
		return Descriere;
	}

	/**
	 * @param descriere the descriere to set
	 */
	public void setDescriere(String descriere) {
		Descriere = descriere;
	}

	/**
	 * @return the numeTicket
	 */
	public String getNumeTicket() {
		return NumeTicket;
	}

	/**
	 * @param numeTicket the numeTicket to set
	 */
	public void setNumeTicket(String numeTicket) {
		NumeTicket = numeTicket;
	}

	/**
	 * @return the stage
	 */
	public Stage getStage() {
		return Stage;
	}

	/**
	 * @param stage the stage to set
	 */
	public void setStage(Stage stage) {
		Stage = stage;
	}
	
	

}
