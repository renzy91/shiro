package sun.entity;

public class Permission {
	
	private String id;
	private String code;
	private String url;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Permission() {
		super();
	}
	public Permission(String id, String code, String url) {
		super();
		this.id = id;
		this.code = code;
		this.url = url;
	}
	@Override
	public String toString() {
		return "Permission [id=" + id + ", code=" + code + ", url=" + url + "]";
	}
	
}
