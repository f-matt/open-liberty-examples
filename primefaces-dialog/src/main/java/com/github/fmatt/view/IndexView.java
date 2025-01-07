package com.github.fmatt.view;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.primefaces.PrimeFaces;

@Named
@RequestScoped
public class IndexView {

	private String message = "Message 1";

	private String dialogMessage = "Message 2";

	public void openDialog() {
		PrimeFaces.current().executeScript("PF('dialog').show()");
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDialogMessage() {
		return dialogMessage;
	}

	public void setDialogMessage(String dialogMessage) {
		this.dialogMessage = dialogMessage;
	}
}
