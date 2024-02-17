package com.ecommerce.taglibs;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

// A Custom lib that will output a bulleted list from a comma separated string
public class BulletedListFromAString extends TagSupport {

	private String items;

	public void setItems(String items) {
		this.items = items;
	}

	public int doStartTag() throws JspException {

		String[] itemList = items.split(",");

		JspWriter out = pageContext.getOut();

		try {
			out.write("<ul>");

			for (String item : itemList) {
				out.write("<li>" + item.trim() + "</li>");
			}

			out.write("</ul>");
		} catch (IOException e) {
			e.printStackTrace();
		}

		return SKIP_BODY;

	}

}
