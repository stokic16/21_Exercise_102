package exercise_102;

import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 * @author Kilian Stöckler
 */
public class FileModel extends AbstractListModel {
    
    ArrayList<DisplayFile> filesList = new ArrayList<>();


    public void displayCurrentDir(File dir){
        File[] files = dir.listFiles();
        for (File file : files) {
            DisplayFile e= new DisplayFile(file.getAbsolutePath());
            filesList.add(e);
        }
    }
    
    
    @Override
    public int getSize() {
        return filesList.size();
    }

    @Override
    public Object getElementAt(int index) {
        return filesList.get(index);
    }

}
