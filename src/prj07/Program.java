package prj07;

class Human{
	String name;
	double weight;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Human(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}
	
	void eat() {System.out.println("Eating....");}
	@Override
	public String toString() {
		return "Human: "+this.name+", "+this.weight;
	}
}

//-------------------------------------------------------------------------------------------------\\

class Student extends Human{ // class student inherit human so he has all atributes
							 // and methods from human class. 
		
	private int idGroup; // plus new atribute - group ID
	
		public int getIdGroup() {
			return idGroup;
		}
		public void setIdGroup(int idGroup) {
			this.idGroup = idGroup;
		}
		public Student(String name, double weight,int idGroup) {
			super(name, weight);
			this.idGroup = idGroup;
		}
		
		void study() {System.out.println("Study....");} // plus new method - study
	
	@Override
	public String toString() {
		return "Student: "+ super.toString()+", "+this.idGroup;
	}
}

//------------Same with class Doctor -------------------------------------\\
class Doctor extends Human{
	
	private int idLicense;
	
	public int getIdLicense() {
		return idLicense;
	}
	public void setIdLicense(int idLicense) {
		this.idLicense = idLicense;
	}
	public Doctor(String name, double weight, int idLicense) {
		super(name, weight);
		this.idLicense = idLicense;
	}
	@Override
	public String toString() {
		
		return "Doctor: "+this.name+", "+this.weight+", "+this.idLicense;
	}
	void cure() {System.out.println("Cure......");}
}
//----------------Same with class Warrior-----------------------------------------\\
class Warrior extends Human{
	
	int power;
	
	public Warrior(String name, double weight, int power) {
		super(name, weight);
		this.power = power;
	}
	
	@Override
	public String toString() {
		return "Warrior [power=" + power + ", name=" + name + ", weight=" + weight + "]";
	}

	void fight() {System.out.println("Fight....");}
}

public class Program {

	public static void main(String[] args) {
		Student st1 = new Student("Vasya", 65, 1);
		Doctor doc1 = new Doctor("Aybolit", 55, 11);
		Warrior war1 = new Warrior("BrusLee", 45, 100);
		
		Human [] masHum = new Human[3]; // восходящее преобразование типа (Upcasting) \\
		masHum[0]=st1;
		masHum[1]=doc1;
		masHum[2]=war1;
		for (int i = 0; i < masHum.length; i++) {
			if(masHum[i].weight>50)
			System.out.println(masHum[i]);
		}
		System.out.println("-----------------------------------------------");
		st1.eat();
		doc1.eat();
		war1.eat();
		
	}
}

