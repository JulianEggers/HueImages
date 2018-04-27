package systems.maju.hueimages;

import android.content.Context;
import android.graphics.drawable.Drawable;

import java.util.LinkedList;
import java.util.List;

public class HueImages {

    public static String getName(Context context, String uniqueId) {
        return HueIconNames.getName(context, uniqueId);
    }

    public static Drawable getIcon(Context context, String uniqueId) {
        return HueIcons.getIcon(context, uniqueId);
    }

    public static List<String> getAllLampIds() {
        LinkedList<String> list = new LinkedList<>();
        list.add("LLC014");
        list.add("HBL001");
        list.add("HBL002");
        list.add("HBL003");
        list.add("LCT002");
        list.add("LCT011");
        list.add("LTW011");
        list.add("LDF002");
        list.add("LTF002");
        list.add("LTF001");
        list.add("LTC001");
        list.add("LTC002");
        list.add("LDF001");
        list.add("HEL001");
        list.add("HEL002");
        list.add("LDD002");
        list.add("LLC020");
        list.add("LCT003");
        list.add("LTW013");
        list.add("HIL001");
        list.add("HIL002");
        list.add("LLC006");
        list.add("LLC010");
        list.add("SML001");
        list.add("LTP001");
        list.add("HML001");
        list.add("HML002");
        list.add("HML003");
        list.add("HML004");
        list.add("HML005");
        list.add("HML006");
        list.add("LLC013");
        list.add("LDD001");
        list.add("SWT001");
        list.add("LCT001");
        list.add("LCT007");
        list.add("LCT010");
        list.add("LCT014");
        list.add("LTW010");
        list.add("LTW001");
        list.add("LTW004");
        list.add("LTW015");
        list.add("LWB004");
        list.add("LWB006");
        list.add("LWB010");
        list.add("LWB014");
        list.add("LST001");
        list.add("LST002");
        list.add("LLC005");
        list.add("LLC011");
        list.add("LLC012");
        list.add("LLC007");
        list.add("LTP002");
        list.add("LTD003");
        list.add("LTP003");
        list.add("LTC003");
        list.add("LTD001");
        list.add("LTD002");
        list.add("LDT001");
        list.add("MWM001");
        list.add("RWL021");
        return list;
    }

    public static List<String> getALlRoomIds() {
        LinkedList<String> list = new LinkedList<>();
        list.add("CLASS_LIVING_ROOM");
        list.add("CLASS_BEDROOM");
        list.add("CLASS_CARPORT");
        list.add("CLASS_DINING");
        list.add("CLASS_DRIVEWAY");
        list.add("CLASS_FRONT_DOOR");
        list.add("CLASS_GARAGE");
        list.add("CLASS_GARDEN");
        list.add("CLASS_GYM");
        list.add("CLASS_HALLWAY");
        list.add("CLASS_KIDS_BEDROOM");
        list.add("CLASS_KITCHEN");
        list.add("CLASS_LIVING_ROOM");
        list.add("CLASS_NURSERY");
        list.add("CLASS_OFFICE");
        list.add("CLASS_OTHER");
        list.add("CLASS_RECREATION");
        list.add("CLASS_TERRACE");
        list.add("CLASS_TOILET");
        return list;
    }

    public static List<String> getAllBridgeIds() {
        LinkedList<String> list = new LinkedList<>();
        list.add("BSB001");
        list.add("BSB002");
        list.add("pushlink_bridgev1");
        list.add("pushlink_bridgev2");
        return list;
    }

    public static List<String> getAllCustomIconIds() {
        LinkedList<String> list = new LinkedList<>();
        list.add("HUE_GROUP");
        return list;
    }
}
