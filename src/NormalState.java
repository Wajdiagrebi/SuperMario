class NormalState implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario saute normalement.");
    }

    @Override
    public void run() {
        System.out.println("Mario court normalement.");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario devient petit !");
    }
}
