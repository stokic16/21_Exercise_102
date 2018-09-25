package exercise_102;

import java.io.File;
import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 * @author Kilian Stöckler
 */
public class FileModel extends AbstractListModel {
    
    ArrayList<DisplayFile> filesList = new ArrayList<>();

    public void dirClicked(int idx){
        DisplayFile e=filesList.get(idx);
        if(e.isDirectory()){
            System.out.println(e.toPath());
            this.displayCurrentDir(e);
        }
    }

    public void displayCurrentDir(File dir){
        filesList.clear();
        File[] files = dir.listFiles();
        filesList.add(new DisplayFile(dir.getParent(), ".."));
        for (File file : files) {
            System.out.println(file.toPath());
            DisplayFile e= new DisplayFile(file.getAbsolutePath(),file.getName());
            filesList.add(e);
        }
        fireContentsChanged(this, 0, filesList.size()-1);
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
