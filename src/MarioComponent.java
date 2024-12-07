interface MarioComponent {
    void performAction();
}

// Classe de base Mario
class BaseMario implements MarioComponent {
    @Override
    public void performAction() {
        System.out.println("Mario agit normalement.");
    }
}