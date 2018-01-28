
import seasonSubject.SeasonSubject;
import treeObservers.*;

/**
 *
 * @author OMER
 */
public class CizCizSimulate {
    
    
    public static void main(String[] args) throws InterruptedException {
        
        TreeObserver alnus= new AlnusTree();
        TreeObserver cTree= new CarpinusTree();
        TreeObserver fTree= new FagusTree();
        
        SeasonSubject season= new SeasonSubject(1);
        season.addObserver(alnus);
        season.addObserver(cTree);
        season.addObserver(fTree);
        
        
       season.changeSeason();
        
        
        
        
    }
}
