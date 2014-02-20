/**
 * Creates a json array and provides methods to add various
 * values as defined under json rules {@link http://www.json.org}
 * @author Yuvraj Singh Babrah
 * @version 1.1
 * @released 14 February 2014
 */

package easyJSON;

import java.util.*;

public class easyJSONArray{
    private ArrayList array = null;

    /**
     * 
     */
    public easyJSONArray(){
        array = new ArrayList();
    }

    /**
     * 
     * @param value 
     */
    public void add(String value){
        value = value.replace("=", "*$equals$*");
        value = "\"" + value + "\"";
        array.add(value);
    }

    /**
     * 
     * @param value 
     */
    public void add(boolean value){
        array.add(value);
    }

    /**
     * 
     * @param value 
     */
    public void add(Number value){
        array.add(value);
    }

    /**
     * 
     * @param value 
     */
    public void add(easyJSON value){
        array.add(value);
    }

    /**
     * 
     * @param value 
     */
    public void add(easyJSONArray value){
        array.add(value);
    }

    /**
     * 
     * @param value 
     */
    public void add(Object value){
        array.add(value);
    }

    /**
     * 
     * @param index
     * @return 
     */
    public Object get(int index){
        if(index < array.size()){
            Object value = array.get(index);
            if(value instanceof String){
                String value_str = (String)value;
                return value_str.substring(1, value_str.length() - 1);
            }
            return value;
        }
        return null;
    }

    /**
     * 
     * @param index 
     */
    public void remove(int index){
        if(index < array.size())
            array.remove(index);
    }

    /**
     * 
     * @param value 
     */
    public void remove(Object value){
        if(array.contains(value))
            array.remove(value);
    }

    /**
     * 
     * @return 
     */
    public String toString(){
        return array.toString().replace("*$equals$*", "=");
    }
}