class Room {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("półka stojąca", "czarny", 4);

        Furniture furniture2 = new Furniture("półka wisząca", "biały", 2);

        System.out.println("Nazwa mebla 1: " + furniture1.name + ","
                + " Kolor mebla: " + furniture1.colour + ","
                + " Ilość półek: " + furniture1.quantityShelves);

        System.out.println("Nazwa mebla 2: " + furniture2.name + ","
                + " Kolor mebla: " + furniture2.colour + ","
                + " Ilość półek: " + furniture2.quantityShelves);
    }
}
