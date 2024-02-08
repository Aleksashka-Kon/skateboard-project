import com.google.gson.Gson;
import java.io.*;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {



    public static void main(String[] args) throws IOException {
        /* PLaceToSkate pLaceToSkate = new PLaceToSkate();
        PLaceToSkate.place = new LinkData();*/


        DatabaseBig_Air databaseBig_Air = new DatabaseBig_Air();
        DatabaseBig_Air.bigAir = new LinkData();
        DatabaseBig_Air.bigAir.boardUrl = " https://skateparkoftampa.com/product/73487/Flip_Bob_Burnquist_Phoenix_Shield_Deck";
        DatabaseBig_Air.bigAir.wheelsUrl ="https://www.skvot.com/catalog/skateboarding/wheels-for-skateboards-ricta-clouds-white-78a-60mm-00143430";
        DatabaseBig_Air.bigAir.bearingsUrl =" https://bonesbearings.com/bones-reg-swiss-skateboard-bearings-8-pack";
        DatabaseBig_Air.bigAir.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-santa-cruz-black-1-list-00126471";
        DatabaseBig_Air.bigAir.truksUrl = "independed 219";
        //
        DatabasePark databasePark = new DatabasePark();
        DatabasePark.park = new LinkData();
        DatabasePark.park.wheelsUrl = "https://odddays.store/shop/kolesa-bones-spf-p5-hawk-t-bone-58mm";
        DatabasePark.park.boardUrl = " https://www.skatedeluxe.com/en/real-wilkins-oval-8-5-skateboard-deck-blue_p158520";
        DatabasePark.park.bearingsUrl = "https://www.skvot.com/catalog/skateboarding/bearings-for-skateboards-bones-swiss-ceramic-CB-00008140";
        DatabasePark.park.truksUrl = " https://www.skvot.com/catalog/skateboarding/suspension-for-skateboarding-thunder-trucks-polished-hollow-ii-149-R9082282";
        DatabasePark.park.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-m-80-grip-tape-9x33-black-00114803";
        //

        DatabaseStreet databaseStreet = new DatabaseStreet();
        DatabaseStreet.street = new LinkData();
        DatabaseStreet.street.gripUrl = "https://www.skvot.com/catalog/skateboarding/skin-for-skateboarding-mobgrip-m-80-grip-tape-9x33-black-00114803";
        DatabaseStreet.street.boardUrl = "https://bakerskateboards.com/pages/board-construction";
        DatabaseStreet.street.wheelsUrl = " https://trepang.co/shop/kolesa-spitfire-f4-99-tablet-natural-55mm";
        DatabaseStreet.street.bearingsUrl = "https://www.traektoria.ru/product/1132536_podshipniki-bones-reds/";
        DatabaseStreet.street.truksUrl = " https://www.skvot.com/catalog/skateboarding/suspension-for-skateboarding-ace-trucks-33-af-1-polished-00170526";

        DatabasePlace.place = new LinkData();



        //
        /*String jsonPark = new Gson().toJson(databasePark.park);

       DatabasePark fromJson = new Gson().fromJson(jsonPark, DatabasePark.class);
        System.out.println(jsonPark);*/

        /*try {
            FileWriter fw = new FileWriter("DatabasePark.txt");
            fw.write(jsonPark);
            fw.close();
            /*FileReader fr = new FileReader("DatabasePark.txt");
            Scanner scanner = new Scanner(fr);
            json = scanner.nextLine();
            databasePark = new Gson().fromJson(json, DatabasePark.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

         FileReader fr = new FileReader("DatabasePark.txt");
        Scanner scanner = new Scanner(fr);
        jsonPark = scanner.nextLine();
        databasePark = new Gson().fromJson(jsonPark, DatabasePark.class);

        String jsonStreet = new Gson().toJson(databaseStreet.street);
        try{
            FileWriter fw1 = new FileWriter("DatabaseStreet.txt");
            fw1.write(jsonStreet);
            fw1.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        String jsonBig_Air = new Gson().toJson(databaseBig_Air.bigAir);
        try{
            FileWriter fw2 = new FileWriter("DatabaseBigAir.txt");
            fw2.write(jsonBig_Air);
            fw2.close();
        } catch (IOException e){
            throw new RuntimeException(e);
        }

*/
        new WelcomePage();

    }
}