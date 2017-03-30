package by.htp.entity;

public class Tree extends Branch{
	
	private String name;

	public Tree(String name) {
		
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Tree other = (Tree) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public void turnYellow(){
		this.setColor("Yellow");
		System.out.println("Листья на дереве " + this.name + " пожелтели" );
	}
	public void Frost(){
		this.setCoveredWithFrost(true);
		System.out.println("Дерево " + this.name + " покрылось инеем" );
	}
	public void Bloom(){
		this.setFlowers(true);
		System.out.println("Дерево " + this.name + " зацвело" );
	}
	public void Fall(){
		this.setLeaves(false);
		System.out.println("Листья на дереве " + this.name + " опали");
	}
	@Override
	public String toString() {
		return ("Дерево: " + this.name + " Покрыто инеем: " + this.isCoveredWithFrost() + " Цветёт: " + this.getFlowers() + " Цвет листьев: " + 
	this.getColor() + " Есть листья: " + this.isLeaves());
	}
	
	
}
