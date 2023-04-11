package org.modelo.sregion;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the S_REGION database table.
 * 
 */
@Entity
@NamedQuery(name="S_Region.findAll", query="SELECT s FROM S_Region s")
public class S_Region implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	public S_Region() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}