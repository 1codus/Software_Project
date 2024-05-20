/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package reserve.login;

import reserve.file.JoinBusiness;
import reserve.data.BusinessData;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author regin
 */
public class CreateBusiness extends javax.swing.JFrame {
    ArrayList<BusinessData> businessInfo = new ArrayList<>();
    /**
     * Creates new form CreateID
     */
    public int count = -1;
    private static int line = 1;
    
    public CreateBusiness() {
        
        initComponents();
        
        setTitle("회원가입");
        setSize(700, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        J_ID.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        
        });
        
        J_PW.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        
        });
        
        J_PWC.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
               
            }
       
        });
        
        J_No.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                checkPasswordMatch();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        
        });
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        buttonGroup1 = new javax.swing.ButtonGroup();
        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        J_ID = new javax.swing.JTextField();
        J_PW = new javax.swing.JTextField();
        J_PWC = new javax.swing.JTextField();
        J_Name = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        J_No = new javax.swing.JTextField();
        Back_Login = new javax.swing.JButton();
        J_User = new javax.swing.JButton();
        J_Test = new javax.swing.JLabel();
        J_PStrong = new javax.swing.JLabel();
        J_NStrong = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        J_NoTest = new javax.swing.JLabel();
        J_Check = new javax.swing.JButton();
        J_TM = new javax.swing.JTextField();
        J_Bno = new javax.swing.JTextField();
        J_BnoTest = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("대표자명");

        jLabel2.setText("아이디");

        jLabel3.setText("비밀번호");

        jLabel4.setText("비밀번호 재확인");

        jLabel6.setText("상호명");

        jLabel7.setText("사업자번호");

        jLabel8.setText("전화번호");

        jLabel9.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N
        jLabel9.setText("ID");

        jLabel10.setFont(new java.awt.Font("맑은 고딕", 0, 9)); // NOI18N
        jLabel10.setText("Password");

        jLabel11.setFont(new java.awt.Font("맑은 고딕", 0, 9)); // NOI18N
        jLabel11.setText("Password Check");

        jLabel12.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("맑은 고딕", 0, 10)); // NOI18N
        jLabel13.setText("TradeMark");

        jLabel14.setFont(new java.awt.Font("맑은 고딕", 0, 9)); // NOI18N
        jLabel14.setText("Business No");

        J_ID.setText("* 영문, 숫자 포함 8~23자");
        J_ID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                J_IDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                J_IDFocusLost(evt);
            }
        });
        J_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_IDActionPerformed(evt);
            }
        });
        J_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_IDKeyReleased(evt);
            }
        });

        J_PW.setText("* 영문, 숫자, 특수문자 포함 8~15자");
        J_PW.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                J_PWCaretUpdate(evt);
            }
        });
        J_PW.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                J_PWFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                J_PWFocusLost(evt);
            }
        });
        J_PW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_PWActionPerformed(evt);
            }
        });
        J_PW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_PWKeyReleased(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("맑은 고딕", 0, 9)); // NOI18N
        jLabel18.setText("Mobile No");

        J_No.setText("* -빼고 입력해주세요.");
        J_No.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                J_NoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                J_NoFocusLost(evt);
            }
        });
        J_No.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_NoActionPerformed(evt);
            }
        });
        J_No.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_NoKeyReleased(evt);
            }
        });

        Back_Login.setText("이전");
        Back_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_LoginActionPerformed(evt);
            }
        });

        J_User.setText("회원가입");
        J_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_UserActionPerformed(evt);
            }
        });

        J_Test.setFont(new java.awt.Font("고도 M", 1, 12)); // NOI18N
        J_Test.setText("    ");
        J_Test.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                J_TestKeyTyped(evt);
            }
        });

        J_PStrong.setFont(new java.awt.Font("고도 M", 1, 12)); // NOI18N

        J_NStrong.setFont(new java.awt.Font("고도 M", 1, 12)); // NOI18N

        jTextField1.setText("jTextField1");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        J_NoTest.setFont(new java.awt.Font("고도 M", 1, 12)); // NOI18N

        J_Check.setText("중복 확인");
        J_Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J_CheckActionPerformed(evt);
            }
        });

        J_Bno.setText("* -빼고 입력해주세요.");
        J_Bno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                J_BnoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                J_BnoFocusLost(evt);
            }
        });
        J_Bno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                J_BnoKeyReleased(evt);
            }
        });

        J_BnoTest.setFont(new java.awt.Font("고도 M", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel11))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(J_NoTest, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(118, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(J_User, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Back_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(J_PW, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                                    .addComponent(J_PWC)
                                    .addComponent(J_Test, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J_NStrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J_PStrong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(J_ID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(J_Check)))
                        .addGap(18, 18, 18))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(99, 99, 99))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel14)
                                .addComponent(jLabel1)
                                .addComponent(jLabel12)
                                .addComponent(jLabel6)
                                .addComponent(jLabel13)
                                .addComponent(jLabel18)
                                .addComponent(jLabel8)))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(J_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(J_TM, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(J_Bno)
                                .addComponent(J_BnoTest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(J_No, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(J_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(J_Check, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(J_NStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10))
                            .addComponent(J_PW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_PStrong, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(J_PWC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_Test)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel12))
                            .addComponent(J_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(J_TM, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(J_Bno, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addComponent(J_BnoTest, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addComponent(J_No, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(J_NoTest, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(J_User, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Back_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void J_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_IDActionPerformed

    private void J_NoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_NoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_NoActionPerformed

    private void J_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_UserActionPerformed
        // TODO add your handling code here:
        JoinBusiness businessData = new JoinBusiness();
        businessData.fRead();
        
        try {
            businessData.sPlite();
            businessInfo = businessData.returnBusinessInfo();
        } 
        catch (IOException ex) {
            //Logger.getLogger(CreateNewId.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        
        String ID = J_ID.getText();
        String PW = J_PW.getText();
        String PWC = J_PWC.getText();
        String Name = J_Name.getText();
        String Number = J_No.getText();
        String Bno = J_Bno.getText();
        String TM = J_TM.getText();
        String Type = "B";
        String input = ID + "|" + PW + "|" + Name + "|" + TM + "|" + Bno + "|" + Number + "|" + Type + "|" + "\r\n";
        
        try {
            if(!"".equals(ID) && !"".equals(PW) && !"".equals(Name) && !"".equals(Bno) && !"".equals(Number)) {
                if (isPasswordStrong(PW) && isNoStrong(Number) && PW.equals(PWC) && isBnoStrong(Bno)){
                    if (count == 0) {
                        businessData.fWrite(input);
                        JOptionPane.showMessageDialog(null, "사업자 회원가입이 완료되었습니다.");
                        J_ID.setText("");
                        J_PW.setText("");
                        J_Name.setText("");
                        J_TM.setText("");
                        J_Bno.setText("");
                        J_No.setText("");
                        line ++;
                        Login back = new Login();
                        back.setVisible(true);
                        dispose();
                    }

                    if (count == 1 || count == -1){
                        JOptionPane.showMessageDialog(null, "ID 중복 여부를 확인해주세요.");
                    } 
                }   
                else{
                    JOptionPane.showMessageDialog(null, "틀린 것이 없는지 확인해주세요.");
                }
            }
            
            else if(!"".equals(ID) || !"".equals(PW) || !"".equals(Name) || !"".equals(Bno) || !"".equals(Number)
                    || !"* 아이디를 입력해주세요. (영문, 숫자 포함 8~23자)".equals(ID) 
                    || "* 비밀번호를 입력해주세요. (영문, 숫자, 특수문자 포함 8~15자)".equals(PW)){
                    JOptionPane.showMessageDialog(null, "빈칸이 없는지 확인해주세요");
            }
        } 
        catch (IOException ex) {
           // Logger.getLogger(CreateNewId.class.getName()).log(Level.SEVERE, null, ex);
           ex.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_J_UserActionPerformed

    private void J_IDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_IDFocusGained
        // TODO add your handling code here:
        if (J_ID.getText().equals("* 아이디를 입력해주세요. (영문, 숫자 포함 8~23자)") || J_ID.getText().equals("* 영문, 숫자 포함 8~23자")) {
                J_ID.setText("");
        }
        count = -1;
        J_NStrong.setText("중복 확인 버튼을 눌러주세요.");
        J_NStrong.setForeground(Color.GRAY);
    }//GEN-LAST:event_J_IDFocusGained

    private void J_IDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_IDFocusLost
        // TODO add your handling code here:
        if (J_ID.getText().isEmpty()) {
                J_ID.setText("* 아이디를 입력해주세요. (영문, 숫자 포함 8~23자)");
        }
    }//GEN-LAST:event_J_IDFocusLost

    private void J_PWFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_PWFocusGained
        // TODO add your handling code here:
        if (J_PW.getText().equals("* 비밀번호를 입력해주세요. (영문, 숫자, 특수문자 포함 8~15자)") || J_PW.getText().equals("* 영문, 숫자, 특수문자 포함 8~15자")) {
                J_PW.setText("");
        }
        
    }//GEN-LAST:event_J_PWFocusGained

    private void J_PWFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_PWFocusLost
        // TODO add your handling code here:
        if (J_PW.getText().isEmpty()) {
                J_PW.setText("* 비밀번호를 입력해주세요. (영문, 숫자, 특수문자 포함 8~15자)");
        }
    }//GEN-LAST:event_J_PWFocusLost

    private void J_NoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_NoFocusGained
        // TODO add your handling code here:
        if (J_No.getText().equals("* -빼고 입력해주세요.")) {
                J_No.setText("");
        }
    }//GEN-LAST:event_J_NoFocusGained

    private void J_NoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_NoFocusLost
        // TODO add your handling code here:
        if (J_No.getText().isEmpty()) {
                J_No.setText("* -빼고 입력해주세요.");
        }
    }//GEN-LAST:event_J_NoFocusLost

    private void Back_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_LoginActionPerformed
        // TODO add your handling code here:
        SelectType click = new SelectType();
        click.setVisible(true);
        dispose(); // 현재 프레임 종료 +
    }//GEN-LAST:event_Back_LoginActionPerformed

    private void J_TestKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_TestKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_J_TestKeyTyped

    private void J_PWCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_J_PWCaretUpdate
        // TODO add your handling code here;
        
    }//GEN-LAST:event_J_PWCaretUpdate

    private void J_PWKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_PWKeyReleased
        // TODO add your handling code here:
        String password = J_PW.getText();
        if (password.equals("* 비밀번호를 입력해주세요. (영문, 숫자, 특수문자 포함 8~15자)") || password.isEmpty()){
            J_PStrong.setText(" ");
            J_PStrong.setForeground(new Color(255, 255, 255, 128));
        }
        else{
            if(isPasswordStrong(password)){
                J_PStrong.setText("사용 가능한 비밀번호입니다.");
                J_PStrong.setForeground(Color.BLUE);
        }
            else{
                J_PStrong.setText("사용 불가능한 비밀번호입니다.");
                J_PStrong.setForeground(Color.RED);
            }
        }  
    }//GEN-LAST:event_J_PWKeyReleased

    private void J_IDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_IDKeyReleased
        // TODO add your handling code here:
        String id = J_ID.getText();

        if (id.equals("* 아이디를 입력해주세요. (영문, 숫자 포함 8~23자)") || id.isEmpty()){
            J_NStrong.setText(" ");
            J_NStrong.setForeground(new Color(255, 255, 255, 128));
        }
        else{
            if(isIdStrong(id)){
                J_NStrong.setText("중복 확인 버튼을 눌러주세요.");
                J_NStrong.setForeground(Color.GRAY);
            }
            else{
                J_NStrong.setText("사용 불가능한 아이디입니다.");
                J_NStrong.setForeground(Color.RED);
            }
        }
        
    }//GEN-LAST:event_J_IDKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void J_NoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_NoKeyReleased
        // TODO add your handling code here:
        String no = J_No.getText();
        if (no.equals("* -빼고 입력해주세요.") || no.isEmpty()){
            J_NoTest.setText(" ");
            J_NoTest.setForeground(new Color(255, 255, 255, 128));
        }
        
        else{
            if(isNoStrong(no)){
                J_NoTest.setText(" ");
                J_NoTest.setForeground(new Color(255, 255, 255, 128));
        }
            else{
                J_NoTest.setText("형식이 올바르지 않습니다.");
                J_NoTest.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_J_NoKeyReleased

    private void J_CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_CheckActionPerformed
        // TODO add your handling code here:
        
        JoinBusiness businessData = new JoinBusiness();
        businessData.fRead();
        
        try {
            businessData.sPlite();
            businessInfo = businessData.returnBusinessInfo();
        } 
        catch (IOException ex) {
            //Logger.getLogger(CreateNewId.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        
        String ID = J_ID.getText();
        if(businessInfo.isEmpty() && isIdStrong(ID)){
            J_NStrong.setText("사용 가능한 아이디입니다.");
            J_NStrong.setForeground(Color.BLUE);
            count = 0;
        }
        
        else{
            for (int j = 0; j <= businessInfo.size(); j++) {
                if(isIdStrong(ID)){
                    if (businessInfo.get(j).getID().equals(ID)) {
                        J_ID.setText("");
                        J_NStrong.setText("이미 존재하는 아이디입니다.");
                        J_NStrong.setForeground(Color.RED);
                        count = 1;
                        break;
                    }

                    else{
                        J_NStrong.setText("사용 가능한 아이디입니다.");
                        J_NStrong.setForeground(Color.BLUE);
                        count = 0;
                    }
                }
                
                else{
                    J_NStrong.setText("ID 형식을 확인해주세요.");
                    J_NStrong.setForeground(Color.RED);
                    J_ID.setText("* 아이디를 입력해주세요. (영문, 숫자 포함 8~23자)");
                    count = 1;
                    break;
                }
            }
        }
    }//GEN-LAST:event_J_CheckActionPerformed

    private void J_PWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J_PWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_J_PWActionPerformed

    private void J_BnoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_BnoFocusGained
        // TODO add your handling code here:
       if (J_Bno.getText().equals("* -빼고 입력해주세요.")) {
                J_Bno.setText("");
        }
    }//GEN-LAST:event_J_BnoFocusGained

    private void J_BnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_J_BnoFocusLost
        // TODO add your handling code here:
        if (J_Bno.getText().isEmpty()) {
                J_Bno.setText("* -빼고 입력해주세요.");
        }
    }//GEN-LAST:event_J_BnoFocusLost

    private void J_BnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_J_BnoKeyReleased
        // TODO add your handling code here:\
         String Bno = J_Bno.getText();
        if (Bno.equals("* -빼고 입력해주세요.") || Bno.isEmpty()){
            J_BnoTest.setText(" ");
            J_BnoTest.setForeground(new Color(255, 255, 255, 128));
        }
        
        else{
            if(isBnoStrong(Bno)){
                J_BnoTest.setText(" ");
                J_BnoTest.setForeground(new Color(255, 255, 255, 128));
        }
            else{
                J_BnoTest.setText("형식이 올바르지 않습니다.");
                J_BnoTest.setForeground(Color.RED);
            }
        }
    }//GEN-LAST:event_J_BnoKeyReleased
    
    private boolean isNoStrong(String id){
        String regex = "^\\d{11}$";
        return id.matches(regex);
    }
    
    private boolean isPasswordStrong(String password){
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9])(?=.*[!@#$%^&*()-+=_.]).{8,15}$";
        return password.matches(regex);
    }
    
    private boolean isIdStrong(String id){
        String regex = "^(?=.*[a-zA-Z])(?=.*[0-9]).{8,23}$";
        return id.matches(regex);
    }
    
    private boolean isBnoStrong(String Bno){
        String regex = "^\\d{10}$";
        return Bno.matches(regex);
    }
    
    private void checkPasswordMatch() {
        String password = J_PW.getText();
        String confirmPassword = J_PWC.getText();
        
        if(confirmPassword.isEmpty()){
            J_Test.setText(" ");
            J_Test.setForeground(new Color(255, 255, 255, 128));
        } else{
            if(password.equals(confirmPassword)){
                J_Test.setText("비밀번호가 일치합니다.");
                J_Test.setForeground(Color.BLUE);
            }
            else{
                J_Test.setText("비밀번호가 일치하지 않습니다.");
                J_Test.setForeground(Color.RED);
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(CreateBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBusiness.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBusiness().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Login;
    private javax.swing.JTextField J_Bno;
    private javax.swing.JLabel J_BnoTest;
    private javax.swing.JButton J_Check;
    private javax.swing.JTextField J_ID;
    private javax.swing.JLabel J_NStrong;
    private javax.swing.JTextField J_Name;
    private javax.swing.JTextField J_No;
    private javax.swing.JLabel J_NoTest;
    private javax.swing.JLabel J_PStrong;
    private javax.swing.JTextField J_PW;
    private javax.swing.JTextField J_PWC;
    private javax.swing.JTextField J_TM;
    private javax.swing.JLabel J_Test;
    private javax.swing.JButton J_User;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
