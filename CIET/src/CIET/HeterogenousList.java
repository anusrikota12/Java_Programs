/*

package CIET;
import java.util.List;
import java.util.ArrayList;
public class HeterogenousList {
	public static void main(String[] args) {
		List<Object> mixedList=new ArrayList<>();
		mixedList.add("Anu");
		mixedList.add(571602);
		mixedList.add(4259);
		mixedList.add("Sri");
		System.out.println(mixedList);
		for(Object item:mixedList) {
			if(item instanceof String) {
				String str=(String) item;
				System.out.println(str);
			}
			else if(item instanceof Integer) {
				int n=(Integer)item;
				System.out.println(n);
			}
		}
	}
}

//o/p:-
//[Anu, 571602, 4259, Sri]
//Anu
//571602
//4259
//Sri

*/