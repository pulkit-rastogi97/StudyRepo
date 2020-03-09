package com.psl.cityMap.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CityStateMap<K,V> extends HashMap<K,V>{
	
	private static final long serialVersionUID = 1L;

	public CityStateMap() {
		super();
	}

	@Override
	public boolean containsKey(Object key) {
		
		return super.containsKey(key);
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		
		return super.entrySet();
	}

	@Override
	public V put(K key, V value) {
		return super.put(key, value);
	}

	@Override
	public V get(Object key) {
		return super.get(key);
	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return super.keySet();
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return super.values();
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return super.containsValue(value);
	}

	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	public List<K> getAllCitiesForState(Map<K,V> map, V value)
	{
		List<K> listOfKeys = null;		
		if(map.containsValue(value))
		{
			listOfKeys = new ArrayList<K>();
			
			for(Map.Entry<K, V> entry : map.entrySet())
			{
				if(entry.getValue().equals(value))
				{
					listOfKeys.add(entry.getKey());	
				}
			}
		}
		return listOfKeys;		
	}
	
	public void deleteAllCitiesForState(List<K> listOfKeys)
	{
		for(K key : listOfKeys)
		{
			this.remove(key);
		}
	}

}
