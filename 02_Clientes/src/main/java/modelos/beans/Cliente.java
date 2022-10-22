package modelos.beans;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String username, password;

	public Cliente(String usarname, String password) {
		super();
		this.username = usarname;
		this.password = password;
	}

	public Cliente() {
		super();
	}

	public String getUsarname() {
		return username;
	}

	public void setUsarname(String usarname) {
		this.username = usarname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Cliente [usarname=" + username + ", password=" + password + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(username, other.username);
	}
	
	

}
