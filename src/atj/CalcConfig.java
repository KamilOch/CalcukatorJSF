package atj;

public class CalcConfig {

	private String displayColor;
	private String backgroundColor;
	private String font;
	
	public CalcConfig() {
		displayColor = "Sz";
		backgroundColor = "Sz";
		font = "1";
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
	
	public String getFont() {
		return font;
	}

	public void setFont(String font) {
		this.font = font;
	}

	

//	public String config() {
//	    return "config";  // Czyli idziemy do strony result.xhtml
//	  }

}
