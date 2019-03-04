package hdfs;

import java.util.HashMap;

public class Context {
	public HashMap<Object, Object> contextHashmap = new HashMap<>();
	
	public void write(Object key, Object value) {
		contextHashmap.put(key, value);
	}
	
	public Object get(Object key) {
		
		return contextHashmap.get(key);
	}
	
	public HashMap<Object, Object> getContextHashMap() {
		return contextHashmap;
	}
}
