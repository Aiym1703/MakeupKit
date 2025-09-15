public class MakeupDirector {


    public MakeupKit createMinimalKit(MakeupKitBuilder builder) {
        builder.addMascara("Maybelline Sky High");
        builder.addLipstick("Dior Lip Maximizer 01");
        builder.addFoundation("Estee Lauder Double Wear");
        return builder.build();
    }


    public MakeupKit createFullKit(MakeupKitBuilder builder) {
        builder.addSPF("Centella skin 1004");
        builder.addFoundation("Estee Lauder Double Wear");
        builder.addConcealer("Sen Sulu Concealer Milk Beige");
        builder.addMascara("Maybelline Sky High");
        builder.addEyeLiner("Sen Sulu Black");
        builder.addLipstick("Dior Lip Maximizer");
        builder.addLipLiner("Kiko Milano 34");
        builder.addBlush("Charlotte Tilbury Pillow Talk");
        builder.addEyeshadow("Charlotte Tilbury Exaggereyes");
        builder.addHighlighter("Rare Beauty Liquid Highlighter");
        builder.addSettingSpray("Charlotte Tilbury Shine");
        return builder.build();
    }
}
