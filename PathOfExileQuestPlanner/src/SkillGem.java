
public final class SkillGem {

	//Simple for now, expand later if needed
	final private String name ;
	final private GemColor color ;
	
	//Get rid of public constructor later
	public SkillGem( String gemName, GemColor gemColor )
	{
		name = gemName ;
		color = gemColor ;
	}

	public String getName() 
	{
		return name;
	}

	public GemColor getColor() 
	{
		return color;
	}
	
	
}
