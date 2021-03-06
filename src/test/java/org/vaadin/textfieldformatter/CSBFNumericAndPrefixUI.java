package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.textfieldformatter.CustomStringBlockFormatter.Options;

import com.vaadin.ui.Component;
import com.vaadin.ui.TextField;

public class CSBFNumericAndPrefixUI extends AbstractTest {

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		Options fmtOptions = new Options();
		fmtOptions.setNumericOnly(true);
		fmtOptions.setPrefix("PREFIX:");
		CustomStringBlockFormatter formatter = new CustomStringBlockFormatter(fmtOptions);
		formatter.extend(tf);
		return tf;
	}
}
