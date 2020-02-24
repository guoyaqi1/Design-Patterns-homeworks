package hk3_facotrypattern;

public class MasterFactory implements GameRolesFactory{

	@Override
	public GameRoles Create() {
		return new Master(23, 82, 40, 40);
	}

}
