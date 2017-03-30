package by.htp.entity;

public  abstract class Branch extends Leaf{
	
	private boolean flowers= false;
	private boolean coveredWithFrost = false;
	private boolean leaves = true;

	public boolean isLeaves() {
		return leaves;
	}

	public void setLeaves(boolean leaves) {
		this.leaves = leaves;
	}

	public boolean isCoveredWithFrost() {
		return coveredWithFrost;
	}

	public void setCoveredWithFrost(boolean coveredWithFrost) {
		this.coveredWithFrost = coveredWithFrost;
	}

	public Boolean getFlowers() {
		return flowers;
	}

	public void setFlowers(Boolean flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "Branch [flowers=" + flowers + ", coveredWithFrost="
				+ coveredWithFrost + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (coveredWithFrost ? 1231 : 1237);
		result = prime * result + (flowers ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Branch other = (Branch) obj;
		if (coveredWithFrost != other.coveredWithFrost)
			return false;
		if (flowers != other.flowers)
			return false;
		return true;
	}

	
	
}
