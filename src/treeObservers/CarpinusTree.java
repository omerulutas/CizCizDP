
package treeObservers;

import colorStrategy.*;
import seasonSubject.SeasonsEnum;

/**
 *
 * @author OMER
 */
public class CarpinusTree extends TreeObserver{

    public CarpinusTree() {
        this.name = "Carpinus Tree";
    }

    /**
     * Mission: Update color of the CarpinusTree tree according to seasonsEnum
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
