/**
 * 
 */
package com.floreantpos.swing;

import java.awt.Toolkit;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

import com.floreantpos.main.Application;

public class DoubleDocument extends PlainDocument {

	/**
	 * @param field
	 */
	public DoubleDocument() {
	}

	@Override
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
		String value = getText(0, getLength());
		
		value = value + str;
		
		try {
			Application.parseNumber(value);
		}catch(Exception x) {
			Toolkit.getDefaultToolkit().beep();
			return;
		}
		
		super.insertString(offs, str, a);
	}
}
