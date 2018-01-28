
package treeObservers;

import colorStrategy.*;
import seasonSubject.SeasonsEnum;

/**
 *
 * @author OMER
 */
public class AlnusTree extends TreeObserver{

    public AlnusTree() {
        this.name = "Alnus Tree";
    }

    /**
     * Mission: Update color of the AlnusTree tree according to seasonsEnum
     * @param seasonState 
     */
    @Override
    public void update(SeasonsEnum seasonsEnum) {
        season = seasonsEnum;
        int seasonState = seasonsEnum.getValue();
        switch (seasonState) {
            case 1:
                setColorBehavior(new WhiteColorBehavior());
                break;
            case 2:
            case 3:
                setColorBehavior(new GreenColorBehavior());
                break;
            case 4:
                setColorBehavior(new YellowColorBehavior());
                break;
            default:
                break;
        }

        displayTree();
    }
    
    
}
