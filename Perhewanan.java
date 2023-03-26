package Modul2;

import java.util.ArrayList;

public class Perhewanan {
    public static void main(String[] args) {
        ArrayList<String> objekHewan = new ArrayList<>();
        ArrayList<String> deleteHewan = new ArrayList<>();
        objekHewan.add("Sapi");
        objekHewan.add("Kelinci");
        objekHewan.add("Kambing");
        objekHewan.add("Unta");
        objekHewan.add("Domba");
        System.out.println("Hewan: " +objekHewan);

        deleteHewan.add("Kelinci");
        deleteHewan.add("Kambing");
        deleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus: " +deleteHewan);

        objekHewan.removeAll(deleteHewan);
        System.out.println("Output Hewan: " +objekHewan);

    }
}
