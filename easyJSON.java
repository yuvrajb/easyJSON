/**
 * Creates a json object and provides methods to add various key-value
 * pairs as defined under json rules {@link http://www.json.org}
 * @author Yuvraj Singh Babrah
 * @version 1.1
 * @released 14 February 2014
 */

package easyJSON;

import java.util.*;

public class easyJSON{
    private Map json = null;

    /**
     * 
     */
    public easyJSON(){
        json = new TreeMap();
    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, String value){
        key = "\"" + key + "\"";
        value = value.replace("=", "*$equals$*");
        value = "\"" + value + "\"";
        json.put(key, value);
    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, boolean value){
        key = "\"" + key + "\"";
        json.put(key, value);
    }	

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, Number value){
        key = "\"" + key + "\"";
        json.put(key, value);
    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, easyJSON value){
        key = "\"" + key + "\"";
        json.put(key, value);
    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, easyJSONArray value){
        key = "\"" + key + "\"";
        json.put(key, value);
    }

    /**
     * 
     * @param key
     * @param value 
     */
    public void add(String key, Object value){
        key = "\"" + key + "\"";
        json.put(key, value);
    }

    /**
     * 
     * @param key 
     */
    public void remove(String key){
        key = "\"" + key + "\"";
        if(json.containsKey(key))
            json.remove(key);
    }

    /**
     * 
     * @param key
     * @return 
     */
    public Object get(String key){
        key = "\"" + key + "\"";
        if(json.containsKey(key)){
            Object value = json.get(key);
            if(value instanceof String){
                String value_str = (String)value;
                return value_str.substring(1, value_str.length() - 1);
            }
            return value;
        }
        else
            return null;
    }

    /**
     * 
     * @return
     */
    public String toString(){
        return json.toString().replace("=", ":").replace("*$equals$*", "=");
    }
}