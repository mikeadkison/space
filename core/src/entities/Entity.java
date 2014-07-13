package entities;

public abstract class Entity {
	
	private float xPos;
	private float yPos;
	private float rotation;
	
	public Entity(float xPos, float yPos, float rotation) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.rotation = rotation;
	}
	public Entity() {
		this(0,0,0);
	}
	public float getX() {
		return xPos;
	}
	
	public float getY() {
		return yPos;
	}
	
	public float getRotation() {
		return rotation;
	}
	
	public void setX(float xPos) {
		this.xPos = xPos;
	}
	
	public void setY(float yPos) {
		this.yPos = yPos;
	}
	
	public void setRotation(float rotation) {
		this.rotation = rotation;
	}
}
