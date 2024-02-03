import com.google.gson.Gson;
import java.io.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        /*Database database = new Database();
        database.bigAir = new LinkData();
        database.bigAir.boardUrl = " https://skateparkoftampa.com/product/73487/Flip_Bob_Burnquist_Phoenix_Shield_Deck";
        database.bigAir.wheelsUrl ="https://www.skvot.com/catalog/skateboarding/wheels-for-skateboards-ricta-clouds-white-78a-60mm-00143430";
        database.bigAir.bearingsUrl =" https://bonesbearings.com/bones-reg-swiss-skateboard-bearings-8-pack";
        database.bigAir.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-santa-cruz-black-1-list-00126471";
        database.bigAir.truksUrl = "independed 219";
        //
        database.park = new LinkData();
        database.park.wheelsUrl = "https://odddays.store/shop/kolesa-bones-spf-p5-hawk-t-bone-58mm";
        database.park.boardUrl = " https://www.skatedeluxe.com/en/real-wilkins-oval-8-5-skateboard-deck-blue_p158520";
        database.park.bearingsUrl = "https://www.skvot.com/catalog/skateboarding/bearings-for-skateboards-bones-swiss-ceramic-CB-00008140";
        database.park.truksUrl = " https://www.skvot.com/catalog/skateboarding/suspension-for-skateboarding-thunder-trucks-polished-hollow-ii-149-R9082282";
        database.park.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-m-80-grip-tape-9x33-black-00114803";
        //

        database.street = new LinkData();
        database.street.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-m-80-grip-tape-9x33-black-00114803";
        database.street.boardUrl = "https://bakerskateboards.com/pages/board-construction";
        database.street.wheelsUrl = " https://trepang.co/shop/kolesa-spitfire-f4-99-tablet-natural-55mm";
        database.street.bearingsUrl = "https://www.traektoria.ru/product/1132536_podshipniki-bones-reds/";
        database.street.truksUrl = " https://www.skvot.com/catalog/skateboarding/suspension-for-skateboarding-ace-trucks-33-af-1-polished-00170526";

        //
        String json = new Gson().toJson(database);

        Database fromJson = new Gson().fromJson(json, Database.class);
        System.out.println(json);

        try {
            FileWriter fw = new FileWriter("Database.txt");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        FileReader fr = new FileReader("Database.txt");
        Scanner scanner = new Scanner(fr);
        String json = scanner.nextLine();
        Database database = new Gson().fromJson(json, Database.class);

        System.out.println(database.bigAir.bearingsUrl);
        new WelcomePage();
    }
}