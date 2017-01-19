package Tempractice;

import java.util.HashMap;

@SuppressWarnings("serial")
public class TempHmp<K, V> extends HashMap<K, V>{
	 Object key;
	 Object value;

	    public TempHmp(Object k, Object v)
	    {
	        key = k;
	        value = v;
	    }
	@Override
	public final String toString()
    {
      return key + "=" + value;
    }
	

}
