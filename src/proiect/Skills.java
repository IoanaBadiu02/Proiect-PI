/**
 * 
 */
package proiect;

/**
 * @author ioana
 *
 */
public class Skills {

	Boolean Cpp;
	Boolean Java;
	Boolean Python;
	Boolean Swift;
	
	Boolean DataBase;
	Boolean Media;
	Boolean Design;
	Boolean Speech;
	Boolean UserSync;
	
	public Skills() {
		
		super();
		Cpp = false;
		Java = false;
		Python = false;
		Swift = false;
		DataBase = false;
		Media = false;
		Design = false;
		Speech = false;
		UserSync = false;
		
		
	}
	public Skills(Boolean cpp, Boolean java, 
			Boolean python, Boolean swift, 
			Boolean dataBase, Boolean media,
			Boolean design, Boolean speach, Boolean userSync) {
		
		super();
		Cpp = Cpp;
		Java = Java;
		Python = Python;
		Swift = Swift;
		DataBase = DataBase;
		Media = Media;
		Design = Design;
		Speech = Speech;
		UserSync = UserSync;
		
		
	}

	/**
	 * @return the cpp
	 */
	public Boolean getCpp() {
		return Cpp;
	}

	/**
	 * @param cpp the cpp to set
	 */
	public void setCpp(Boolean cpp) {
		Cpp = cpp;
	}

	/**
	 * @return the java
	 */
	public Boolean getJava() {
		return Java;
	}

	/**
	 * @param java the java to set
	 */
	public void setJava(Boolean java) {
		Java = java;
	}

	/**
	 * @return the python
	 */
	public Boolean getPython() {
		return Python;
	}

	/**
	 * @param python the python to set
	 */
	public void setPython(Boolean python) {
		Python = python;
	}

	/**
	 * @return the swift
	 */
	public Boolean getSwift() {
		return Swift;
	}

	/**
	 * @param swift the swift to set
	 */
	public void setSwift(Boolean swift) {
		Swift = swift;
	}

	/**
	 * @return the dataBase
	 */
	public Boolean getDataBase() {
		return DataBase;
	}

	/**
	 * @param dataBase the dataBase to set
	 */
	public void setDataBase(Boolean dataBase) {
		DataBase = dataBase;
	}

	/**
	 * @return the media
	 */
	public Boolean getMedia() {
		return Media;
	}

	/**
	 * @param media the media to set
	 */
	public void setMedia(Boolean media) {
		Media = media;
	}

	/**
	 * @return the design
	 */
	public Boolean getDesign() {
		return Design;
	}

	/**
	 * @param design the design to set
	 */
	public void setDesign(Boolean design) {
		Design = design;
	}

	/**
	 * @return the speach
	 */
	public Boolean getSpeech() {
		return Speech;
	}

	/**
	 * @param speach the speach to set
	 */
	public void setSpeech(Boolean speech) {
		Speech = speech;
	}

	/**
	 * @return the userSync
	 */
	public Boolean getUserSync() {
		return UserSync;
	}

	/**
	 * @param userSync the userSync to set
	 */
	public void setUserSync(Boolean userSync) {
		UserSync = userSync;
	}
	

	
}
