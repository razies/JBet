package jbet;

import java.awt.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author schmiedmayerp29
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    
    Controller myOwner;
    
    public NewJFrame(Controller owner) {
        initComponents();
        myOwner = owner;
        this.setLayout(new GridLayout(1, 1));
        RegistrationView panel = new RegistrationView(this);
        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
        panel.setVisible(true);
        this.setVisible(true);
    }

    
    // Registration View
    
    public void userDidEnterLogin(String name, String passwort){
        System.out.println("Benutzername: " + name + "  Passwort: " + passwort);
        boolean valid = myOwner.requestUserLoginValid(name,passwort);
        if (valid) {
            System.out.println("Login True");
            if(myOwner.userIsAdmin(name)){
                // Present the Admin UI
            }else{
                // Present the User UI
            }
        }else{
            System.out.println("Login False - Reenter Username of Password");
        }
    }
    
    public void creatNewUser(boolean admin, String name, String passwort){
        System.out.println("Neuer Benutzer: (Admin: " + admin + " )Benutzername: " + name + "  Passwort: " + passwort);
        boolean valid = myOwner.addUser(name,passwort,admin);
        if (valid) {
            System.out.println("Login True");
            if(admin){
                // Present the Admin UI
            }else{
                // Present the User UI
            }
        }else{
            System.out.println("ERROR: Could not create User");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(200, 2090));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 188, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
