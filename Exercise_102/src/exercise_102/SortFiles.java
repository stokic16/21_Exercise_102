

package exercise_102;

import java.util.Comparator;

/**
 * @author Kilian Stöckler
 */
public class SortFiles implements Comparator<DisplayFile>{

    @Override
    public int compare(DisplayFile o1, DisplayFile o2) {
        if(o1.isDirectory()&&o2.isFile()){
            return -1;
        }
        if(o1.isFile()&&o2.isDirectory()){
            return 1;
        }
        return o1.getDisplay().compareTo(o2.getDisplay());
    }

}
