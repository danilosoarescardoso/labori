/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboriempresa.frames;

import ejb.stateless.CompanyBeanLocal;
import entity.Company;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.swing.JOptionPane;
import laboriempresa.util.GetEJB;

/**
 *
 * @author cauelt
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public MainFrame() {
        try {
            getEJB = new GetEJB();
            companyBean = getEJB.getCompany();
        } catch (NamingException ex) {
            JOptionPane.showMessageDialog(null, "ERRO FATAL: Sem comunicação com o EJB", null, WIDTH);
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
            System.exit(1);
        }

        initComponents();
        this.setLocationRelativeTo(null);
        labLoginError.setVisible(false);
        dialogLogin.setLocationRelativeTo(null);
        dialogLogin.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogLogin = new javax.swing.JDialog();
        labLoginPassword = new javax.swing.JLabel();
        labLoginCNPJ = new javax.swing.JLabel();
        panLoginHeader = new javax.swing.JPanel();
        labLoginEmpresa = new javax.swing.JLabel();
        labLoginLogo = new javax.swing.JLabel();
        inputLoginCNPJ = new javax.swing.JFormattedTextField();
        inputLoginPassword = new javax.swing.JPasswordField();
        buttonLoginSubmit = new javax.swing.JButton();
        labLoginError = new javax.swing.JLabel();
        panHeader = new javax.swing.JPanel();
        labEmpresa = new javax.swing.JLabel();
        labLogo = new javax.swing.JLabel();

        dialogLogin.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        dialogLogin.setTitle("Login");
        dialogLogin.setAlwaysOnTop(true);
        dialogLogin.setModalityType(java.awt.Dialog.ModalityType.MODELESS);
        dialogLogin.setPreferredSize(new java.awt.Dimension(328, 230));
        dialogLogin.setResizable(false);
        dialogLogin.setSize(new java.awt.Dimension(328, 230));
        dialogLogin.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                quitProgram(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                quitProgram(evt);
            }
        });

        labLoginPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLoginPassword.setText("Senha:");

        labLoginCNPJ.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLoginCNPJ.setText("CNPJ:");

        panLoginHeader.setBackground(new java.awt.Color(255, 255, 255));
        panLoginHeader.setPreferredSize(new java.awt.Dimension(344, 74));

        labLoginEmpresa.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labLoginEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLoginEmpresa.setText("Empresa");
        labLoginEmpresa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labLoginLogo.setBackground(new java.awt.Color(255, 255, 255));
        labLoginLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labLoginLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboriempresa/assets/labori-logo.gif"))); // NOI18N

        org.jdesktop.layout.GroupLayout panLoginHeaderLayout = new org.jdesktop.layout.GroupLayout(panLoginHeader);
        panLoginHeader.setLayout(panLoginHeaderLayout);
        panLoginHeaderLayout.setHorizontalGroup(
            panLoginHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panLoginHeaderLayout.createSequentialGroup()
                .add(labLoginLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labLoginEmpresa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panLoginHeaderLayout.setVerticalGroup(
            panLoginHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panLoginHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .add(panLoginHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labLoginLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labLoginEmpresa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        try {
            inputLoginCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonLoginSubmit.setText("Entrar");
        buttonLoginSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login(evt);
            }
        });

        labLoginError.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        labLoginError.setForeground(new java.awt.Color(100, 0, 0));
        labLoginError.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labLoginError.setText("CNPJ ou senha inválidos");

        org.jdesktop.layout.GroupLayout dialogLoginLayout = new org.jdesktop.layout.GroupLayout(dialogLogin.getContentPane());
        dialogLogin.getContentPane().setLayout(dialogLoginLayout);
        dialogLoginLayout.setHorizontalGroup(
            dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panLoginHeader, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
            .add(dialogLoginLayout.createSequentialGroup()
                .addContainerGap()
                .add(dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labLoginCNPJ, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(labLoginPassword, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(labLoginError, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(buttonLoginSubmit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 116, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, inputLoginPassword)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, inputLoginCNPJ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 235, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(17, 17, 17))
        );
        dialogLoginLayout.setVerticalGroup(
            dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(dialogLoginLayout.createSequentialGroup()
                .add(panLoginHeader, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 31, Short.MAX_VALUE)
                .add(labLoginError)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labLoginCNPJ)
                    .add(inputLoginCNPJ, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(dialogLoginLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(labLoginPassword)
                    .add(inputLoginPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(buttonLoginSubmit)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocationByPlatform(true);
        setName("frameLogin");
        setResizable(false);

        panHeader.setBackground(new java.awt.Color(255, 255, 255));
        panHeader.setPreferredSize(new java.awt.Dimension(344, 74));

        labEmpresa.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        labEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labEmpresa.setText("Empresa");
        labEmpresa.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        labLogo.setBackground(new java.awt.Color(255, 255, 255));
        labLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboriempresa/assets/labori-logo.gif"))); // NOI18N

        org.jdesktop.layout.GroupLayout panHeaderLayout = new org.jdesktop.layout.GroupLayout(panHeader);
        panHeader.setLayout(panHeaderLayout);
        panHeaderLayout.setHorizontalGroup(
            panHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panHeaderLayout.createSequentialGroup()
                .add(labLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 178, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(labEmpresa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panHeaderLayout.setVerticalGroup(
            panHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, panHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .add(panHeaderLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(labLogo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 67, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(labEmpresa, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 57, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(panHeader, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(panHeader, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void login(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login
        company = companyBean.checkPass(inputLoginCNPJ.getText(), inputLoginPassword.getText());
        if (company == null)
            labLoginError.setVisible(true);
        else {
            dialogLogin.setVisible(false);
            this.setVisible(true);
        }

    }//GEN-LAST:event_login

    private void quitProgram(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_quitProgram
        System.exit(0);
    }//GEN-LAST:event_quitProgram

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainFrame();
            }
        });
    }
    private GetEJB getEJB;
    private Company company;
    private CompanyBeanLocal companyBean;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonLoginSubmit;
    private javax.swing.JDialog dialogLogin;
    private javax.swing.JFormattedTextField inputLoginCNPJ;
    private javax.swing.JPasswordField inputLoginPassword;
    private javax.swing.JLabel labEmpresa;
    private javax.swing.JLabel labLoginCNPJ;
    private javax.swing.JLabel labLoginEmpresa;
    private javax.swing.JLabel labLoginError;
    private javax.swing.JLabel labLoginLogo;
    private javax.swing.JLabel labLoginPassword;
    private javax.swing.JLabel labLogo;
    private javax.swing.JPanel panHeader;
    private javax.swing.JPanel panLoginHeader;
    // End of variables declaration//GEN-END:variables
}