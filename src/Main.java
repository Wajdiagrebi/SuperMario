public class Main {
    public static void main(String[] args) {
        // Utilisation du State
        Mario mario = new Mario();
        mario.jump(); // Mario saute normalement.
        mario.setState(new BigState());
        mario.jump(); // Mario saute haut.
        mario.setState(new InvincibleState());
        mario.takeDamage(); // Mario est invincible et ne subit aucun dégât !

        System.out.println("\n--- Power-ups avec Decorator ---");
        // Utilisation du Decorator
        MarioComponent baseMario = new BaseMario();
        MarioComponent marioWithMushroom = new MushroomDecorator(baseMario);
        MarioComponent marioWithStar = new StarDecorator(marioWithMushroom);
        MarioComponent marioWithFireFlower = new FireFlowerDecorator(marioWithStar);

        marioWithFireFlower.performAction();
    }
}






