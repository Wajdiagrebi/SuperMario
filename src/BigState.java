class BigState implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario saute haut.");
    }

    @Override
    public void run() {
        System.out.println("Mario court plus vite.");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario redevient normal !");
    }
}

class InvincibleState implements MarioState {
    @Override
    public void jump() {
        System.out.println("Mario saute avec invincibilité !");
    }

    @Override
    public void run() {
        System.out.println("Mario court sans crainte des ennemis !");
    }

    @Override
    public void takeDamage() {
        System.out.println("Mario est invincible et ne subit aucun dégât !");
    }
}
