package atj;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@ManagedBean
@SessionScoped
public class Controller implements Serializable {

	private static final long serialVersionUID = -3512401082776903678L;
	private CalcK calcKBean;
	private CalcConfig calcConfigBean;
	private String value;

	public Controller() {
		System.out.println("Controller started!");
		this.calcKBean = new CalcK();
		this.calcConfigBean = new CalcConfig();
	}
	
	@PostConstruct
	public void initialize() {
		System.out.println(Controller.class.getSimpleName() + " was constructed");
	}

	public String getValue() {
		if (calcKBean != null) {
			value = calcKBean.getValue();
		}
		return value;
	}

	public CalcK getCalcKBean() {
		return calcKBean;
	}

	public void setCalcKBean(CalcK calcKBean) {
		this.calcKBean = calcKBean;
	}

	public CalcConfig getCalcConfigBean() {
		return calcConfigBean;
	}

	public void setCalcConfigBean(CalcConfig calcConfigBean) {
		this.calcConfigBean = calcConfigBean;
	}

	public void caclulate(String c) {
			calcKBean.caclulate(c);
	}

	public String config() {
		return "config"; // Czyli idziemy do strony config.xhtml
	}

}
