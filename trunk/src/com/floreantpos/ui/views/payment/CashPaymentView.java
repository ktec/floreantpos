/*
 * CashPaymentView.java
 *
 * Created on August 11, 2006, 7:30 PM
 */

package com.floreantpos.ui.views.payment;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;

import com.floreantpos.main.Application;
import com.floreantpos.model.CashTransaction;
import com.floreantpos.swing.PosButton;
import com.floreantpos.ui.views.PaymentView;
import com.floreantpos.ui.views.SwitchboardView;
import com.floreantpos.ui.views.order.RootView;

/**
 *
 * @author  MShahriar
 */
public class CashPaymentView extends PaymentView {
	public final static String VIEW_NAME = "CASHPAYMENT_VIEW";

	/** Creates new form CashPaymentView */
	public CashPaymentView() {
		initComponents();
		tfAmountTendered.setText("0");
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jPanel1 = new com.floreantpos.swing.TransparentPanel();
        jLabel1 = new javax.swing.JLabel();
        tfAmountTendered = new javax.swing.JTextField();
        calcButtonPanel = new com.floreantpos.swing.TransparentPanel();
        posButton1 = new com.floreantpos.swing.PosButton();
        posButton2 = new com.floreantpos.swing.PosButton();
        posButton3 = new com.floreantpos.swing.PosButton();
        posButton4 = new com.floreantpos.swing.PosButton();
        posButton5 = new com.floreantpos.swing.PosButton();
        posButton6 = new com.floreantpos.swing.PosButton();
        posButton9 = new com.floreantpos.swing.PosButton();
        posButton8 = new com.floreantpos.swing.PosButton();
        posButton7 = new com.floreantpos.swing.PosButton();
        posButton11 = new com.floreantpos.swing.PosButton();
        posButton10 = new com.floreantpos.swing.PosButton();
        posButton12 = new com.floreantpos.swing.PosButton();
        jPanel3 = new com.floreantpos.swing.TransparentPanel();
        jPanel4 = new com.floreantpos.swing.TransparentPanel();
        btnChangePayment = new com.floreantpos.swing.PosButton();
        btnExactChange = new com.floreantpos.swing.PosButton();
        btnNextAmount = new com.floreantpos.swing.PosButton();
        jPanel5 = new com.floreantpos.swing.TransparentPanel();
        btnFinish = new com.floreantpos.swing.PosButton();
        btnCancel = new com.floreantpos.swing.PosButton();

        setLayout(new java.awt.BorderLayout(5, 5));

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, com.floreantpos.POSConstants.CASH_TRANSACTION, javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 5), javax.swing.BorderFactory.createTitledBorder("")));
        jPanel1.setPreferredSize(new java.awt.Dimension(98, 90));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(204, 102, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("AMOUNT TENDERED");
        jPanel1.add(jLabel1, java.awt.BorderLayout.NORTH);

        tfAmountTendered.setBackground(java.awt.Color.white);
        tfAmountTendered.setEditable(false);
        tfAmountTendered.setFont(new java.awt.Font("Tahoma", 1, 24));
        tfAmountTendered.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tfAmountTendered.setText("0");
        tfAmountTendered.setPreferredSize(new java.awt.Dimension(21, 40));
        jPanel1.add(tfAmountTendered, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.NORTH);

        calcButtonPanel.setLayout(new java.awt.GridLayout(0, 3, 5, 5));

        calcButtonPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        posButton1.setAction(calAction);
        posButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/7_32.png")));
        posButton1.setActionCommand("7");
        posButton1.setFocusable(false);
        calcButtonPanel.add(posButton1);

        posButton2.setAction(calAction);
        posButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/8_32.png")));
        posButton2.setActionCommand("8");
        posButton2.setFocusable(false);
        calcButtonPanel.add(posButton2);

        posButton3.setAction(calAction);
        posButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/9_32.png")));
        posButton3.setActionCommand("9");
        posButton3.setFocusable(false);
        calcButtonPanel.add(posButton3);

        posButton4.setAction(calAction);
        posButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/4_32.png")));
        posButton4.setActionCommand("4");
        posButton4.setFocusable(false);
        calcButtonPanel.add(posButton4);

        posButton5.setAction(calAction);
        posButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/5_32.png")));
        posButton5.setActionCommand("5");
        posButton5.setFocusable(false);
        calcButtonPanel.add(posButton5);

        posButton6.setAction(calAction);
        posButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/6_32.png")));
        posButton6.setActionCommand("6");
        posButton6.setFocusable(false);
        calcButtonPanel.add(posButton6);

        posButton9.setAction(calAction);
        posButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1_32.png")));
        posButton9.setActionCommand("1");
        posButton9.setFocusable(false);
        calcButtonPanel.add(posButton9);

        posButton8.setAction(calAction);
        posButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/2_32.png")));
        posButton8.setActionCommand("2");
        posButton8.setFocusable(false);
        calcButtonPanel.add(posButton8);

        posButton7.setAction(calAction);
        posButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/3_32.png")));
        posButton7.setActionCommand("3");
        posButton7.setFocusable(false);
        calcButtonPanel.add(posButton7);

        posButton11.setAction(calAction);
        posButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/0_32.png")));
        posButton11.setActionCommand("0");
        posButton11.setFocusable(false);
        calcButtonPanel.add(posButton11);

        posButton10.setAction(calAction);
        posButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dot_32.png")));
        posButton10.setActionCommand(".");
        posButton10.setFocusable(false);
        calcButtonPanel.add(posButton10);

        posButton12.setAction(calAction);
        posButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear_32.png")));
        posButton12.setText("CLEAR");
        posButton12.setFocusable(false);
        calcButtonPanel.add(posButton12);

        add(calcButtonPanel, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0, 2, 5));

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 3, 1, 3));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 130));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        btnChangePayment.setText("<html><body><p align='center'>CHANGE PAYMENT METHOD</p></body></html>");
        btnChangePayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePaymentActionPerformed(evt);
            }
        });

        jPanel4.add(btnChangePayment);

        btnExactChange.setText("EXACT CHANGE");
        btnExactChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExactChangeActionPerformed(evt);
            }
        });

        jPanel4.add(btnExactChange);

        btnNextAmount.setText("NEXT AMT");
        btnNextAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextAmountActionPerformed(evt);
            }
        });

        jPanel4.add(btnNextAmount);

        jPanel3.add(jPanel4);

        jPanel5.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        btnFinish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/finish_32.png")));
        btnFinish.setText("FINISH");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doFinish(evt);
            }
        });

        jPanel5.add(btnFinish);

        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_32.png")));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPanel5.add(btnCancel);

        jPanel3.add(jPanel5);

        add(jPanel3, java.awt.BorderLayout.SOUTH);

    }// </editor-fold>//GEN-END:initComponents

	private void btnChangePaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePaymentActionPerformed
		changePaymentMethod();
	}//GEN-LAST:event_btnChangePaymentActionPerformed

	private void doFinish(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doFinish
		double tenderedAmount = Application.parseNumber(tfAmountTendered.getText());
		settleTickets(tenderedAmount, 0, new CashTransaction(), null, null);
	}//GEN-LAST:event_doFinish

	private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
		RootView.getInstance().showView(SwitchboardView.VIEW_NAME);
	}//GEN-LAST:event_btnCancelActionPerformed

	private void btnExactChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExactChangeActionPerformed
		settleTickets(getDueAmount(), 0, new CashTransaction(), null, null);
	}//GEN-LAST:event_btnExactChangeActionPerformed

	private void btnNextAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextAmountActionPerformed
		double totalPrice = getDueAmount();
		double tenderedAmount = Math.ceil(totalPrice);

		//ticket.setTenderedAmount(tenderedAmount);

		//doPayTicket();
		settleTickets(tenderedAmount, 0, new CashTransaction(), null, null);
	}//GEN-LAST:event_btnNextAmountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.floreantpos.swing.PosButton btnCancel;
    private com.floreantpos.swing.PosButton btnChangePayment;
    private com.floreantpos.swing.PosButton btnExactChange;
    private com.floreantpos.swing.PosButton btnFinish;
    private com.floreantpos.swing.PosButton btnNextAmount;
    private com.floreantpos.swing.TransparentPanel calcButtonPanel;
    private javax.swing.JLabel jLabel1;
    private com.floreantpos.swing.TransparentPanel jPanel1;
    private com.floreantpos.swing.TransparentPanel jPanel3;
    private com.floreantpos.swing.TransparentPanel jPanel4;
    private com.floreantpos.swing.TransparentPanel jPanel5;
    private com.floreantpos.swing.PosButton posButton1;
    private com.floreantpos.swing.PosButton posButton10;
    private com.floreantpos.swing.PosButton posButton11;
    private com.floreantpos.swing.PosButton posButton12;
    private com.floreantpos.swing.PosButton posButton2;
    private com.floreantpos.swing.PosButton posButton3;
    private com.floreantpos.swing.PosButton posButton4;
    private com.floreantpos.swing.PosButton posButton5;
    private com.floreantpos.swing.PosButton posButton6;
    private com.floreantpos.swing.PosButton posButton7;
    private com.floreantpos.swing.PosButton posButton8;
    private com.floreantpos.swing.PosButton posButton9;
    private javax.swing.JTextField tfAmountTendered;
    // End of variables declaration//GEN-END:variables

	public void resetView() {
		tfAmountTendered.setText("0");
	}

	Dimension preferredSize = new Dimension(330, 100);

	public Dimension getPreferredSize() {
		return preferredSize;
	}

	Action calAction = new AbstractAction() {
		public void actionPerformed(ActionEvent e) {
			PosButton button = (PosButton) e.getSource();
			String s = button.getActionCommand();
			if (s.equals("CLEAR")) {
				tfAmountTendered.setText("0");
			}
			else if (s.equals(".")) {
				if (tfAmountTendered.getText().indexOf('.') < 0) {
					tfAmountTendered.setText(tfAmountTendered.getText() + ".");
				}
			}
			else {
				String string = tfAmountTendered.getText();
				int index = string.indexOf('.');
				if (index < 0) {
					double value = 0;
					try {
						value = Double.parseDouble(string);
					} catch (NumberFormatException x) {
						Toolkit.getDefaultToolkit().beep();
					}
					if (value == 0) {
						tfAmountTendered.setText(s);
					}
					else {
						tfAmountTendered.setText(string + s);
					}
				}
				else {
					tfAmountTendered.setText(string + s);
				}
			}
		}
	};

	@Override
	public void updateView() {
		tfAmountTendered.setText(Application.formatNumber(getDueAmount()));
	}
}
