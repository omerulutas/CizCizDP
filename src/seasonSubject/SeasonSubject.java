
package seasonSubject;

import java.util.ArrayList;
import java.util.List;
import treeObservers.TreeObserver;

/**
 *
 * @author OMER
 */
public class SeasonSubject {
    
    /**
     * This is list of the observer trees 
     */
    private final List<TreeObserver> treeObservers;
    private int state;
    
    public SeasonSubject(int time) {
        treeObservers= new ArrayList<>();
     
    }
 
    /**
     * Mission: Changes season according to time 
     * @throws InterruptedException 
     */
     public void changeSeason() throws InterruptedException{
        while(true){
            for(int minute=1; minute<=4; minute++){
                state=minute;
                System.out.println("");
                notifyTrees();
                Thread.sleep(500);
            }
        }
    }

    /**
     * Mission: Adding observer trees.
     * @param tree 
     */
    public void addObserver(TreeObserver tree){
        if(!treeObservers.contains(tree)){
            treeObservers.add(tree);
        }
    }
    
    /**
     *  Mission: When season is changed, notify all of the observers.
     */
    public void notifyTrees(){
        for(TreeObserver tree: treeObservers){
            tree.update(getState());
        }
    }
 
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    
}
