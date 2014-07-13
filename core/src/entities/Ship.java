package entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import java.lang.Math;

public class Ship extends Entity {

	private float forwardThrust;
	private float rotationThrust;
	private float movementSpeed;
	private float rotationSpeed;
	
	private float xSpeed = 0;
	private float ySpeed = 0;

	public Ship(float xPos, float yPos, float rotation, float forwardThrust, float rotationThrust) {
		super(xPos, yPos, rotation);
		setForwardThrust(forwardThrust);
		setRotationThrust(rotationThrust);
	}

	public void update() {
		float dt = Gdx.graphics.getDeltaTime();

		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			setRotation(getRotation() + dt * getRotationThrust());
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			setRotation(getRotation() - dt * getRotationThrust());
		}
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			xSpeed -= dt * forwardThrust
					* Math.sin(Math.toRadians(getRotation()));
			ySpeed += dt * forwardThrust
					* Math.cos(Math.toRadians(getRotation()));
		}
		
		setX(getX() + xSpeed);
		setY(getY() + ySpeed);
	}

	public void setForwardThrust(float forwardThrust) {
		this.forwardThrust = forwardThrust;
	}

	public void setRotationThrust(float rotationThrust) {
		this.rotationThrust = rotationThrust;
	}

	public float getRotationThrust() {
		return rotationThrust;
	}
	public float getMovementSpeed() {
		return movementSpeed;
	}

	public float getRotationSpeed() {
		return rotationSpeed;
	}

	public void setMovementSpeed(float movementSpeed) {
		this.movementSpeed = movementSpeed;
	}

	public void setRotationSpeed(float rotationSpeed) {
		this.rotationSpeed = rotationSpeed;
	}
}
