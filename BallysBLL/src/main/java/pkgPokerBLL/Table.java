package pkgPokerBLL;


import java.util.HashMap;
import java.util.UUID;

public class Table {

	private UUID TableID;
	
	HashMap<UUID, Player> TablePlayers = new HashMap<UUID, Player>();
	
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public Table AddPlayerToTable(Player p)
	{
		TablePlayers.put(p.getPlayerID() ,p);		
		return this;
	}
	
	public Table RemovePlayerFromTable(Player p)
	{
		
		TablePlayers.remove(p.getPlayerID());
		return this;
	}
}
