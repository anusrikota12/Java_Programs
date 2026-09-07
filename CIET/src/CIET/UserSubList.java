/*

package CIET;
import java.util.*;
public class UserSubList {
	public static void main(String[] args) {
		List<String> user=new ArrayList<>();
		for(int i=1;i<=100;i++) {
			user.add("User"+i);
		}
		int page=3;
		int pageSize=10;
		int start=(page-1)*pageSize;
		int end=Math.min(start+pageSize, user.size());
		List<String> result=user.subList(start, end);
		System.out.println(result);
	}
}


//o/p:-
//[User21, User22, User23, User24, User25, User26, User27, User28, User29, User30]

*/