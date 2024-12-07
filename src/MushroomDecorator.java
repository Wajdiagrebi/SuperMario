class MushroomDecorator extends MarioDecorator {
    public MushroomDecorator(MarioComponent mario) {
        super(mario);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Mario devient grand !");
    }
}

class StarDecorator extends MarioDecorator {
    public StarDecorator(MarioComponent mario) {
        super(mario);
    }

    @Override
    public void performAction() {
        super.performAction();
        System.out.println("Mario est invincible !");
    }
}
