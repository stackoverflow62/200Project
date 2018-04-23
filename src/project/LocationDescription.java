package project;

public class LocationDescription {
	
	String name, description, character, color, tools, weapon, enemy;
	
	public LocationDescription(String name, String description, String character, String color, 
			String tools, String weapon, String enemy) {
		this.name = name;
		this.description = description;
		this.character = character;
		this.color = color;
		this.tools = tools;
		this.weapon = weapon;
		this.enemy = enemy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTools() {
		return tools;
	}

	public void setTools(String tools) {
		this.tools = tools;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public String getEnemy() {
		return enemy;
	}

	public void setEnemy(String enemy) {
		this.enemy = enemy;
	}
	
	public String toString()
	{
		 String con = this.name + "\n" + this.description + "\n" + this.character + "\n" + this.color + "\n" + this.tools + "\n" + this.weapon + "\n" + this.enemy + "\n"; 
		 return con;
	}



}
