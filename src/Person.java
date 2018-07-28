
public class Person {
	private int id;
	private int age;
	private int health;
	private char gender;
	private String firstName;
	private String lastName;
	private Person mother;
	private Person father;
	private boolean Alive;
	private Person[] children;
	
	
	public Person(int id) {
		this.id = id;
	}
	public Person(Person mother, Person father) {
		setMother(mother);
		setFather(father);

	}
	
	
	/* -------- GETTERS & SETTERS -------- */
	public int getAge() {
		return age;
	}
	public int getHealth() {
		return health;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public boolean isAlive() {
		return Alive;
	}
	public void setAlive(boolean alive) {
		Alive = alive;
	}
	public Person[] getChildren() {
		return children;
	}
	public void setChildren(Person[] children) {
		this.children = children;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	public int getId() {
		return id;
	}
	
	/* -------- METHODS -------- */
	
	
	
}
