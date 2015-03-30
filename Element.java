package package1;

public enum Element {

	FIRE, WATER, BUG, NORMAL, POISON, GROUND, ELECTRIC, FAIRY, FIGHTING,
	PSYCHIC, GRASS, DRAGON, ROCK, DARK, GHOST, ICE, STEEL, FLYING;
	
	
}

public class typeInfo{

public static ArrayList<Element> getImmune(Element type) {
	ArrayList<Element> out= new ArrayList<Element>();
	
	switch(type) {
		case NORMAL:
			out.add(GHOST);
			break;
			
		case GROUND:
			out.add(ELECTRIC);
			break;
			
		case FAIRY:
			out.add(DRAGON);
			break;
		
		case DARK:
			out.add(PSYCHIC);
			break;
			
		case GHOST:
			out.add(NORMAL);
			out.add(FIGHTING);
			break;
		
		case STEEL:
			out.add(POISON);
			break;
		
		case FLYING:
			out.add(GROUND);
			break;
		
		default:
			break;
	}
	return out;
	
}

public static ArrayList<Element> getWeakness(Element type) {
	ArrayList<Element> out= new ArrayList<Element>();
	
	switch(type) {
		case FIRE:
			out.add(GROUND);
			out.add(ROCK);
			out.add(WATER);
			break;
		
		case WATER:
			out.add(GRASS);
			out.add(ELECTRIC);
			break;
			
		case BUG:
			out.add(FLYING);
			out.add(ROCK);
			out.add(FIRE);
			break;
			
		case NORMAL:
			out.add(FIGHTING);
			break;
			
		case POISON:
			out.add(GROUND);
			out.add(PSYCHIC);
			break;
			
		case GROUND:
			out.add(WATER);
			out.add(GRASS);
			out.add(ICE);
			break;
			
		case ELECTRIC:
			out.add(GROUND);
			break;
			
		case FAIRY:
			out.add(POISON);
			out.add(STEEL);
			break;
			
		case FIGHTING:
			out.add(FLYING);
			out.add(PSYCHIC);
			out.add(FAIRY);
			break;
			
		case PSYCHIC:
			out.add(BUG);
			out.add(GHOST);
			out.add(DARK);
			break;
			
		case GRASS:
			out.add(FLYING);
			out.add(POISON);
			out.add(BUG);
			out.add(FIRE);
			out.add(ICE);
			break;
			
		case DRAGON:
			out.add(ICE);
			out.add(DRAGON);
			out.add(FAIRY);
			break;
			
		case ROCK:
			out.add(FIGHTING);
			out.add(GROUND);
			out.add(STEEL);
			out.add(WATER);
			out.add(GRASS);
			break;
			
		case DARK:
			out.add(FIGHTING);
			out.add(BUG);
			out.add(FAIRY);
			break;
			
		case GHOST:
			out.add(GHOST);
			out.add(DARK);
			break;
			
		case ICE:
			out.add(FIGHTING);
			out.add(ROCK);
			out.add(STEEL);
			out.add(FIRE);
			break;
			
		case STEEL:
			out.add(FIGHTING);
			out.add(GROUND);
			out.add(FIRE);
			break;
			
		case FLYING:
			out.add(ROCK);
			out.add(ELECTRIC);
			out.add(ICE);
			break;
	}
	return out;
}

public static ArrayList<Element> getResistance(Element type) {
	ArrayList<Element> out= new ArrayList<Element>();
	switch(type) {
		case FIRE:
			out.add(BUG);
			out.add(STEEL);
			out.add(FIRE);
			out.add(GRASS);
			out.add(ICE);
			out.add(FAIRY);
			break;
			
		case WATER:
			out.add(STEEL);
			out.add(FIRE);
			out.add(WATER);
			out.add(ICE);
			break;
			
		case BUG:
			out.add(FIGHTING);
			out.add(GROUND);
			out.add(GRASS);
			break;
			
		case NORMAL:
			break;
			
		case POISON:
			out.add(FIGHTING);
			out.add(POISON);
			out.add(BUG);
			out.add(GRASS);
			out.add(FAIRY);
			break;
			
		case GROUND:
			out.add(POISON);
			out.add(ROCK);
			break;
			
		case ELECTRIC:
			out.add(FLYING);
			out.add(STEEL);
			out.add(ELECTRIC);
			break;
		
		case FAIRY:
			out.add(FIGHTING);
			out.add(BUG);
			out.add(DARK);
			break;
		
		case FIGHTING:
			out.add(ROCK);
			out.add(BUG);
			out.add(DARK);
			break;
			
		case PSYCHIC:
			out.add(FIGHTING);
			out.add(PSYCHIC);
			break;
			
		case GRASS:
			out.add(GROUND);
			out.add(WATER);
			out.add(GRASS);
			out.add(ELECTRIC);
			break;
		
		case DRAGON:
			out.add(FIRE);
			out.add(WATER);
			out.add(GRASS);
			out.add(ELECTRIC);
			break;
			
		case ROCK:
			out.add(NORMAL);
			out.add(FLYING);
			out.add(POISON);
			break;
			
		case DARK:
			out.add(GHOST);
			out.add(DARK);
			out.add(FIRE);
			break;
			
		case GHOST:
			out.add(POISON);
			out.add(BUG);
			break;
			
		case ICE:
			out.add(ICE);
			break;
			
		case STEEL:
			out.add(NORMAL);
			out.add(FLYING);
			out.add(ROCK);
			out.add(BUG);
			out.add(STEEL);
			out.add(GRASS);
			out.add(PSYCHIC);
			out.add(ICE);
			out.add(DRAGON);
			out.add(FAIRY);
			break;
			
		case FLYING:
			out.add(FIGHTING);
			out.add(BUG);
			out.add(GRASS);
			break;
			
	}
	
	return out;
}
}
