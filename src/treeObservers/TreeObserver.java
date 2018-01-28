package treeObservers;

import colorStrategy.ColorBehavior;
import colorStrategy.GreenColorBehavior;

/**
 *
 * @author OMER
 */
public abstract class TreeObserver {

    String name;
    private ColorBehavior colorBehavior;

    public TreeObserver() {
        colorBehavior = new GreenColorBehavior();
    }

    /**
     * Mission: Update color of the tree according to seasonState
     *
     * @param seasonState
     */
    public abstract void update(int seasonState);

    /**
     * Mission: Display color strategy.
     */
    public void colorDisplay() {
        System.out.print(name + ": ");
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
