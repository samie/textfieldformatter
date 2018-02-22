package org.vaadin.textfieldformatter;

import com.vaadin.annotations.JavaScript;
import com.vaadin.server.AbstractJavaScriptExtension;
import com.vaadin.ui.AbstractTextField;

@JavaScript({ "cleave.min.js", "cleave-phone.i18n.js", "phone_connector.js" })
public class PhoneFieldFormatter extends AbstractJavaScriptExtension {

	public PhoneFieldFormatter(String phoneRegionCode) {
		getState().phoneRegionCode = phoneRegionCode;
	}

	@Override
	protected PhoneFieldFormatterState getState() {
		return (PhoneFieldFormatterState) super.getState();
	}

	/**
	 * Adds this extension to a AbstractTextField. Extension cannot be moved to
	 * another TextField again.
	 */
	public void extend(AbstractTextField textField) {
		super.extend(textField);
	}
}
