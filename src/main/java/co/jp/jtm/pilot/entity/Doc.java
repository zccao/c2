package co.jp.jtm.pilot.entity;

public class Doc {

	private String id;
	private String type;
	private String Data;

	public Doc(String id, String type, String data) {
		// TODO 自動生成されたコンストラクター・スタブ
		this.id = id;
		this.type = type;
		this.Data = data;

	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}

}
