package Coolection;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {

	public static void main(String[] args) {
		Locale loclae = new Locale("en", "IN");
		ResourceBundle bundle = ResourceBundle.getBundle("demo.message", new Locale("en", "IN"));
		System.out.println("" + bundle.getString("test"));

	}

}
