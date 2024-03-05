package predicateLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateInterfaceExample9 {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("John", "admin"));
		users.add(new User("Peter", "member"));
		users.add(new User("Player", "admin"));
		List<User> admins = process(users, "admin");
		System.out.println(admins);
		
	}

	private static List<User> process(List<User> users, String string) {
		
		Predicate<User> adminPredicate = user -> user.getRole().equals(string);
		
		List<User> adminList = new ArrayList<>();
		
		for (User user1 : users) {
			if (adminPredicate.test(user1)) {
				adminList.add(user1);
			}
		}
		
		return adminList;
	}
}
