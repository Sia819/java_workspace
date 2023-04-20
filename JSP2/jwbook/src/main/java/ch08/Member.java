package ch08;

public class Member {

	private Long id;
	private String email;
	private String password;
	private String name;
	
	public Member(String email, String password, 
			String name) {
		this.email = email;
		this.password = password;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

}
