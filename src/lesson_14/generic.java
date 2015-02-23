package lesson_14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class generic {
	static <T> List<T> toList(T ... args){
		List<T> res = new ArrayList<>();
		for (T t : args) {
			res.add(t);
		}
		return res;
	}
	
	public static void main(String[] args) {
		
		List<String> ls = toList("a","b","Java");
		System.out.println(toList(1,2,3,4));
		System.out.println(ls);
		
		System.out.println(count("a", "a","3","b","a","a"));
		
		Map<String, Integer> map = new HashMap<>();
		map.put("Java", 1995);
		map.put("C++", 1983);
		map.put("PHP", 1995);
		map.put("Olol", 19000);
		
		System.out.println(count(map, 1995));
		
		//List<Number> ln = toList(1,2.2,3.4f);
		List<Number> ln = generic.<Number>toList(1,2.2,3.4f); // насильное применение нужного типа!!! имя_класса.<тип_данных>
		ln.add((byte)1);
		List<Comparable> lc = generic.<Comparable>toList(1,2.2,3.4f);
		lc.add("abc");
		
	}

	static <T> int count (T seek, T ... args){
		// сколько раз встречается в массиве args значение seek
		int res = 0;
		for (T t : args) {
			if(t.equals(seek))
				res++;
		}
		return res;
	}
	static <K,V> int count(Map<K, V> map,V seek){
		// сколько раз в ассоц массиве встречается seek
		int res = 0;
		
		for (V t : map.values()) {
			if(t.equals(seek))
				res++;
		}
		return res;
	}
	
	static <T,S> int counts (S seek,T ... args){
		//сколько раз в массиве Args встречаются значения ТИПА S
		int res = 0;
		return res;
				
	}
	
}