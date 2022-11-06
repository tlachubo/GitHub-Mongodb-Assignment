package com.Lambda;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
public class KeyValues{
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("a",4);
        map.put("b",2);
        map.put("c",3);
        KeyValues KeyValues = new KeyValues();
        KeyValues.convertKeyValueToString(map);
    }
    @SuppressWarnings("unchecked")
	public String convertKeyValueToString(HashMap<String, Integer> map) {



       StringBuilder str = new StringBuilder();
        @SuppressWarnings("rawtypes")
		Consumer<Map.Entry> consumer=(p)->str.append(p.getKey()).append(p.getValue());
        @SuppressWarnings("rawtypes")
		Set set  = map.entrySet();
        set.stream()
                .forEach(consumer);
        System.out.println(str);
        return str.toString();
    }
}