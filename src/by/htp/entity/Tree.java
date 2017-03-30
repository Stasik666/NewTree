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
		System.out.println("������ �� ������ " + this.name + " ���������" );
	}
	public void Frost(){
		this.setCoveredWithFrost(true);
		System.out.println("������ " + this.name + " ��������� �����" );
	}
	public void Bloom(){
		this.setFlowers(true);
		System.out.println("������ " + this.name + " �������" );
	}
	public void Fall(){
		this.setLeaves(false);
		System.out.println("������ �� ������ " + this.name + " �����");
	}
	@Override
	public String toString() {
		return ("������: " + this.name + " ������� �����: " + this.isCoveredWithFrost() + " �����: " + this.getFlowers() + " ���� �������: " + 
	this.getColor() + " ���� ������: " + this.isLeaves());
	}
	
	
}
