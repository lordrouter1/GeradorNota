package programa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cabecalho extends javax.swing.JFrame {
    
    public mainFrame main;
    
    public Cabecalho() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LEmpresa = new javax.swing.JLabel();
        Empresa = new javax.swing.JTextField();
        LDescricao = new javax.swing.JLabel();
        Descricao = new javax.swing.JTextField();
        LRua = new javax.swing.JLabel();
        Rua = new javax.swing.JTextField();
        LNumero = new javax.swing.JLabel();
        Numero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        LCEP = new javax.swing.JLabel();
        CEP = new javax.swing.JTextField();
        LEstado = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox<>();
        LCidade = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        LCNPJ = new javax.swing.JLabel();
        CNPJ = new javax.swing.JTextField();
        LTelefone = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        LLogo = new javax.swing.JLabel();
        Logo = new javax.swing.JPanel();
        Selecionar = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LEmpresa.setText("Empresa:");

        LDescricao.setText("Descrição:");

        LRua.setText("Rua:");

        LNumero.setText("Numero:");

        jLabel2.setText("Bairro:");

        LCEP.setText("CEP:");

        CEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CEPFocusLost(evt);
            }
        });

        LEstado.setText("Estado:");

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"}));
        Estado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EstadoItemStateChanged(evt);
            }
        });

        LCidade.setText("Cidade:");

        LCNPJ.setText("CNPJ:");

        CNPJ.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CNPJFocusLost(evt);
            }
        });

        LTelefone.setText("Fone:");

        Telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefoneFocusLost(evt);
            }
        });

        LLogo.setText("Logo:");

        Logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Logo.setMaximumSize(new java.awt.Dimension(2, 194));

        javax.swing.GroupLayout LogoLayout = new javax.swing.GroupLayout(Logo);
        Logo.setLayout(LogoLayout);
        LogoLayout.setHorizontalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        LogoLayout.setVerticalGroup(
            LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );

        Selecionar.setText("Selecionar");
        Selecionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SelecionarMouseClicked(evt);
            }
        });

        Salvar.setText("Salvar");
        Salvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarMouseClicked(evt);
            }
        });

        jButton2.setText("Limpar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LEmpresa)
                    .addComponent(LDescricao)
                    .addComponent(LRua)
                    .addComponent(LNumero)
                    .addComponent(jLabel2)
                    .addComponent(LCEP)
                    .addComponent(LCidade)
                    .addComponent(LEstado)
                    .addComponent(LCNPJ)
                    .addComponent(LTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Telefone)
                    .addComponent(CEP)
                    .addComponent(Empresa)
                    .addComponent(Descricao)
                    .addComponent(Rua)
                    .addComponent(Numero)
                    .addComponent(Bairro)
                    .addComponent(Cidade)
                    .addComponent(CNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LLogo)
                            .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Selecionar, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Salvar)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LEmpresa)
                    .addComponent(Empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LLogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LDescricao)
                            .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LRua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LNumero)
                            .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCidade)
                            .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LCEP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LEstado)
                            .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LCNPJ)
                            .addComponent(CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LTelefone)
                            .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Selecionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2)
                            .addComponent(Salvar))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarMouseClicked
        String OS = System.getProperty("os.name").toLowerCase();
        String _os;
        
        if("linux".equals(OS)) _os = "/";
        else _os = "\\";
        
        try {
            FileWriter arq = new FileWriter("Data"+_os+"cabecalho.data");
            PrintWriter Saida = new PrintWriter(arq);
            Saida.println(Empresa.getText());
            Saida.println(Descricao.getText());
            Saida.println(Rua.getText());
            Saida.println(Numero.getText());
            Saida.println(Bairro.getText());
            Saida.println(Cidade.getText());
            Saida.println(CEP.getText());
            Saida.println(_Estado);
            Saida.println(CNPJ.getText());
            Saida.println(Telefone.getText());
            
            arq.close();
            Saida.close();
        } catch (IOException ex) {
            Logger.getLogger(Cabecalho.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        main.SetCabecalho(Bairro.getText(),CEP.getText(),CNPJ.getText(),Cidade.getText(),Descricao.getText(),Empresa.getText(),Numero.getText(),Rua.getText(),Telefone.getText(),_Estado);
        
        this.dispose();
    }//GEN-LAST:event_SalvarMouseClicked

    private void EstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EstadoItemStateChanged
        _Estado = (String) evt.getItem();
    }//GEN-LAST:event_EstadoItemStateChanged
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked
    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Carrega();
    }//GEN-LAST:event_formWindowActivated

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Empresa.setText("");
        Descricao.setText("");
        Rua.setText("");
        Numero.setText("");
        Bairro.setText("");
        Cidade.setText("");
        CEP.setText("");
        Estado.setSelectedIndex(0);
        CNPJ.setText("");
        Telefone.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void SelecionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SelecionarMouseClicked
    
    }//GEN-LAST:event_SelecionarMouseClicked

    private void CEPFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CEPFocusLost
        String buffer = CEP.getText();
        String saida = "";
        
        if(buffer.length() != 8) return;
        
        for(int i = 0; i < buffer.length(); i++)
        {
            if(i == buffer.length()-3) saida += "-";
            saida += buffer.charAt(i);
        }
        CEP.setText(saida);
    }//GEN-LAST:event_CEPFocusLost

    private void TelefoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TelefoneFocusLost
        String buffer = Telefone.getText();
        String saida = "";
        
        if(buffer.length() < 10 || buffer.length() > 12) return;
        
        saida += "(";
        for(int i = 0; i < buffer.length(); i++)
        {
            if(i == 2) saida += ")";
            if(i == buffer.length()-4) saida += "-";
            saida += buffer.charAt(i);
        }
        Telefone.setText(saida);
    }//GEN-LAST:event_TelefoneFocusLost

    private void CNPJFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CNPJFocusLost
        String buffer = CNPJ.getText();
        String saida = "";
        
        if(buffer.length() == 11)
        {
            for(int i = 0; i < 11; i++)
            {
                if(i == 3 || i == 6) saida += ".";
                if(i == 9) saida += "-";
                saida += buffer.charAt(i);
            }
            CNPJ.setText(saida);
            return;
        }
        if(buffer.length() == 14 && buffer.charAt(3) != '.')
        {
            for(int i = 0; i < 14; i++)
            {
                if(i == 2 || i == 5) saida += ".";
                if(i == 8) saida += "/";
                if(i == 12) saida += "-";
                saida += buffer.charAt(i);
            }
            CNPJ.setText(saida);
            return;
        }
        return;   
    }//GEN-LAST:event_CNPJFocusLost

    private void Carrega(){
        String OS = System.getProperty("os.name").toLowerCase();
        String _os;
        String Buffer;
        
        if("linux".equals(OS)) _os = "/";
        else _os = "\\";
        
        try {
            FileReader arq = new FileReader("Data"+_os+"cabecalho.data");
            BufferedReader Entrada = new BufferedReader(arq);
            
            Buffer = Entrada.readLine();
            if(Buffer == null) return;
            Empresa.setText(Buffer);
            Descricao.setText(Entrada.readLine());
            Rua.setText(Entrada.readLine());
            Numero.setText(Entrada.readLine());
            Bairro.setText(Entrada.readLine());
            Cidade.setText(Entrada.readLine());
            CEP.setText(Entrada.readLine());
            _Estado = Entrada.readLine();
            CNPJ.setText(Entrada.readLine());
            Telefone.setText(Entrada.readLine());
            
            
            for(int i = 0; i < Estado.getItemCount(); i++){
                if(_Estado.equals(Estado.getItemAt(i))){
                    Estado.setSelectedIndex(i);
                    break;
                }
            }
            
            arq.close();
            Entrada.close();
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cabecalho.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO!");
        } catch (IOException ex) {
            Logger.getLogger(Cabecalho.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO!");
        }
        
    }
    
    public void Carrega(mainFrame _main){
        main = _main;
        String OS = System.getProperty("os.name").toLowerCase();
        String _os;
        String Buffer;
        
        if("linux".equals(OS)) _os = "/";
        else _os = "\\";
        
        try {
            FileReader arq = new FileReader("Data"+_os+"cabecalho.data");
            BufferedReader Entrada = new BufferedReader(arq);
            
            Buffer = Entrada.readLine();
            if(Buffer == null) return;
            Empresa.setText(Buffer);
            Descricao.setText(Entrada.readLine());
            Rua.setText(Entrada.readLine());
            Numero.setText(Entrada.readLine());
            Bairro.setText(Entrada.readLine());
            Cidade.setText(Entrada.readLine());
            CEP.setText(Entrada.readLine());
            _Estado = Entrada.readLine();
            CNPJ.setText(Entrada.readLine());
            Telefone.setText(Entrada.readLine());
            
            
            for(int i = 0; i < Estado.getItemCount(); i++){
                if(_Estado.equals(Estado.getItemAt(i))){
                    Estado.setSelectedIndex(i);
                    break;
                }
            }
            
            arq.close();
            Entrada.close();
            
            main.SetCabecalho(Bairro.getText(),CEP.getText(),CNPJ.getText(),Cidade.getText(),Descricao.getText(),Empresa.getText(),Numero.getText(),Rua.getText(),Telefone.getText(),_Estado);
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cabecalho.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO!");
        } catch (IOException ex) {
            Logger.getLogger(Cabecalho.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERRO!");
        }
        this.dispose();
    }
    
    public static void main(String args[]) {
        String Retorno = "teste";
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cabecalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cabecalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cabecalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cabecalho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cabecalho().setVisible(true);
            }
        });
        
        
        return;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField Bairro;
    private static javax.swing.JTextField CEP;
    private static javax.swing.JTextField CNPJ;
    private static javax.swing.JTextField Cidade;
    private static javax.swing.JTextField Descricao;
    private static javax.swing.JTextField Empresa;
    private static javax.swing.JComboBox<String> Estado;
    private javax.swing.JLabel LCEP;
    private javax.swing.JLabel LCNPJ;
    private javax.swing.JLabel LCidade;
    private javax.swing.JLabel LDescricao;
    private javax.swing.JLabel LEmpresa;
    private javax.swing.JLabel LEstado;
    private javax.swing.JLabel LLogo;
    private javax.swing.JLabel LNumero;
    private javax.swing.JLabel LRua;
    private javax.swing.JLabel LTelefone;
    private javax.swing.JPanel Logo;
    private static javax.swing.JTextField Numero;
    private static javax.swing.JTextField Rua;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton Selecionar;
    private static javax.swing.JTextField Telefone;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    private static String _Estado; 
}
