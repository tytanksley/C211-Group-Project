# C211 Spring 2021
# Team Blue 2 Group Project
# Sean, Ty, Hunter
# https://github.com/tytanksley/C211-Group-Project

### Batch file renamer and mover.  ###

Move or rename multiple files.

GUI shows contents of Java project directory and allows user to rename a single file or move/rename multiple files based on files' names. 


# Operation Preview

 After clicking the 'test' button,'Changes to be made' area shows what operations are about to be performed.


# Enter filenames manually

Type names of files from 'Directory Contents' display into 'Add Filename(s)' area

Select 'move' or 'rename', but NOT BOTH.

Click the 'test' button to display changes to be made based on user input.

Click the 'start' button to execute changes.


# Select multiple files based on name

 Enter a string into the fields 'contains', 'starts with', 'ends with' fields. User 'start' and 'test' buttons as usual.  

 When the 'contains' option is selected while renaming, filenames that contain that string will have it replaced by the value of 'New Name(es)'.

 Selecting files based on multiple criteria is not supported, so make sure only one of these fields is used at a time. 


# Target Directory

 The directory 'TestFiles' within the java project is the default target, but this area can be edited to move files anywhere on the machine according to manual user input.


# Guidelines and known bugs
 
 - The GUI operates out of the Java project folder, so be careful not to include any filenames to the operation that would match an important java file project.  The default files to be tested in this environment are 

        test.dat, test1.dat, test2.txt, another_test.txt

These filenames should not conflict with important documents in the directory, (note to avoid 'Test' in search parameters, since 'TestFiles' is a directory).  Other files can be added to the folder, but these should be enough to test basic functionality.

 - Renaming and moving at the same time is not supported.

 - 'Directory' text field at top is not editable.  Currently, only the default java project folder is used.

 - More information on bugs/limitations are found in 'ProjectNotes.txt'
