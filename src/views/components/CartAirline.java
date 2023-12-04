/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package views.components;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Customer;
import models.implementations.AirlineImp;
import models.implementations.UserImp;
import views.CartCustomer;

/**
 *
 * @author HP
 */
public class CartAirline extends javax.swing.JPanel {

    /**
     * Creates new form CartComponent
     */
    
    private AirlineImp airline;
    private CartCustomer cartCustomer;
    private int currentUser;
    
    public CartAirline(AirlineImp airline, CartCustomer cartCustomer ) {
        this.cartCustomer = cartCustomer;
        this.airline = airline;
        initComponents();
        this.origin.setText(this.airline.getOrigin());
        this.destination.setText(this.airline.getDestination());
        this.price.setText(Integer.toString(this.airline.getHarga()));
        this.maskapai.setText(this.airline.getClassAirline());
        this.currentUser = cartCustomer.getMainFrame().getCurrentUser();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        origin = new javax.swing.JLabel();
        destination = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        checkout = new javax.swing.JButton();
        maskapai = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setText("Origin");

        jLabel3.setText("Destination");

        origin.setText("Surabaya");

        destination.setText("Jakarta");

        price.setText("140000");

        checkout.setText("Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        maskapai.setText("Airasia");

        batal.setText("Batal");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(price)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(origin)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(destination)
                                .addGap(67, 67, 67)
                                .addComponent(maskapai))
                            .addComponent(jLabel3))
                        .addContainerGap(187, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(batal)
                        .addGap(18, 18, 18)
                        .addComponent(checkout)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origin)
                            .addComponent(destination))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(maskapai)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price)
                    .addComponent(checkout)
                    .addComponent(batal))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("BURUAN DIBELI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
        UserImp user = this.cartCustomer.getMainFrame().getPlatform().getUserIndex(currentUser);
        if(user instanceof Customer) {
            Customer customer = (Customer) user;
            try {
                int index = customer.getCart().getObject(airline);
                boolean checkout = customer.getCart().checkout(index);
                if(checkout) {
                    customer.getHistory().addHistory(airline);
                    JOptionPane.showMessageDialog(this, "Checkout Berhasil");
                }
                else{
                    JOptionPane.showMessageDialog(this, "CheckOut gagal");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
            this.cartCustomer.getListCard();
        }
    }//GEN-LAST:event_checkoutActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        UserImp user = this.cartCustomer.getMainFrame().getPlatform().getUserIndex(currentUser);
        if(user instanceof Customer) {
            Customer customer = (Customer) user;
            try {
                int index = customer.getCart().getObject(airline);
                boolean checkout = customer.getCart().removeCart(index);
                if(checkout) {
                    JOptionPane.showMessageDialog(this, "Hapus Berhasil");
                    customer.getCart().removeCart(index);
                    airline.setBookedSeats(airline.getBookedSeats() - 1);
                }
                else{
                    JOptionPane.showMessageDialog(this, "Hapus gagal");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
            this.cartCustomer.getListCard();
        }
    }//GEN-LAST:event_batalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JButton checkout;
    private javax.swing.JLabel destination;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel maskapai;
    private javax.swing.JLabel origin;
    private javax.swing.JLabel price;
    // End of variables declaration//GEN-END:variables
}
