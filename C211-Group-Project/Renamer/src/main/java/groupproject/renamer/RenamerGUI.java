/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package groupproject.renamer;

import java.io.File;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.*;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author home
 */
public class RenamerGUI extends javax.swing.JFrame {

    /**
     * Creates new form RenamerGUI
     */
    public RenamerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DirectoryDisplay = new javax.swing.JScrollPane();
        AreaDirectoryDisplay = new javax.swing.JTextArea();
        NewDirectoryDisplay = new javax.swing.JScrollPane();
        AreaNewDirectory = new javax.swing.JTextArea();
        ButtonRename = new javax.swing.JRadioButton();
        ButtonMove = new javax.swing.JRadioButton();
        LabelContains = new javax.swing.JLabel();
        LabelStartsWith = new javax.swing.JLabel();
        LabelEndsWith = new javax.swing.JLabel();
        FieldContains = new javax.swing.JTextField();
        FieldStartsWith = new javax.swing.JTextField();
        FieldEndsWith = new javax.swing.JTextField();
        FieldDirectory = new javax.swing.JTextField();
        LabelDirectory = new javax.swing.JLabel();
        LabelTargetDirectory = new javax.swing.JLabel();
        FieldTargetDirectory = new javax.swing.JTextField();
        LabelAction = new javax.swing.JLabel();
        LabelDirectoryContents = new javax.swing.JLabel();
        LabelChanges = new javax.swing.JLabel();
        ButtonTest = new javax.swing.JButton();
        ButtonStart = new javax.swing.JButton();
        LabelFilename = new javax.swing.JLabel();
        LabelNewName = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaFilename = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaNewFilename = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaDirectoryDisplay.setColumns(20);
        AreaDirectoryDisplay.setRows(5);
        AreaDirectoryDisplay.setText(directoryContentsToString());
        DirectoryDisplay.setViewportView(AreaDirectoryDisplay);

        AreaNewDirectory.setColumns(20);
        AreaNewDirectory.setRows(5);
        AreaNewDirectory.setText("[display changes to be made here]");
        NewDirectoryDisplay.setViewportView(AreaNewDirectory);

        ButtonRename.setText("Rename");

        ButtonMove.setText("Move");

        LabelContains.setText("Contains");

        LabelStartsWith.setText("Starts with");

        LabelEndsWith.setText("Ends with");

        FieldContains.setText("[Contains]");
        FieldContains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldContainsActionPerformed(evt);
            }
        });

        FieldStartsWith.setText("[Starts with]");

        FieldEndsWith.setText("[Ends with]");

        FieldDirectory.setText(getCurrentDirectory());

        LabelDirectory.setText("Directory");

        LabelTargetDirectory.setText("Target Directory");

        FieldTargetDirectory.setText("[Target Directory]");

        LabelAction.setText("Action");

        LabelDirectoryContents.setText("Directory Contents");

        LabelChanges.setText("Changes to be made");

        ButtonTest.setText("Test");
        ButtonTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTestActionPerformed(evt);
            }
        });

        ButtonStart.setText("Start");
        ButtonStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonStartActionPerformed(evt);
            }
        });

        LabelFilename.setText("Add Filename(s)");

        LabelNewName.setText("New Name(s)");

        AreaFilename.setColumns(20);
        AreaFilename.setRows(5);
        jScrollPane3.setViewportView(AreaFilename);

        AreaNewFilename.setColumns(20);
        AreaNewFilename.setRows(5);
        jScrollPane1.setViewportView(AreaNewFilename);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ButtonMove)
                            .addComponent(LabelAction)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LabelTargetDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FieldTargetDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(LabelDirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ButtonTest)
                                .addGap(18, 18, 18)
                                .addComponent(ButtonStart))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelContains)
                                            .addGap(20, 20, 20)
                                            .addComponent(FieldContains, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LabelFilename)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(LabelStartsWith)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FieldStartsWith, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(LabelEndsWith)
                                            .addGap(18, 18, 18)
                                            .addComponent(FieldEndsWith, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(ButtonRename)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LabelNewName))))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LabelDirectoryContents)
                                    .addComponent(LabelChanges)
                                    .addComponent(NewDirectoryDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)
                                    .addComponent(DirectoryDisplay))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDirectory)
                    .addComponent(FieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelFilename)
                    .addComponent(LabelDirectoryContents, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelContains)
                            .addComponent(FieldContains, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldStartsWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelStartsWith))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FieldEndsWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelEndsWith)))
                    .addComponent(DirectoryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelChanges)
                .addGap(3, 3, 3)
                .addComponent(LabelAction)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NewDirectoryDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonTest)
                            .addComponent(ButtonStart)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonMove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelTargetDirectory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldTargetDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonRename)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelNewName)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldContainsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldContainsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldContainsActionPerformed

    private void ButtonStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonStartActionPerformed
        // TODO add your handling code here:
           if(!ButtonRename.isSelected() && !ButtonMove.isSelected())
        AreaNewDirectory.setText("No actions have been selected!\nPlease select 'Move' or 'Rename'");
    else
    {
        startButton();
    }
    }//GEN-LAST:event_ButtonStartActionPerformed

    private void ButtonTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTestActionPerformed
       if(!ButtonRename.isSelected() && !ButtonMove.isSelected())
        AreaNewDirectory.setText("No actions have been selected!\nPlease select 'Move' or 'Rename'");
    else
    {
        testButton();
    }
    }//GEN-LAST:event_ButtonTestActionPerformed

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
            java.util.logging.Logger.getLogger(RenamerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RenamerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RenamerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RenamerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RenamerGUI().setVisible(true);
            }
        });
    }

    // get arraylist of filenames from AreaFilename

    public ArrayList<File> getFilenames(){
     Scanner scan = new Scanner(AreaFilename.getText());
     ArrayList<File> filenames = new ArrayList<File>();
     while (scan.hasNext())
             {
                 filenames.add(new File(scan.next()));
             }

     return filenames;
    }
    
    public ArrayList<File> getNewFilenames(){
     Scanner scan = new Scanner(AreaNewFilename.getText());
     ArrayList<File> filenames = new ArrayList<File>();
     while (scan.hasNext())
             {
                 filenames.add(new File(scan.next()));
             }

     return filenames;
    }
    
    
    public ArrayList<String> filenamesToString()
    {
        ArrayList<String> filenames = new ArrayList<String>();
        for (File file: getFilenames())
        {
            filenames.add(file.toString());
        }
        return filenames;
    }
    
     public ArrayList<String> newFilenamesToString()
    {
        ArrayList<String> filenames = new ArrayList<String>();
        for (File file: getNewFilenames())
        {
            filenames.add(file.toString());
        }
        return filenames;
    }

    // Find current directory
    String getCurrentDirectory() {
      String path = System.getProperty("user.dir");
      
      System.out.println("Working Directory = " + path);
      return path;
    }
    
    // List files in directory
    
    File[] displayDirectoryContents(){
       File currentDirectory = new File(getCurrentDirectory());
    File[] directoryContents = currentDirectory.listFiles(); 
   try {
      for(File file : directoryContents) {
        if(file.isFile()) {
          System.out.println(file);
      }
      }
    } catch (Exception e) {
      e.getStackTrace();
    }
     return directoryContents;  
    }
    
    // list contents of directory as String with line breaks after each file
    public String directoryContentsToString(){
        String files = "";
        for(File file: displayDirectoryContents()){
            files += file.getName() + "\n";
        }
        
        return files;
    }
  
    
    // renameFile() tested, seems to work
        // need to figure out how to take an arraylist from text area and loop over a list of files from user input
    public void renameFile()
    {
        // get old and new filenames from text areas
        File targetFile = new File(AreaNewFilename.getText());
        File originalFile = new File(AreaFilename.getText());
         
     // rename file
        if(originalFile.renameTo(targetFile))
         {  
        // display changes made
         String outputMessage = originalFile.toString() +  " changed to " + targetFile.toString();
         AreaNewDirectory.setText(outputMessage);
        // refresh list of files in directory after renaming
         AreaDirectoryDisplay.setText(directoryContentsToString());
        }
    
    }
    
    public void renameFile1()
    {
        ArrayList<File> originalFilenames = getFilenames();
        ArrayList<File> newFilenames = getNewFilenames();
          AreaNewDirectory.setText("");
          
        
        for(int i = 0; i < originalFilenames.size(); i++)
        {
            if(originalFilenames.get(i).renameTo(newFilenames.get(i)));
            AreaNewDirectory.append(originalFilenames.get(i).toString() + " --> " + newFilenames.get(i).toString());
        }
    }
    // display changes to be made made by renameFile()
    public void testRename()
    {
        File targetFile = new File(AreaNewFilename.getText());
        File originalFile = new File(AreaFilename.getText()); 
        AreaNewDirectory.setText(originalFile.toString() + " --> " + targetFile.toString());
      
    }
    
    public void testRename1()
    {
        ArrayList<String> orginalFilenames = filenamesToString();
        ArrayList<String> newFilenames = newFilenamesToString();
        
        // clear display
        AreaNewDirectory.setText("");
        
        for (int i = 0; i < orginalFilenames.size(); i++)
        {
        AreaNewDirectory.append(orginalFilenames.get(i) + " --> " + newFilenames.get(i) + "\n");
    
        }
    }
    // need to change originalFile to get name of renamed file before moving
    public void moveFile()
    {
        String fileSep = File.separator;
        String originalFileName = "";
      
        String targetFileName = "";
       
  
        // determine if file to be moved will also be renamed
        if(ButtonRename.isSelected())
        {
         originalFileName =   AreaNewFilename.getText();
         targetFileName =  FieldTargetDirectory.getText() + fileSep + AreaNewFilename.getText();
                 }
         
        if(!ButtonRename.isSelected())
        {
            originalFileName = AreaFilename.getText();
            targetFileName = FieldTargetDirectory.getText() + fileSep + AreaFilename.getText();
        }
        // create target file with new name or original
        File targetFile = new File(targetFileName);
        File originalFile = new File(originalFileName);
        
        if(originalFile.renameTo(targetFile))
        {
            String outputMessage = originalFile.toString() +  " moved to " + targetFile.toString();
            AreaNewDirectory.setText(outputMessage);
            // refresh list of files in directory after renaming
            AreaDirectoryDisplay.setText(directoryContentsToString());
            // delete original file
            originalFile.delete();
        }
        
    }
    
     public void moveFile1()
    {
        String fileSep = File.separator;
        ArrayList<File> originalFilenames = new ArrayList<>();
        ArrayList<File> newFilenames = getNewFilenames();
        ArrayList<File> targetFilenames = new ArrayList<>();
       
  
        // determine if file to be moved will also be renamed
        if(ButtonRename.isSelected())
        {
            renameFile1();
            originalFilenames = getNewFilenames();
         for(int i = 0; i < newFilenames.size(); i++)
         {
          
            targetFilenames.add(new File(FieldTargetDirectory.getText() + fileSep + newFilenames.get(i).toString()));             
        }
        }
        
        if(!ButtonRename.isSelected())
        {
            originalFilenames = getFilenames();
          for(int i = 0; i < originalFilenames.size(); i++)
         {
             targetFilenames.add(new File(FieldTargetDirectory.getText() + fileSep + originalFilenames.get(i).toString()));
             AreaNewDirectory.append(targetFilenames.toString());
             
         }
        }
        
       // clear display 
       AreaNewDirectory.setText("");
       
       // use rename() to move file to new directory with original or new filename
      for(int i = 0; i < originalFilenames.size(); i++)
      {
          if(originalFilenames.get(i).renameTo(targetFilenames.get(i)))
          {
              String output = originalFilenames.get(i).toString() + " --> " + FieldTargetDirectory.getText() + fileSep + targetFilenames.get(i).toString();
              AreaNewDirectory.setText(output);
          }
        
    }
        
        }
    
    
    public void testMove()
    {
       String fileSep = File.separator;
        
         File originalFile = new File(AreaFilename.getText());
        String targetFileName = "";
                // determine if file to be moved will also be renamed
        if(ButtonRename.isSelected())
         targetFileName =  FieldTargetDirectory.getText() + fileSep + AreaNewFilename.getText();
        if(!ButtonRename.isSelected())
         targetFileName = FieldTargetDirectory.getText() + fileSep + AreaFilename.getText();
        
        // create target file with new name or original
        File targetFile = new File(targetFileName);
  
        AreaNewDirectory.setText(originalFile.toString() + " --> " + targetFile.toString() + "\n");
    }
    
    public void testMove1()
    {
        String fileSep = File.separator;
        ArrayList<File> originalFiles = getFilenames();
        ArrayList<File> newFiles = getNewFilenames();
        ArrayList<String> targetFiles = new ArrayList<String>();
        
        // move only
        // get filenames from AreaFilename and add to targetFiles
        if(!ButtonRename.isSelected())
        {
            for(File f : originalFiles)
        {
            targetFiles.add(f.toString());
        }
       //Clear display
       AreaNewDirectory.setText("");
       // Show changes to be made     
       for(String s : targetFiles)
       {
           
           AreaNewDirectory.append(s + " --> " + FieldTargetDirectory.getText() + fileSep + s + "\n");      
           
    }
        
        }
           // move and rename
        
        // get filenames from AreaFilename and add to targetFiles
        if(ButtonRename.isSelected())
        {
        for(File s : newFiles)
        {
            targetFiles.add(s.toString());
        }
        // clear display
        AreaNewDirectory.setText("");
        
       for (int i = 0; i < originalFiles.size(); i++)
       {    
           AreaNewDirectory.append(originalFiles.get(i) + " --> " + FieldTargetDirectory.getText() + fileSep + newFiles.get(i) + "\n");
       }
        }
    }
    // test button
    public void testButton()
    {

        if(ButtonRename.isSelected() && !ButtonMove.isSelected())
            testRename1();
        if(ButtonMove.isSelected() && !ButtonRename.isSelected())
            testMove1();
        if(ButtonMove.isSelected() && ButtonRename.isSelected())
        {
          //  testRename();
            testMove1();
        }
    }
    
    // start button
    // getting a bug when i try to rename and move in same action
    public void startButton()
    {

    // check to see if an action is selected
 
        
        
    // if 'rename' button is selected, rename file
     
      
        {
        if(ButtonRename.isSelected() && !ButtonMove.isSelected())
            renameFile1();
        if(ButtonMove.isSelected() && !ButtonRename.isSelected())
            moveFile1();
        if(ButtonMove.isSelected() && ButtonRename.isSelected())
        {
           
           renameFile1();
            moveFile1();
      }
      }
       
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDirectoryDisplay;
    private javax.swing.JTextArea AreaFilename;
    private javax.swing.JTextArea AreaNewDirectory;
    private javax.swing.JTextArea AreaNewFilename;
    private javax.swing.JRadioButton ButtonMove;
    private javax.swing.JRadioButton ButtonRename;
    private javax.swing.JButton ButtonStart;
    private javax.swing.JButton ButtonTest;
    private javax.swing.JScrollPane DirectoryDisplay;
    private javax.swing.JTextField FieldContains;
    private javax.swing.JTextField FieldDirectory;
    private javax.swing.JTextField FieldEndsWith;
    private javax.swing.JTextField FieldStartsWith;
    private javax.swing.JTextField FieldTargetDirectory;
    private javax.swing.JLabel LabelAction;
    private javax.swing.JLabel LabelChanges;
    private javax.swing.JLabel LabelContains;
    private javax.swing.JLabel LabelDirectory;
    private javax.swing.JLabel LabelDirectoryContents;
    private javax.swing.JLabel LabelEndsWith;
    private javax.swing.JLabel LabelFilename;
    private javax.swing.JLabel LabelNewName;
    private javax.swing.JLabel LabelStartsWith;
    private javax.swing.JLabel LabelTargetDirectory;
    private javax.swing.JScrollPane NewDirectoryDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
