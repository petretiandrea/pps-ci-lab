public class Mouse {
    private static final int MAX_HEALTH = 100;
    private static final int DELTA_HEALTH = 10;
    private final String name;
    private int lifeStatus;
    private boolean alive;

    public Mouse(final String name) {
        this.alive = true;
        this.name = name;
        this.lifeStatus = MAX_HEALTH;
    }

    public boolean eat() {
        if(!alive) return false;
        this.lifeStatus -= DELTA_HEALTH;
        this.alive = verifyIsAlive();
        return true;
    }

    public boolean moveRandomly() {
        if(!alive) return false;
        this.lifeStatus += DELTA_HEALTH;
        this.alive = verifyIsAlive();
        return true;
    }

    public boolean isAlive() {
        return alive;
    }

    private boolean verifyIsAlive() {
        return lifeStatus > 0;
    }
}
