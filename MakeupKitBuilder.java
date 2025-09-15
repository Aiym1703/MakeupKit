public interface MakeupKitBuilder {
    void addFoundation(String name);
    void addMascara(String name);
    void addLipstick(String name);
    void addConcealer(String name);
    void addEyeLiner(String name);
    void addLipLiner(String name);
    void addBlush(String name);
    void addEyeshadow(String name);
    void addHighlighter(String name);
    void addSettingSpray(String name);
    void addSPF(String name);
    MakeupKit build();
}
