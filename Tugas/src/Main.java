import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> hewan = new ArrayList<>();
        hewan.add("sapi");
        hewan.add("kelinci");
        hewan.add("kambing");
        hewan.add("unta");
        hewan.add("domba");
        System.out.println(hewan);


        List<String> deleteHewan = new ArrayList<>();
        deleteHewan.add("kelinci");
        deleteHewan.add("kambing");
        deleteHewan.add("unta");
        System.out.println("Data hewan yang Dihapus: "+deleteHewan);

        hewan.removeAll(deleteHewan);


        System.out.println("Data hewan yang tersisa: "+hewan);

    }
}
