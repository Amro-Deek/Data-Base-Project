package application;

public class Menu {
	private int menuId;

	public Menu(int menuId) {
		this.menuId = menuId;
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	@Override
	public String toString() {
		return "Menu{" + "menuId=" + menuId + '}';
	}
}
