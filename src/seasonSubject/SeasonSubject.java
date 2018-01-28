
package seasonSubject;

import java.util.ArrayList;
import java.util.List;
import treeObservers.TreeObserver;

/**
 * SeasonSubject is subject of tree observers.
 * Mission: Change season state and notify all of the observers after changing.
 * @author OMER
 */
public class SeasonSubject {
    
    /**
     * This variable keeps list of the observers list. 
     */
    private final List<TreeObserver> treeObservers;
    private SeasonsEnum seasonsEnum;
    
    
    
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
                seasonsEnum = SeasonsEnum.valueof(minute);
                System.out.println("");
                notifyTrees();
                Thread.sleep(1000);
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
 
    public SeasonsEnum getState() {
        return seasonsEnum;
    }
    public void setState(SeasonsEnum seasonsEnum) {
        this.seasonsEnum = seasonsEnum;
    }
    
}
