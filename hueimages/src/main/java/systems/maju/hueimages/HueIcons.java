/**
 * Copyright (C) 2017 Julian Eggers
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package systems.maju.hueimages;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;

/**
 * Created by Julian on 01.04.2017.
 */
public class HueIcons {

    public static Drawable getIcon(Context context, String uniqueId) {
        switch (uniqueId) {

            //LAMPS
            case "LLC014":
                return ContextCompat.getDrawable(context, R.drawable.ic_aura);

            case "HBL001":
            case "HBL002":
            case "HBL003":
                return ContextCompat.getDrawable(context, R.drawable.ic_beyond_ceiling_pendant_table);

            case "LCT002":
                return ContextCompat.getDrawable(context, R.drawable.ic_br30);

            case "LCT011":
            case "LTW011":
                return ContextCompat.getDrawable(context, R.drawable.ic_br30_slim);

            case "LDF002":
            case "LTF002":
            case "LTF001":
            case "LTC001":
            case "LTC002":
            case "LDF001":
                return ContextCompat.getDrawable(context, R.drawable.ic_ceiling_square);

            case "HEL001":
            case "HEL002":
                return ContextCompat.getDrawable(context, R.drawable.ic_entity);

            case "LDD002":
                return ContextCompat.getDrawable(context, R.drawable.ic_floor);

            case "LLC020":
                return ContextCompat.getDrawable(context, R.drawable.ic_go);

            case "LCT003":
                return ContextCompat.getDrawable(context, R.drawable.ic_gu10);

            case "LTW013":
                return ContextCompat.getDrawable(context, R.drawable.ic_gu10_perfectfit);

            case "HIL001":
            case "HIL002":
                return ContextCompat.getDrawable(context, R.drawable.ic_impulse);

            case "LLC006":
            case "LLC010":
                return ContextCompat.getDrawable(context, R.drawable.ic_iris);

            case "SML001":
                return ContextCompat.getDrawable(context, R.drawable.ic_motion_sensor);

            case "LTP001":
                return ContextCompat.getDrawable(context, R.drawable.ic_pendant_oval);

            case "HML001":
            case "HML002":
            case "HML003":
            case "HML004":
            case "HML005":
                return ContextCompat.getDrawable(context, R.drawable.ic_phoenix_ceiling_pendant_table_wall);

            case "HML006":
                return ContextCompat.getDrawable(context, R.drawable.ic_phoenix_down);

            case "LLC013":
                return ContextCompat.getDrawable(context, R.drawable.ic_storylight);

            case "LDD001":
                return ContextCompat.getDrawable(context, R.drawable.ic_table);

            case "SWT001":
                return ContextCompat.getDrawable(context, R.drawable.ic_tap);

            case "LCT001":
            case "LCT007":
            case "LCT010":
            case "LCT014":
            case "LTW010":
            case "LTW001":
            case "LTW004":
            case "LTW015":
            case "LWB004":
            case "LWB006":
                return ContextCompat.getDrawable(context, R.drawable.ic_white_and_color_e27_b22);

            case "LWB010":
            case "LWB014":
                return ContextCompat.getDrawable(context, R.drawable.ic_white_e27_b22);

            case "LST001":
            case "LST002":
                return ContextCompat.getDrawable(context, R.drawable.ic_lightstrip);

            case "LLC005":
            case "LLC011":
            case "LLC012":
            case "LLC007":
                return ContextCompat.getDrawable(context, R.drawable.ic_bloom);

            case "LTP002":
            case "LTD003":
                return ContextCompat.getDrawable(context, R.drawable.ic_pendant_round);

            case "LTP003":
                return ContextCompat.getDrawable(context, R.drawable.ic_pendant_square);

            case "LTC003":
            case "LTD001":
            case "LTD002":
                return ContextCompat.getDrawable(context, R.drawable.ic_ceiling_round);

            case "LDT001":
            case "MWM001":
                return ContextCompat.getDrawable(context, R.drawable.ic_recessed);

            case "RWL021":
                return ContextCompat.getDrawable(context, R.drawable.ic_hds);

            //ROOMS:
            case "CLASS_LIVING_ROOM":
                return ContextCompat.getDrawable(context, R.drawable.ic_living);

            case "CLASS_GYM":
                return ContextCompat.getDrawable(context, R.drawable.ic_gym);

            case "CLASS_KIDS_BEDROOM":
                return ContextCompat.getDrawable(context, R.drawable.ic_kids_bedroom);

            case "CLASS_HALLWAY":
                return ContextCompat.getDrawable(context, R.drawable.ic_hallway);

            case "CLASS_OFFICE":
                return ContextCompat.getDrawable(context, R.drawable.ic_office);

            case "CLASS_GARAGE":
                return ContextCompat.getDrawable(context, R.drawable.ic_garage);

            case "CLASS_KITCHEN":
                return ContextCompat.getDrawable(context, R.drawable.ic_kitchen);

            case "CLASS_OTHER":
                return ContextCompat.getDrawable(context, R.drawable.ic_other);

            case "CLASS_FRONT_DOOR":
                return ContextCompat.getDrawable(context, R.drawable.ic_frontdoor);

            case "CLASS_RECREATION":
                return ContextCompat.getDrawable(context, R.drawable.ic_recreation);

            case "CLASS_BATHROOM":
                return ContextCompat.getDrawable(context, R.drawable.ic_bathroom);

            case "CLASS_TERRACE":
                return ContextCompat.getDrawable(context, R.drawable.ic_terrace);

            case "CLASS_GARDEN":
                return ContextCompat.getDrawable(context, R.drawable.ic_garden);

            case "CLASS_TOILET":
                return ContextCompat.getDrawable(context, R.drawable.ic_toilet);

            case "CLASS_NURSERY":
                return ContextCompat.getDrawable(context, R.drawable.ic_nursery);

            case "CLASS_BEDROOM":
                return ContextCompat.getDrawable(context, R.drawable.ic_bedroom);

            case "CLASS_CARPORT":
                return ContextCompat.getDrawable(context, R.drawable.ic_carport);

            case "CLASS_DRIVEWAY":
                return ContextCompat.getDrawable(context, R.drawable.ic_driveway);

            case "CLASS_DINING":
                return ContextCompat.getDrawable(context, R.drawable.ic_dining);

            case "CLASS_HOUSE":
                return ContextCompat.getDrawable(context, R.drawable.ic_house);

            //Default Group
            case "HUE_GROUP":
                return ContextCompat.getDrawable(context, R.drawable.ic_hue_group);

            //Default SCENE
            case "HUE_SCENE":
                return ContextCompat.getDrawable(context, R.drawable.ic_hue_scene);


            // PUSHLINK
            case "pushlink_bridgev1":
                return ContextCompat.getDrawable(context, R.drawable.ic_pushlink_bridgev1);

            case "pushlink_bridgev2":
                return ContextCompat.getDrawable(context, R.drawable.ic_pushlink_bridgev2);

            // Bridge
            case "BSB001":
                return ContextCompat.getDrawable(context, R.drawable.ic_bridge_v1);

            case "BSB002":
                return ContextCompat.getDrawable(context, R.drawable.ic_bridge_v2);

            default:
                return ContextCompat.getDrawable(context, R.drawable.ic_white_and_color_e27_b22);

        }
    }

}
