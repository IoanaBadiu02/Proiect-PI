/**
 * 
 */
package proiect;

import java.util.ArrayList;
import java.util.List;

import proiect.Skills;

/**
 * @author ioana
 *
 */
public class Angajat {

	String user;
	String parola;
	//List<Skills> l;
	int luni;
	Pozitie Pozitie;
	Boolean Ticket;
	
	public Angajat() {
		super();
		this.user="";
		this.parola="";
		//this.l=new ArrayList<Skills>();
		this.luni= 0;
		this.Pozitie=Pozitie.FARA;
		this.Ticket= false;
	}
	
	public Angajat(List<Skills> l) {
		super();
		this.user= user;
		this.parola= parola;
		//this.l = l;
		this.luni=luni;
		this.Pozitie= Pozitie;
		this.Ticket= Ticket;
	}

	/**
	 * @return the l
	 */
	//public List<Skills> getL() {
		//return l;
	//}

	/**
	 * @param l the l to set
	 */
	//public void setL(List<Skills> l) {
	//	this.l = l;
	//}

	/**
	 * @return the luni
	 */
	public int getLuni() {
		return luni;
	}

	/**
	 * @param luni the luni to set
	 */
	public void setLuni(int luni) {
		this.luni = luni;
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
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the parola
	 */
	public String getParola() {
		return parola;
	}

	/**
	 * @param parola the parola to set
	 */
	public void setParola(String parola) {
		this.parola = parola;
	}

	/**
	 * @return the ticket
	 */
	public Boolean getTicket() {
		return Ticket;
	}

	/**
	 * @param ticket the ticket to set
	 */
	public void setTicket(Boolean ticket) {
		Ticket = ticket;
	}
	
	
	

}
