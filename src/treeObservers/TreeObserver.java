package treeObservers;

import colorStrategy.ColorBehavior;
import colorStrategy.GreenColorBehavior;
import seasonSubject.SeasonsEnum;

/**
 *
 * @author OMER
 */
public abstract class TreeObserver {

    String name;
    SeasonsEnum season;
    private ColorBehavior colorBehavior;

    public TreeObserver() {
        colorBehavior = new GreenColorBehavior();
    }

    /**
     * Mission: Update color of the tree according to seasonsEnum
     *
     * @param seasonState
     */
    public abstract void update(SeasonsEnum seasonsEnum);

    public void displayTree(){
        System.out.print(season + ">> ");
        System.out.print(name + ": ");
        colorDisplay();
    }
    
    /**
     * Mission: Display color strategy.
     */
    public void colorDisplay() {
        
        colorBehavior.applyColor();
    }

    /**
     * Mission: Setting colourBehavior as received parameter.
     *
     * @param colorBehavior THis is color strategy
     */
    public void setColorBehavior(ColorBehavior colorBehavior) {
        this.colorBehavior = colorBehavior;
    }

}
