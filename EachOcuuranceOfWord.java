import java.util.HashMap;
import java.util.Map;

public class EachOcuuranceOfWord {

	public static void main(String[] args) {
		String[] strarray={"soumya","priya","RAM","soumya"};
		Map<String,Integer> map= new HashMap<>();
		
		for(String str:strarray) {
			if(map.containsKey(str)) {
				map.put(str,map.get(str)+1);
			}else {
				map.put(str,1);
			}
		}
     System.out.println(map);
	}

}
