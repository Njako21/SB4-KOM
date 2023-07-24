package dk.sdu.mmmi.cbse.entities;

public class EnemyBullet extends Bullet {

    public EnemyBullet(float x, float y, float radians) {
        super(x, y, radians);

        this.color = new float[]{1, 0, 0, 1};
    }
}