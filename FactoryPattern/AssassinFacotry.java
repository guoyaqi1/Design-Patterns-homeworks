package hk3_facotrypattern;

public class AssassinFacotry implements GameRolesFactory{

	@Override
	public GameRoles Create() {
		return new Assassin(77,20,30,40);
	}

}
