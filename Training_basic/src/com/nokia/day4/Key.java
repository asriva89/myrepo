/**
 * 
 */
package com.nokia.day4;

/**
 * @author a34sriva
 *
 */
public class Key {
	
	private long id;
	

	public Key(long id) {
		super();
		this.id = id;
	}


	@Override
	public String toString() {
		return "Key [id=" + id + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
