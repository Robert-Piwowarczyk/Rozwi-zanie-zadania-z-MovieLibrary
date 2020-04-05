class InfoAboutDrink {
    public static void main(String[] args) {
        Drink tropical = new Drink();
        tropical.name = "Tropikalny";
        tropical.price = 15.50;
        tropical.yesOrNoAlcohol = true;

        Component juice = new Component();
        juice.name = "Tonic";
        juice.qantity = 40;

        Component gin = new Component();
        gin.name = "Gin";
        gin.qantity = 30;

        Component syrup = new Component();
        syrup.name = "Syrop";
        syrup.qantity = 30;

        Drink rainbowPineapple = new Drink();
        rainbowPineapple.name = "Tęczowy Ananas";
        rainbowPineapple.price = 9.80;
        rainbowPineapple.yesOrNoAlcohol = false;

        Component grapefruit = new Component();
        grapefruit.name = "Grejpfrut";
        grapefruit.qantity = 80;

        Component pineapple = new Component();
        pineapple.name = "Ananas";
        pineapple.qantity = 60;

        Component blueCuracao = new Component();
        blueCuracao.name = "Bezalkoholowy Blue Curacao";
        blueCuracao.qantity = 40;

        System.out.println("nazwa: " + tropical.name + ", "
                + "cena: " + tropical.price + "zł" + ", "
                + "zawiera alkohol: " + tropical.yesOrNoAlcohol + ", "
                + "składnik 1: " + juice.name + " " + juice.qantity + "ml" + ", "
                + "składnik 2: " + gin.name + " " + gin.qantity + "ml" + ", "
                + "składnik 3: " + syrup.name + " " + syrup.qantity + "ml" + ", "
                + "pojemność drinka: " + (juice.qantity + gin.qantity + syrup.qantity)
                + "ml");

        System.out.println("nazwa: " + rainbowPineapple.name + ", "
                + "cena: " + rainbowPineapple.price + "zł" + ", "
                + "zawiera alkohol: " + rainbowPineapple.yesOrNoAlcohol + ", "
                + "składnik 1: " + grapefruit.name + " " + grapefruit.qantity + "ml" + ", "
                + "składnik 2: " + pineapple.name + " " + pineapple.qantity + "ml" + ", "
                + "składnik 3: " + blueCuracao.name + " " + blueCuracao.qantity + "ml" + ", "
                + "pojemność drinka: " + (grapefruit.qantity + pineapple.qantity + blueCuracao.qantity)
                + "ml");
    }
}
