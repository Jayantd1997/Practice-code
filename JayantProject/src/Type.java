
public enum Type {
	THREE_G("3G"), FOUR_G("4G"), FIVE_G("5G");

	private String type;

	Type(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

}
