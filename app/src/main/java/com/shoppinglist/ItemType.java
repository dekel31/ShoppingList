package com.shoppinglist;

import android.util.Pair;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.shoppinglist.Category.*;
import static com.shoppinglist.Expiration.*;
import static com.shoppinglist.Market.*;
import static com.shoppinglist.Section.*;
import static com.shoppinglist.UseInterval.*;

/**
 * Created by dekel31 on 12/3/2016.
 */
public class ItemType {
    private String description;
    private String name;
    private String displayName;
    private int defaultQuantity;
    private Set<Pair<Market, Integer>> marketsAndPrice;
    private Section section;
    private Category category;
    private UseInterval useInterval;
    private Expiration expiration;
    private float defaultServings;

    public ItemType(String name, String displayName, int defaultQuantity, Set<Pair<Market, Integer>> marketsAndPrice, Section section, Category category, UseInterval useInterval, Expiration expiration) {
        this.name = name;
        this.displayName = displayName;
        this.defaultQuantity = defaultQuantity;
        this.marketsAndPrice = marketsAndPrice;
        this.section = section;
        this.category = category;
        this.useInterval = useInterval;
        this.expiration = expiration;

    }

    public ItemType(String name, String displayName, String description, int defaultQuantity, Set<Pair<Market, Integer>> marketsAndPrice, Section section, Category category, UseInterval useInterval, Expiration expiration, float defaultServings) {
        new ItemType(name, displayName, defaultQuantity, marketsAndPrice, section, category, useInterval, expiration, defaultServings);
        this.description = description;
    }

    public ItemType(String name, String displayName, int defaultQuantity, Set<Pair<Market, Integer>> marketsAndPrice, Section section, Category category, UseInterval useInterval, Expiration expiration, float defaultServings) {
        new ItemType(name, displayName, defaultQuantity, marketsAndPrice, section, category, useInterval, expiration);
        this.defaultServings = defaultServings;
    }

    public static void main(String[] args) {
        List<ItemType> itemTypes = new ArrayList<>();


        itemTypes.add(new ItemType("Adammame", "אדממה", 1, buildMarketAndPrice(new Market[]{SHUFERSAL}, new int[]{10}), FREEZER, INSTANT, BI_WWEKLY, YEAR, 2));
        itemTypes.add(new ItemType("Rice", "אורז", "לבן או מלא", 1, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{10, 10}), CEREAL, TWENTY_MINUTES, ONCE_A_WEEK, YEAR, 10));
        itemTypes.add(new ItemType("Eggs", "ביצים", 12, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{12, 12}), EGGS, TEN_MINUTES, ONCE_A_WEEK, MONTH, 6));
        itemTypes.add(new ItemType("Bamba", "במבה", 1, buildMarketAndPrice(new Market[]{SHUFERSAL}, new int[]{4}), SNACKS, INSTANT, ONCE_A_WEEK, YEAR, 1));
        itemTypes.add(new ItemType("Onion", "בצל", 4, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{4, 4}), VEGETABLES, COOKING_INGIRIDIENT, BI_MONTHLY, TWO_WEEKS));
//        itemTypes.add(new ItemType("Cheese", "גבנץ", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
//        itemTypes.add(new ItemType("Grisini", "גריסיני", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Nuts", "פיצוחים", "גרעינים שחורים לבנים פיסטוק אגוזי מלך", 700, buildMarketAndPrice(new Market[]{FLEA_MARKET}, new int[]{27}), NUTS, INSTANT, BI_WWEKLY, YEAR, ));
        itemTypes.add(new ItemType("Syria Olives", "זיתים סורים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Olive Rings", "זיתים טבעות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Butter", "חמאה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Peanut Butter", "חמאת בוטנים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Tuna", "טונה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Tehini", "טחינה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Olive spread", "טפנד זיתים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Goat Yogurt", "יוגורט עיזים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Sour cream", "גבינה לבנה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("read", "לחם", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Lemon", "לימון", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Matbuha", "מטבוחה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Tomato spread", "ממרח עגבניות מיובשות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Celery", "סלרי", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Tomatoes", "עגבניות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Cucumber", "מלפפונים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Apples", "תפוחים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Lentils", "עדשים", "ירוקות כתומות שחורות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Amba", "עמבה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Parsley", "פטרוזיליה כוסברה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Prichoniot", "פריכוניות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Cottage Cheese", "קוטג'", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Special flour", "קמח מיוחד", "חומוס או עדשים כתומות", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Garlic", "שום כתוש", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Chocolate", "שוקולד מריר", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Olive Oil", "שמן זית", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Sour cream", "שמנת חמוצה", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Spices", "תבליינים", "פפריקה מתוקה, אורגנו, כמון", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Dates", "תמרים לחים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Dates", "תמרים", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Rice Noodles", "אטריות אורז", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Scallion", "בצל ירוק", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
        itemTypes.add(new ItemType("Potatoes", "תפוא", 30, buildMarketAndPrice(new Market[]{FLEA_MARKET, SHUFERSAL}, new int[]{30, 35}), HEALTH, INSTANT, BI_MONTHLY, YEAR));
    }

    private static Set<Pair<Market, Integer>> buildMarketAndPrice(Market[] markets, int[] prices) {
        HashSet<Pair<Market, Integer>> marketsAndPrice = new HashSet<>();
        for (int i = 0; i < markets.length; i++) {
            marketsAndPrice.add(new Pair<>(markets[i], prices[i]));
        }
        return marketsAndPrice;
    }
}
