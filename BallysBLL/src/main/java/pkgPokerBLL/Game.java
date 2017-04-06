package pkgPokerBLL;
import java.util.ArrayList;
import java.util.UUID;

public class Game {
	
	private UUID TableID;
	private UUID GameID;
	private ArrayList<Player> GamePlayers;

	
	public Game() {
		
	}
	
	public Game(UUID TableID, UUID GameID, ArrayList<Player> GamePlayers) {
		
		GameID=UUID.randomUUID();	
		this.TableID = TableID;
		this.GamePlayers = GamePlayers;
	}

	public UUID getTableID() {
		return TableID;
	}


	public void setTableID(UUID tableID) {
		TableID = tableID;
	}


	public UUID getGameID() {
		return GameID;
	}


	public void setGameID(UUID gameID) {
		GameID = gameID;
	}


	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}


	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	public void AddPlayerToGame(Table table, Player player){
		
		table.AddPlayerToTable(player);
	}

}
