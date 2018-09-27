package exercise_102;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;

/**
 * @author Kilian Stöckler
 */
public class FileModel extends AbstractListModel<DisplayFile> {
    
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
        for (File file : files) {
    
            DisplayFile e= new DisplayFile(file.getAbsolutePath(),file.getName());
            filesList.add(e);
        }
        Collections.sort(filesList, new SortFiles());
        filesList.add(0,new DisplayFile(dir.getParent(), ".."));
        fireContentsChanged(this, 0, filesList.size()-1);
    }
    
    
    @Override
    public int getSize() {
        return filesList.size();
    }

    @Override
    public DisplayFile getElementAt(int index) {
        return filesList.get(index);
    }

}
