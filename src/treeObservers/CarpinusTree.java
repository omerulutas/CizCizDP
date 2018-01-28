
package treeObservers;

import colorStrategy.*;

/**
 *
 * @author OMER
 */
public class CarpinusTree extends TreeObserver{

    public CarpinusTree() {
        this.name = "Carpinus Tree";
    }

    /**
     * Mission: Update color of the CarpinusTree tree according to seasonState
     * @param seasonState 
     */
    @Override
    public void update(int seasonState) {
        
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

        colorDisplay();
    }
    
}
