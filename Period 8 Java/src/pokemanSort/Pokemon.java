package pokemanSort;

public class Pokemon {
	private int level;
	private int hp;
	private String name;
	private boolean poisoned;
	public Pokemon(String name, int level) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.level = level;
		hp = 100;
		poisoned = false;
	}
	public void iChooseYou(){
		System.out.println(name + ", " + name);
	}
	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else{
			System.out.println("The attack missed");
		}
	}
	public int getHP(){
		return hp;
	}
	public String getName(){
		return name;
	}
	void setHP(int newHP){
		hp = newHP;
	}
	void setPoisoned(boolean b){
		poisoned = b;
	}
	void lapse(){
		if(poisoned)hp -= 15;
	}
}

