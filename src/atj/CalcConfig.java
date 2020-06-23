package atj;

public class CalcConfig {
	
	private String displayColor;
	private String backgroundColor;
	
	public CalcConfig() {
		displayColor = "Sz";
		backgroundColor = "Sz";
	}
	
	public String getDisplayColor() {
		return displayColor;
	}

	public void setDisplayColor(String displayColor) {
		this.displayColor = displayColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	

//	public String config() {
//	    return "config";  // Czyli idziemy do strony result.xhtml
//	  }

}
