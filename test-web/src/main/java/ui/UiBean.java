package ui;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class UiBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6540261979966084857L;

	public UiBean() {
		// TODO Auto-generated constructor stub
	}

	
	public static String testSay() {
		return "ali";
	}
	
	public void sayHello() {
		System.err.println("hello aliam");
	}
	
	
	
}
