package ui;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class AlikhahBean {

	public AlikhahBean() {
		// TODO Auto-generated constructor stub
	}

	
	
	public void added() {
		System.err.println("added");
	}
}
