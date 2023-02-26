package CollectionAsgnt;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap2 {
	public static Map<String, Integer> mergeMaps(Map<String, Integer> mapOne, Map<String, Integer> mapTwo){
	        //Implement your logic here and change the return statement accordingly
            Map<String, Integer> mergedMap = new HashMap<String, Integer>();
		
		for (Entry<String, Integer> entry : mapOne.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			mergedMap.put(key, value);
		}
		
		for (Entry<String, Integer> entry : mapTwo.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			mergedMap.put(key, value);
		}
		
		return mergedMap;
		}

		public static void main(String args[]) {
			Map<String, Integer> mapOne = new HashMap<String, Integer>();
			mapOne.put("Kelly", 10);
			mapOne.put("Micheal", 20);
			mapOne.put("Ryan", 30);
			
			Map<String, Integer> mapTwo = new HashMap<String, Integer>();
			mapTwo.put("Jim", 15);
			mapTwo.put("Andy", 45);

			Map<String, Integer> mergedMap = mergeMaps(mapOne, mapTwo);

			System.out.println("Merged Map\n===========");
			for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
				System.out.println(entry.getKey()+" -- "+entry.getValue());
		}
		
	}
}


