class FireFlowerDecorator extends MarioDecorator {
    public FireFlowerDecorator(MarioComponent mario) {
        super(mario);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Mario peut lancer des boules de feu !");
    }
}