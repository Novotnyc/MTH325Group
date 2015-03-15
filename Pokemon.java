package package1;

public class Pokemon {
	
	private String name;
	private int PokeNum;
	private int HP;
	private int Speed;
	private int Attack;
	private int Defense;
	private int SPAttack;
	private int SPDefense;
	private int totalStats;
	private Element type1;
	private Element type2;
	
	/**A default constructor to construct Bulbasaur.*/
	public Pokemon() {
		PokeNum = 001;
		name = "Bulbasaur";
		type1 = Element.valueOf("GRASS");
		type2 = Element.valueOf("POISON");
		HP = 45;
		Speed = 45;
		Attack = 49;
		Defense = 49;
		SPAttack = 69;
		SPDefense = 69;
		totalStats = 318;
	}
	/**Constructor that will construct Pokemon from file input.
	 * @param  num - incoming pokeNumber. 
	 * @param Inname - incoming name.
	 * @param type1st - incoming first type of Pokemon.
	 * @param type2nd - incoming second type of Pokemon.
	 * @param inHP - number of hit points.
	 * @param speed - amount of speed.
	 * @param attack - attack stat.
	 * @param defense - defense stat.
	 * @param spAttack - Special Attack stat.
	 * @param spDefense - Special Defense stat. 
	 * @param statTotal - Total of all stats*/
	public Pokemon(final int num, final String Inname, 
			final String type1st, final String type2nd, final int inHP,
			final int speed, final int attack, final int defense, 
			final int spAttack, final int spDefense, 
			final int statTotal) {
		PokeNum = num;
		name = Inname;
		type1 = Element.valueOf(type1st.toUpperCase());
		type2 = Element.valueOf(type2nd.toUpperCase());
		HP = inHP;
		Speed = speed;
		Attack = attack;
		Defense = defense;
		SPAttack = spAttack;
		SPDefense = spDefense;
		totalStats = statTotal;
	}
	
	/**getName for returning the name of the Pokemon.  
	 * @return name - the Pokemon's name */
	protected final String getName() {
		return name;
	}
	
	/**getNumber for returning the number of the Pokemon.  
	 * @return PokeNum - the Pokemon's number */
	protected final int getPokeNum() {
		return PokeNum;
	}
	
	/**getHP for returning the HP of the Pokemon.  
	 * @return HP - the Pokemon's HP */
	protected final int getHP() {
		return HP;
	}
	
	/**getSpeed for returning the speed of the pokemon.  
	 * @return Speed - the Pokemon's speed */
	protected final int getSpeed() {
		return Speed;
	}
	
	/**getAttack for returning the attack of the pokemon.  
	 * @return Attack - the Pokemon's attack */
	protected final int getAttack() {
		return Attack;
	}
	/**getDefense for returning the defense of the pokemon.  
	 * @return Defense - the Pokemon's defense */
	protected final int getDefense() {
		return Defense;
	}

	/**getSPAttack for returning the special attack of the pokemon.  
	 * @return SPAttack - the Pokemon's special attack */
	protected final int getSPAttack() {
		return SPAttack;
	}
	
	/**getSPDefense for returning the special defense of the pokemon.  
	 * @return SPDefense - the Pokemon's special defense */
	protected final int getSPDefense() {
		return SPDefense;
	}

	/**getTotalStats for returning the total statistics of the pokemon.  
	 * @return totalStats - the Pokemon's name */
	protected final int getTotalStats() {
		return totalStats;
	}

	/**getType1 for returning the first type of the pokemon.  
	 * @return type1 - the Pokemon's first type */
	protected final String getType1() {
		return type1.toString();
	}

	/**getType2 for returning the second type of the pokemon.  
	 * @return type2 - the Pokemon's second type */
	protected final String getType2() {
		return type2.toString();
	}
	
}
