
package seasonSubject;

import java.util.HashMap;
import java.util.Map;

/**
 * Mission: This enum is created for readable season mechanism. 
 * @author OMER
 */
public enum SeasonsEnum {
    Winter(1),
    Spring(2),
    Summer(3),
    Autumn(4);
    
    
    
    private int value;
    private static Map map = new HashMap<>();
    
    private SeasonsEnum(int value){
        this.value = value;
    }
    
    /**
     * This statement is used for getting season by value. This statement provides ease getting season.
     */
    static {
        for (SeasonsEnum season : SeasonsEnum.values()) {
            map.put(season.value, season);
        }
    }
    
    /**
     * 
     * @param value
     * @return SeasonsEnum
     */
    public static SeasonsEnum valueof(int value){
        return (SeasonsEnum) map.get(value);
    }
    
    public int getValue(){
        return value;
    }
    
}
