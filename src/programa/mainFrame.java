package programa;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.DocumentException;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class mainFrame extends javax.swing.JFrame {
    
    private class DadosCabecalho{
    String Empresa = null;
    String Descricao = null;
    String Rua = null;
    String Numero = null;
    String Bairro = null;
    String Cidade = null;
    String CEP = null;
    String _Estado = null;
    String CNPJ = null;
    String Telefone = null;
    }
    
    static private int TabelIDDef = -1;
    static private int IDCount = 1;
    static private boolean PrimeiraVez = true;
    private DadosCabecalho cabecalho = new DadosCabecalho();
    
    public mainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        LProduto = new javax.swing.JLabel();
        Inserir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        Limpar = new javax.swing.JButton();
        IDDefClear = new javax.swing.JComboBox<>();
        Produto = new javax.swing.JTextField();
        LReferencia = new javax.swing.JLabel();
        Referencia = new javax.swing.JTextField();
        LCor = new javax.swing.JLabel();
        Cor = new javax.swing.JTextField();
        LQuantia = new javax.swing.JLabel();
        Quantia = new javax.swing.JTextField();
        LPreco = new javax.swing.JLabel();
        Preco = new javax.swing.JTextField();
        LDescricao = new javax.swing.JLabel();
        Descricao = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        LCliente = new javax.swing.JLabel();
        Cliente = new javax.swing.JTextField();
        LRua = new javax.swing.JLabel();
        Rua = new javax.swing.JTextField();
        ClienteDef = new javax.swing.JComboBox<>();
        LBairro = new javax.swing.JLabel();
        Bairro = new javax.swing.JTextField();
        LNumero = new javax.swing.JLabel();
        CEP = new javax.swing.JTextField();
        LEstado = new javax.swing.JLabel();
        Estado = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        LCidade = new javax.swing.JLabel();
        Cidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Telefone = new javax.swing.JTextField();
        LCNPJ_CPF = new javax.swing.JLabel();
        CNPJ_CPF = new javax.swing.JTextField();
        LEmail = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NovoRG = new javax.swing.JButton();
        Imprimir = new javax.swing.JButton();
        LTotal = new javax.swing.JLabel();
        Total = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        DefCabecalho = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LProduto.setText("Produto:");

        Inserir.setText("Inserir");
        Inserir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InserirMouseClicked(evt);
            }
        });
        Inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InserirActionPerformed(evt);
            }
        });

        tabela.setBorder(null);
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Referencia", "Cor", "Descrição", "Quantia", "Preço (un)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        tabela.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabelaPropertyChange(evt);
            }
        });
        tabela.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tabelaVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(tabela);
        if (tabela.getColumnModel().getColumnCount() > 0) {
            tabela.getColumnModel().getColumn(0).setMinWidth(50);
            tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
            tabela.getColumnModel().getColumn(0).setMaxWidth(50);
            tabela.getColumnModel().getColumn(1).setMinWidth(200);
            tabela.getColumnModel().getColumn(1).setPreferredWidth(200);
            tabela.getColumnModel().getColumn(1).setMaxWidth(200);
            tabela.getColumnModel().getColumn(2).setMinWidth(100);
            tabela.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(2).setMaxWidth(100);
            tabela.getColumnModel().getColumn(3).setMinWidth(80);
            tabela.getColumnModel().getColumn(3).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(3).setMaxWidth(80);
            tabela.getColumnModel().getColumn(4).setMinWidth(150);
            tabela.getColumnModel().getColumn(4).setPreferredWidth(150);
            tabela.getColumnModel().getColumn(5).setMinWidth(80);
            tabela.getColumnModel().getColumn(5).setPreferredWidth(80);
            tabela.getColumnModel().getColumn(5).setMaxWidth(80);
            tabela.getColumnModel().getColumn(6).setMinWidth(100);
            tabela.getColumnModel().getColumn(6).setPreferredWidth(100);
            tabela.getColumnModel().getColumn(6).setMaxWidth(100);
        }

        Limpar.setText("Limpar");
        Limpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimparMouseClicked(evt);
            }
        });

        IDDefClear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Ultimo"}));
        IDDefClear.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                IDDefClearItemStateChanged(evt);
            }
        });

        LReferencia.setText("Ref.:");

        LCor.setText("Cor:");

        Cor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorActionPerformed(evt);
            }
        });

        LQuantia.setText("Quantia:");

        LPreco.setText("Preço:");

        Preco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PrecoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                PrecoFocusLost(evt);
            }
        });
        Preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecoActionPerformed(evt);
            }
        });

        LDescricao.setText("Descrição:");

        Descricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescricaoActionPerformed(evt);
            }
        });

        LCliente.setText("Cliente:");

        LRua.setText("Endereço:");

        ClienteDef.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Novo"}));

        LBairro.setText("Bairro:");

        LNumero.setText("CEP:");

        CEP.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CEPComponentAdded(evt);
            }
        });
        CEP.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CEPCaretUpdate(evt);
            }
        });
        CEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CEPFocusLost(evt);
            }
        });
        CEP.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CEPInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                CEPCaretPositionChanged(evt);
            }
        });
        CEP.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CEPPropertyChange(evt);
            }
        });
        CEP.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                CEPVetoableChange(evt);
            }
        });

        LEstado.setText("Estado:");

        Estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"AC","AL","AP","AM","BA","CE","DF","ES","GO","MA","MT","MS","MG","PA","PB","PR","PE","PI","RJ","RN","RS","RO","RR","SC","SP","SE","TO"}));
        Estado.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                EstadoComponentHidden(evt);
            }
        });

        jLabel1.setText("Venda");

        LCidade.setText("Cidade:");

        jLabel2.setText("Telefone:");

        Telefone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TelefoneFocusLost(evt);
            }
        });
        Telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefoneActionPerformed(evt);
            }
        });

        LCNPJ_CPF.setText("CNPJ/CPF:");

        CNPJ_CPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                CNPJ_CPFFocusLost(evt);
            }
        });

        LEmail.setText("E-mail:");

        jLabel3.setText("Registro:");

        NovoRG.setText("Novo");

        Imprimir.setText("Salvar");
        Imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImprimirMouseClicked(evt);
            }
        });

        LTotal.setText("Total:");

        Total.setEditable(false);
        Total.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                TotalComponentHidden(evt);
            }
        });

        jButton1.setText("Cabeçalho");

        jMenu1.setText("Arquivos");

        jMenuItem1.setText("Sair");
        jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem1MouseClicked(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Editar");

        DefCabecalho.setText("Cabeçalho");
        DefCabecalho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DefCabecalhoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DefCabecalhoMouseClicked(evt);
            }
        });
        jMenu2.add(DefCabecalho);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(jSeparator3))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LCliente)
                            .addComponent(LRua)
                            .addComponent(LCidade))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Telefone))
                                    .addComponent(Rua, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LBairro)
                                    .addComponent(LCNPJ_CPF)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LNumero))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CNPJ_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LEmail)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LEstado)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Email)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ClienteDef, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NovoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LDescricao)
                            .addComponent(LProduto)
                            .addComponent(LReferencia))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LCor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Cor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LQuantia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantia, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LPreco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(IDDefClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Limpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Inserir))
                            .addComponent(Produto)
                            .addComponent(Descricao))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCliente)
                    .addComponent(ClienteDef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NovoRG)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LRua)
                    .addComponent(Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LEstado)
                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LBairro)
                    .addComponent(LNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LCidade)
                    .addComponent(Cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(Telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CNPJ_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LCNPJ_CPF)
                    .addComponent(LEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LProduto))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDescricao)
                    .addComponent(Descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Inserir)
                    .addComponent(Limpar)
                    .addComponent(Referencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LQuantia)
                    .addComponent(Quantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LPreco)
                    .addComponent(Preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDDefClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LReferencia)
                    .addComponent(LCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Imprimir)
                    .addComponent(LTotal)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1MouseClicked

    private void InserirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InserirMouseClicked
        DefaultTableModel ModTabela = (DefaultTableModel) tabela.getModel();
        float result;
        
        float FBuffer = Float.valueOf(Total.getText().substring(2, Total.getText().length()));
        result = Float.valueOf(Quantia.getText()) * Float.valueOf(Preco.getText().substring(2, Preco.getText().length()));
        FBuffer += result;
        Total.setText("R$"+Float.toString(FBuffer));
        
        ModTabela.addRow(new Object[]{IDCount,Produto.getText(),Referencia.getText(),Cor.getText(),Descricao.getText(),Quantia.getText(),Preco.getText()});
        IDDefClear.addItem(Integer.toString(IDCount));
        IDCount++;
        Produto.setText("");
        Referencia.setText("");
        Cor.setText("");
        Quantia.setText("1");
        Preco.setText("R$0.00");
        Descricao.setText("");
    }//GEN-LAST:event_InserirMouseClicked

    private void InserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InserirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InserirActionPerformed

    private void LimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimparMouseClicked
        DefaultTableModel ModTabela = (DefaultTableModel) tabela.getModel();
        if(ModTabela.getRowCount() == 0) return;
        
        float result;
        
        switch(TabelIDDef){
            case -1:
                while(ModTabela.getRowCount() != 0)
                {
                    ModTabela.removeRow(ModTabela.getRowCount()-1);
                    IDDefClear.removeItemAt(IDDefClear.getItemCount()-1);
                }
                Total.setText("R$0.00");
                IDCount = 1;
                return;
            case -2:
                result = Float.valueOf(ModTabela.getValueAt(ModTabela.getRowCount()-1, 5).toString()) * Float.valueOf(ModTabela.getValueAt(ModTabela.getRowCount()-1, 6).toString().substring(2, ModTabela.getValueAt(ModTabela.getRowCount()-1, 6).toString().length()));
                ModTabela.removeRow(ModTabela.getRowCount()-1);
                break;
            default:
                result = Float.valueOf(ModTabela.getValueAt(TabelIDDef-1, 5).toString()) * Float.valueOf(ModTabela.getValueAt(TabelIDDef-1, 6).toString().substring(2, ModTabela.getValueAt(TabelIDDef-1, 6).toString().length()));
                ModTabela.removeRow(TabelIDDef-1);
        }
        for(int i = 0; i < ModTabela.getRowCount(); i++)
        {
            ModTabela.setValueAt(Integer.toString(i+1), i, 0);
        }
        
        float FBuffer = Float.valueOf(Total.getText().substring(2, Total.getText().length()));
        FBuffer -= result;
        Total.setText("R$"+Float.toString(FBuffer));
        
        IDDefClear.removeItemAt(IDDefClear.getItemCount()-1);
        IDCount--;
        
    }//GEN-LAST:event_LimparMouseClicked

    private void IDDefClearItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_IDDefClearItemStateChanged
        String Buffer;
        if(null != (String)evt.getItem())
            switch ((String)evt.getItem()) {
            case "Todos":
                TabelIDDef = -1;
                break;
            case "Ultimo":
                TabelIDDef = -2;
                break;
            default:
                Buffer = (String) evt.getItem();
                TabelIDDef = Integer.parseInt(Buffer);
                break;
        }
    }//GEN-LAST:event_IDDefClearItemStateChanged

    private void CorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorActionPerformed
    private void PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecoActionPerformed
    private void DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescricaoActionPerformed
    }//GEN-LAST:event_DescricaoActionPerformed
    private void TelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefoneActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        System.out.println(tabela.getSelectedRow());
        IDDefClear.setSelectedIndex(2+tabela.getSelectedRow());
    }//GEN-LAST:event_tabelaMouseClicked

    private void tabelaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabelaPropertyChange

    }//GEN-LAST:event_tabelaPropertyChange
    private void tabelaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tabelaVetoableChange
    }//GEN-LAST:event_tabelaVetoableChange
    private void DefCabecalhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefCabecalhoMouseClicked
        
    }//GEN-LAST:event_DefCabecalhoMouseClicked

    private void DefCabecalhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DefCabecalhoMousePressed
        String Retorno[] = null;
        
        Cabecalho janela = new Cabecalho();
        
        janela.main = this;
        janela.setVisible(true);
    }//GEN-LAST:event_DefCabecalhoMousePressed

    public void SetCabecalho(String bairro, String cep, String cnpj, String cidade, String descricao, String empresa, String numero, String rua, String telefone, String estado)
    {
        cabecalho.Bairro = bairro;
        cabecalho.CEP = cep;
        cabecalho.CNPJ = cnpj;
        cabecalho.Cidade = cidade;
        cabecalho.Descricao = descricao;
        cabecalho.Empresa = empresa;
        cabecalho.Numero = numero;
        cabecalho.Rua = rua;
        cabecalho.Telefone = telefone;
        cabecalho._Estado = estado;
    }
    
    private void ImprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImprimirMouseClicked
        Document doc = new Document(PageSize.A4);
        Paragraph para;
        PdfPCell cell;
        Phrase phr;
        Font font10 = new Font(FontFamily.HELVETICA,10);
        Font font12 = new Font(FontFamily.HELVETICA,12);
        Font font14 = new Font(FontFamily.HELVETICA,14);
        Font font20Blod = new Font(FontFamily.HELVETICA,20,Font.BOLD);
        Font font10w = new Font(FontFamily.HELVETICA,10,Font.NORMAL, BaseColor.WHITE);
        Font font10b = new Font(FontFamily.HELVETICA,10,Font.NORMAL, BaseColor.BLACK);
        DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        DottedLineSeparator LinhaSep = new DottedLineSeparator();
        
        float tabelaSize[] = {1.5f,7,4,3,7,3,5};
        float TotalSize[] = {3f};
        boolean ParFlag = false;
        
        LinhaSep.setOffset(0);
        LinhaSep.setGap(1f);
        
        if(cabecalho.Bairro == null)
        {
            Cabecalho Buffer = new Cabecalho();
            Buffer.Carrega(this);
        }
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream("saida.pdf"));
            doc.open();
            
            PdfPTable tabel;
            
            tabel = new PdfPTable(2);
            cell = new PdfPCell();
            para = new Paragraph(cabecalho.Empresa,font20Blod);
            para.setAlignment(Element.ALIGN_CENTER);
            cell.addElement(para);
            para = new Paragraph(cabecalho.Descricao,font14);
            para.setAlignment(Element.ALIGN_CENTER);
            cell.addElement(para);
            para = new Paragraph(cabecalho.CNPJ,font12);
            para.setAlignment(Element.ALIGN_CENTER);
            cell.addElement(para);
            para = new Paragraph(cabecalho.Telefone,font12);
            para.setAlignment(Element.ALIGN_CENTER);
            cell.addElement(para);
            cell.addElement(new Paragraph(" "));
            tabel.addCell(cell);
            tabel.completeRow();
            doc.add(tabel);
            doc.add(new Paragraph(" "));
            
            para = new Paragraph(cabecalho.Rua.toUpperCase()+"-"+cabecalho.Numero.toUpperCase()+" - "+cabecalho.Bairro.toUpperCase()+" - "+"CEP "+cabecalho.CEP.toUpperCase()+" - "+cabecalho.Cidade.toUpperCase()+ " - "+cabecalho._Estado.toUpperCase(),font10);
            para.setAlignment(Element.ALIGN_CENTER);
            doc.add(para);
            doc.add(new Paragraph(" "));
            
            doc.add(LinhaSep);
            
            para = new Paragraph("CLIENTE",font14);
            para.setAlignment(Element.ALIGN_CENTER);
            doc.add(para);
            doc.add(new Paragraph(" "));
            
            tabel = new PdfPTable(1);
            cell = new PdfPCell(new Phrase("Nome:  "+Cliente.getText().toUpperCase()));
            cell.setBorder(Rectangle.NO_BORDER);
            tabel.addCell(cell);
            doc.add(tabel);
            
            tabel = new PdfPTable(2);
            cell = new PdfPCell(new Phrase("CNPJ/CPF:  "+CNPJ_CPF.getText().toUpperCase()));
            cell.setBorder(Rectangle.NO_BORDER);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Contato:  "+Telefone.getText().toUpperCase()));
            cell.setBorder(Rectangle.NO_BORDER);
            tabel.addCell(cell);
            doc.add(tabel);
            
            tabel = new PdfPTable(2);
            cell = new PdfPCell(new Phrase("E-mail:  "+Email.getText()));
            cell.setBorder(Rectangle.NO_BORDER);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Data:  "+formatoData.format(data)));
            cell.setBorder(Rectangle.NO_BORDER);
            tabel.addCell(cell);
            doc.add(tabel);
            
            tabel = new PdfPTable(1);
            cell = new PdfPCell(new Phrase(Rua.getText().toUpperCase()+" - "+Bairro.getText().toUpperCase()+" - CEP "+CEP.getText().toUpperCase()+" - "+Cidade.getText().toUpperCase()+" - "+Estado.getSelectedItem(),font10));
            cell.setBorder(Rectangle.NO_BORDER);
            cell.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tabel.addCell(cell);
            doc.add(tabel);
            
            doc.add(new Paragraph(" "));
            doc.add(LinhaSep);
            
            para = new Paragraph("ITENS",font14);
            para.setAlignment(Element.ALIGN_CENTER);
            doc.add(para);
            doc.add(new Paragraph(" "));
            
            tabel = new PdfPTable(tabelaSize);
            cell = new PdfPCell(new Phrase("ID",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Produto",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Referencia",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Cor",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Descrição",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Quantia",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            cell = new PdfPCell(new Phrase("Preço",font10w));
            cell.setBackgroundColor(BaseColor.DARK_GRAY);
            tabel.addCell(cell);
            doc.add(tabel);
            
            for(int i = 0; i < tabela.getRowCount(); i++)
            {
                tabel = new PdfPTable(tabelaSize);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 0).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 1).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 2).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 3).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 4).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 5).toString(),font10b));
                tabel.addCell(cell);
                cell = new PdfPCell(new Phrase(tabela.getValueAt(i, 6).toString(),font10b));
                tabel.addCell(cell);
                doc.add(tabel);

            }
            
            tabel = new PdfPTable(TotalSize);
            cell = new PdfPCell(new Phrase("Total: "+Total.getText()));
            tabel.addCell(cell);
            doc.add(tabel);
            
            doc.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ImprimirMouseClicked

    private void EstadoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_EstadoComponentHidden
    }//GEN-LAST:event_EstadoComponentHidden
    private void CEPInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CEPInputMethodTextChanged
    }//GEN-LAST:event_CEPInputMethodTextChanged
    private void CEPCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CEPCaretUpdate
    }//GEN-LAST:event_CEPCaretUpdate
    private void CEPComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CEPComponentAdded
    }//GEN-LAST:event_CEPComponentAdded
    private void CEPVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_CEPVetoableChange
    }//GEN-LAST:event_CEPVetoableChange
    private void CEPPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CEPPropertyChange
    }//GEN-LAST:event_CEPPropertyChange
    private void CEPCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CEPCaretPositionChanged
    }//GEN-LAST:event_CEPCaretPositionChanged

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

    private void CNPJ_CPFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CNPJ_CPFFocusLost
        String buffer = CNPJ_CPF.getText();
        String saida = "";
        
        if(buffer.length() == 11)
        {
            for(int i = 0; i < 11; i++)
            {
                if(i == 3 || i == 6) saida += ".";
                if(i == 9) saida += "-";
                saida += buffer.charAt(i);
            }
            CNPJ_CPF.setText(saida);
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
            CNPJ_CPF.setText(saida);
            return;
        }
        return;        
    }//GEN-LAST:event_CNPJ_CPFFocusLost

    private void PrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecoFocusLost
        String buffer = Preco.getText();
        String saida = "";
        boolean flag = false;
        
        if(buffer.length() == 0)
        {
            Preco.setText("R$0.00");
            return;
        }        
        if(buffer.charAt(0) != 'R') saida += "R$";
        
        saida += buffer;
        
        for(int i = 0; i < buffer.length(); i++)
        {
            if(buffer.charAt(i) == ',' || buffer.charAt(i) == '.')
            {
                if(buffer.charAt(i) == ',') buffer.replace(',', '.');
                if(i + 2 == buffer.length())
                    saida += "0";
                flag = true;
            }
        }
        
        if(!flag) saida += ".00";
        
        Preco.setText(saida);
    }//GEN-LAST:event_PrecoFocusLost

    private void TotalComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TotalComponentHidden

    }//GEN-LAST:event_TotalComponentHidden

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        if(!PrimeiraVez) return;        
        PrimeiraVez = false;
        Total.setText("R$0.00");
        Estado.setSelectedIndex(20);
        Preco.setText("R$0.00");
        Quantia.setText("1");
    }//GEN-LAST:event_formWindowActivated

    private void PrecoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PrecoFocusGained
        if("R$0.00".equals(Preco.getText())) Preco.setText("");
    }//GEN-LAST:event_PrecoFocusGained
    
    public static void main(String args[]) {       
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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        String os = System.getProperty("os.name").toLowerCase();
        System.out.println(os);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(mainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Bairro;
    private javax.swing.JTextField CEP;
    private javax.swing.JTextField CNPJ_CPF;
    private javax.swing.JTextField Cidade;
    private javax.swing.JTextField Cliente;
    private javax.swing.JComboBox<String> ClienteDef;
    private javax.swing.JTextField Cor;
    private javax.swing.JMenuItem DefCabecalho;
    private javax.swing.JTextField Descricao;
    private javax.swing.JTextField Email;
    private javax.swing.JComboBox<String> Estado;
    private javax.swing.JComboBox<String> IDDefClear;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Inserir;
    private javax.swing.JLabel LBairro;
    private javax.swing.JLabel LCNPJ_CPF;
    private javax.swing.JLabel LCidade;
    private javax.swing.JLabel LCliente;
    private javax.swing.JLabel LCor;
    private javax.swing.JLabel LDescricao;
    private javax.swing.JLabel LEmail;
    private javax.swing.JLabel LEstado;
    private javax.swing.JLabel LNumero;
    private javax.swing.JLabel LPreco;
    private javax.swing.JLabel LProduto;
    private javax.swing.JLabel LQuantia;
    private javax.swing.JLabel LReferencia;
    private javax.swing.JLabel LRua;
    private javax.swing.JLabel LTotal;
    private javax.swing.JButton Limpar;
    private javax.swing.JButton NovoRG;
    private javax.swing.JTextField Preco;
    private javax.swing.JTextField Produto;
    private javax.swing.JTextField Quantia;
    private javax.swing.JTextField Referencia;
    private javax.swing.JTextField Rua;
    private javax.swing.JTextField Telefone;
    private javax.swing.JTextField Total;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabela;
    // End of variables declaration//GEN-END:variables
}
