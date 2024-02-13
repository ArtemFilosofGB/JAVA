package OOP.Seminare01;

public class Main {
    public static void main(String[] args) {
        VendingMashineBotlOfWater mashine = new VendingMashineBotlOfWater();
        mashine.addBotlofWater(new BotlOfWater("Ессентуки", 100, 1));
        mashine.addBotlofWater(new BotlOfWater("Нарзан", 100, 1));
        mashine.addBotlofWater(new BotlOfWater("Буратино", 200, 2.5));


        mashine.addBotlofWater(new HotDrink("Чай", 250, 0.5, 70));
        mashine.addBotlofWater(new HotDrink("Чай", 255, 0.55, 75));
        mashine.addBotlofWater(new HotDrink("Кофе", 350, 0.5));
        mashine.addBotlofWater(new HotDrink("Какао", 350, 0.4));

        System.out.println("mashine:\n" + mashine);
        System.out.println("mashine.getProduct(\"Чай\") = " + mashine.getProduct("Чай"));
        System.out.println("mashine.getProduct(\"Ессентуки\") = " + mashine.getProduct("Ессентуки"));

        VendingMashineHotDrink mashineHotDrink = new VendingMashineHotDrink();
        mashineHotDrink.addHotDrink(new HotDrink("Горячий чай", 370, 0.5, 70));
        mashineHotDrink.addHotDrink(new HotDrink("Горячий кофе", 470, 0.6, 65));
        mashineHotDrink.addHotDrink(new HotDrink("Горячее какао", 570, 0.7));

        System.out.println("mashineHotDrink = \n" + mashineHotDrink);
        System.out.println("mashineHotDrink.getProduct(\"Горячий кофе\") = " + mashineHotDrink.getProduct("Горячий кофе"));//Поиск по имени
        System.out.println("mashineHotDrink.getProduct(370) = " + mashineHotDrink.getProduct(570)); //Поиск по стоимости
        System.out.println("mashineHotDrink.getProduct(\"Горячий кофе\",470,0.6) = " + mashineHotDrink.getProduct("Горячий кофе", 470, 0.6));//Поиск по 3м параметрам перегруженный метод getProduct реализован на Product

        printGetProduct(mashine, "Чай");//Найти(Чай) = HotDrink{name = Чай  cost = 250  volume = 0.5 temperature=70}
        printGetProduct(mashineHotDrink, "Чай");//Найти(Чай) = null Чай отсутствует в mashineHotDrink

    }

    /**
     * Поиск продукта внутри машины
     * @param vendingMashine
     * @param name
     */
    public static void printGetProduct(VendingMashine vendingMashine, String name) {
        System.out.println("Найти(" + name + ") = " + vendingMashine.getProduct(name));
    }
}
