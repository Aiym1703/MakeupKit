public class StandardMakeupKitBuilder implements MakeupKitBuilder {
    private final MakeupKit kit = new MakeupKit();

    @Override
    public void addFoundation(String name) {
        kit.addProduct(new MakeupProduct(name, "Foundation"));
    }

    @Override
    public void addMascara(String name) {
        kit.addProduct(new MakeupProduct(name, "Mascara"));
    }

    @Override
    public void addLipstick(String name) {
        kit.addProduct(new MakeupProduct(name, "Lipstick"));
    }

    @Override
    public void addConcealer(String name) {
        kit.addProduct(new MakeupProduct(name, "Concealer"));
    }

    @Override
    public void addEyeLiner(String name) {
        kit.addProduct(new MakeupProduct(name, "Eye Liner"));
    }

    @Override
    public void addLipLiner(String name) {
        kit.addProduct(new MakeupProduct(name, "Lip Liner"));
    }

    @Override
    public void addBlush(String name) {
        kit.addProduct(new MakeupProduct(name, "Blush"));
    }

    @Override
    public void addEyeshadow(String name) {
        kit.addProduct(new MakeupProduct(name, "Eyeshadow"));
    }

    @Override
    public void addHighlighter(String name) {
        kit.addProduct(new MakeupProduct(name, "Highlighter"));
    }

    @Override
    public void addSettingSpray(String name) {
        kit.addProduct(new MakeupProduct(name, "Setting Spray"));
    }

    @Override
    public void addSPF(String name) {
        kit.addProduct(new MakeupProduct(name, "SPF"));
    }

    @Override
    public MakeupKit build() {
        return kit;
    }
}

