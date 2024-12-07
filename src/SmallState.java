class SmallState implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario saute faiblement.");
    }

    @Override
    public void run() {
        System.out.println("Mario court lentement.");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario perd une vie !");
    }
}