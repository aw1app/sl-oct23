package com.ecommerce.taglibs;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

// A Custom lib that will output a bulleted list from a comma separated string
public class BulletedListFromAString extends SimpleTagSupport {

	private String items;

	public void setItems(String items) {
		this.items = items;
	}

	@Override
	public void doTag() throws JspException, IOException {

		String[] itemList = items.split(",");

		getJspContext().getOut().write("<ul>");

		for (String item : itemList) {
			getJspContext().getOut().write("<li>" + item.trim() + "</li>");
		}

		getJspContext().getOut().write("</ul>");

	}

}
