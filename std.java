package construction;

public class std {
	
	int id;
	String name;
	
	std (int i, String n) {
		id=i;
		name=n;
	}


	
	
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {

		std s1=new std(2,"Alex");
		std s2=new std(10,"Annie");
		
		s1.display();
		s2.display();
			}

	}

