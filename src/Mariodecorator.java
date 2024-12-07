class MarioDecorator implements MarioComponent {
    protected MarioComponent mario;

    public MarioDecorator(MarioComponent mario) {
        this.mario = mario;
    }

    @Override
    public void performAction() {
        mario.performAction();
    }
}

