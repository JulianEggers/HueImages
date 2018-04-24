package systems.maju.hueimages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

public class HueIconNames {


    public static String getName(Context context, String uniqueId) {
        switch (uniqueId) {

            //LAMPS
            case "LLC014":
                return context.getResources().getString(R.string.ic_aura);

            case "HBL001":
            case "HBL002":
            case "HBL003":
                return context.getResources().getString(R.string.ic_beyond_ceiling_pendant_table);

            case "LCT002":
                return context.getResources().getString(R.string.ic_br30);

            case "LCT011":
                return context.getResources().getString(R.string.ic_br30);

            case "LTW011":
                return context.getResources().getString(R.string.ic_white_and_color_e27_b22_2);

            case "LDF002":
                return context.getResources().getString(R.string.ic_ceiling_square_1);

            case "LTF002":
            case "LTF001":
            case "LTC001":
            case "LTC002":
                return context.getResources().getString(R.string.ic_ceiling_square_2);

            case "LDF001":
                return context.getResources().getString(R.string.ic_ceiling_squar_3);

            case "HEL001":
            case "HEL002":
                return context.getResources().getString(R.string.ic_entity);

            case "LDD002":
                return context.getResources().getString(R.string.ic_floor);

            case "LLC020":
                return context.getResources().getString(R.string.ic_go);

            case "LCT003":
                return context.getResources().getString(R.string.ic_gu10);

            case "LTW013":
                return context.getResources().getString(R.string.ic_gu10_perfectfit);

            case "HIL001":
            case "HIL002":
                return context.getResources().getString(R.string.ic_impulse);

            case "LLC006":
            case "LLC010":
                return context.getResources().getString(R.string.ic_iris);

            case "SML001":
                return context.getResources().getString(R.string.ic_motion_sensor);

            case "HML001":
            case "HML002":
            case "HML003":
                return context.getResources().getString(R.string.ic_phoenix_ceiling_pendant_table_wall_1);

            case "HML004":
            case "HML005":
                return context.getResources().getString(R.string.ic_phoenix_ceiling_pendant_table_wall_2);

            case "HML006":
                return context.getResources().getString(R.string.ic_phoenix_down);

            case "LLC013":
                return context.getResources().getString(R.string.ic_storylight);

            case "LDD001":
                return context.getResources().getString(R.string.ic_table);

            case "SWT001":
                return context.getResources().getString(R.string.ic_tap);

            case "LCT001":
            case "LCT007":
            case "LCT010":
            case "LCT014":
                return context.getResources().getString(R.string.ic_white_and_color_e27_b22_1);

            case "LTW010":
            case "LTW001":
            case "LTW004":
            case "LTW015":
                return context.getResources().getString(R.string.ic_white_and_color_e27_b22_2);

            case "LWB004":
            case "LWB006":
                return context.getResources().getString(R.string.ic_white_and_color_e27_b22_3);

            case "LWB010":
            case "LWB014":
                return context.getResources().getString(R.string.ic_white_e27_b22);

            case "LST001":
            case "LST002":
                return context.getResources().getString(R.string.ic_lightstrip);

            case "LLC005":
            case "LLC011":
            case "LLC012":
            case "LLC007":
                return context.getResources().getString(R.string.ic_bloom);


            case "LTP001":
            case "LTP002":
            case "LTD003":
                return context.getResources().getString(R.string.ic_pendant_square);

            case "LTC003":
            case "LTD001":
            case "LTD002":
                return context.getResources().getString(R.string.ic_ceiling_square_2);

            case "LDT001":
                return context.getResources().getString(R.string.ic_recessed_1);

            case "MWM001":
                return context.getResources().getString(R.string.ic_recessed_2);

            case "RWL021":
                return context.getResources().getString(R.string.ic_hds);

            //ROOMS:
            case "CLASS_LIVING_ROOM":
                return context.getResources().getString(R.string.group_living_room);

            case "CLASS_GYM":
                return context.getResources().getString(R.string.group_gym);

            case "CLASS_KIDS_BEDROOM":
                return context.getResources().getString(R.string.group_kids_bedroom);

            case "CLASS_HALLWAY":
                return context.getResources().getString(R.string.group_hallway);

            case "CLASS_OFFICE":
                return context.getResources().getString(R.string.group_office);

            case "CLASS_GARAGE":
                return context.getResources().getString(R.string.group_garage);

            case "CLASS_KITCHEN":
                return context.getResources().getString(R.string.group_kitchen);

            case "CLASS_OTHER":
                return context.getResources().getString(R.string.group_other);

            case "CLASS_FRONT_DOOR":
                return context.getResources().getString(R.string.group_front_door);

            case "CLASS_RECREATION":
                return context.getResources().getString(R.string.group_recreation);

            case "CLASS_BATHROOM":
                return context.getResources().getString(R.string.group_bathroom);

            case "CLASS_TERRACE":
                return context.getResources().getString(R.string.group_terrace);

            case "CLASS_GARDEN":
                return context.getResources().getString(R.string.group_garden);

            case "CLASS_TOILET":
                return context.getResources().getString(R.string.group_toilet);

            case "CLASS_NURSERY":
                return context.getResources().getString(R.string.group_nursery);

            case "CLASS_BEDROOM":
                return context.getResources().getString(R.string.group_bedroom);

            case "CLASS_CARPORT":
                return context.getResources().getString(R.string.group_carport);

            case "CLASS_DRIVEWAY":
                return context.getResources().getString(R.string.group_driveway);

            case "CLASS_DINING":
                return context.getResources().getString(R.string.group_dining);

            case "CLASS_HOUSE":
                return context.getResources().getString(R.string.group_house);


            // Bridge
            case "BSB001":
                return context.getResources().getString(R.string.ic_bridge_v1);

            case "BSB002":
                return context.getResources().getString(R.string.ic_bridge_v2);

            default:
                return context.getResources().getString(R.string.unknown);

        }
    }

}
