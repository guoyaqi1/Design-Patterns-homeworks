package hk3_facotrypattern;

public class SoldierFactory implements GameRolesFactory{

	@Override
	public GameRoles Create() {
		return new Soldier(60,60,60,60);
	}

}
