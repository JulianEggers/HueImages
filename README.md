# HueImages

HueImages is an android library for receiving the officially provided images for Philips Hue products.

The Images can be downloaded at: https://developers.meethue.com/documentation/icon-pack.

## Included
- [x] Products filled
- [ ] Products outline
- [x] Push-link
- [x] Rooms

## Import
In **`build.gradle`** (Module):

```
compile 'systems.maju:hueimages:0.8'
```

## Usage

Receiving an image in xml:
#### XML
```xml
<ImageView
    ...
    app:srcCompat="@drawable/'Drawable Name'" //'Drawable Name' value from table below
/>
```

Receiving the image of a lamp/group in xml:
#### XML
```xml
<ImageView
    ...
    app:srcCompat="@drawable/ic_garage"
/>
```
If this library is added to the project the drawables can be accessed via the drawable names as provided in the table below.

#### JAVA
Receiving an image:
```java
Drawable drawable = HueImages.getIcon(context, "Identifier"); //'Identifier' value from table below
```

Receiving the image of a light:
```java
Drawable drawable = HueImages.getIcon(context, phLight.getModelNumber());
```

Receiving the image of a group(room):
```java
Drawable drawable = HueImages.getIcon(context, phGroup.getGroupClass().name());
```
This only works if the class of the groups was set and is either one of the group names listed below.
The official Philips Hue Apps are creating groups using this names.

Receive the english name of the light:
```java
Drawable drawable = HueImages.getName(context, "identifier"); //'Identifier' value from table below
```

Receive the IDs ("identifier") of all lamps provided by Philips:
```java
List<String> lampIds = HueImages.getAllLampIds();
```
If you only want those lamp ids with unique icon you can use this call:
```java
List<String> lampIdsWithUniqueIcon = HueImages.getAllLampIds(true);
```

Receive the IDs ("identifier") of all room images provided by Philips:
```java
List<String> roomIds =  HueImages.getALlRoomIds();
```

Receive the IDs ("identifier") of all bridge images provided by Philips:
```java
List<String> bridgeIds =  HueImages.getALlBridgeIds();
```

### Colors
This library does not provide images in different colors since you can change colors with android by setting a tint:

#### XML
```xml
<ImageView
    ...
    android:tint="@color/your_color"
/>
```
#### JAVA
```java
imageView.setColorFilter(ContextCompat.getColor(context, R.color.your_color));
```

## Image List

This list contains all images that are provided by this library:

| Identifiers                                                           | Drawable Name                         |
| ----------------------------------------------------------------------| --------------------------------------|
| **Lamps**                                                             |                                       |
| LLC014                                                                | ic_aura                               |
| HBL001 HBL002 HBL003                                                  | ic_beyond_ceiling_pendant_table       |
| LCT002                                                                | ic_br30                               |
| LCT011 LTW011                                                         | ic_br30_slim                          |
| LDF002 LTF002 LTF001 LTC001 LTC002 LDF001                             | ic_ceiling_square                     |
| HEL001 HEL002                                                         | ic_entity                             |
| LDD002                                                                | ic_floor                              |
| LLC020                                                                | ic_go                                 |
| LCT003                                                                | ic_gu10                               |
| LTW013                                                                | ic_gu10_perfectfit                    |
| HIL001 HIL002                                                         | ic_impulse                            |
| LLC006 LLC010                                                         | ic_iris                               |
| SML001                                                                | ic_motion_sensor                      |
| LTP001                                                                | ic_pendant_oval                       |       
| HML001 HML002 HML003 HML004 HML005                                    | ic_phoenix_ceiling_pendant_table_wall |
| HML006                                                                | ic_phoenix_down                       |
| LLC013                                                                | ic_storylight                         |
| LDD001                                                                | ic_table                              |
| SWT001                                                                | ic_tap                                |
| LCT001 LCT007 LCT010 LCT014 LTW010 LTW001 LTW004 LTW015 LWB004 LWB006 | ic_white_and_color_e27_b22            |        
| LWB010 LWB014                                                         | ic_white_e27_b22                      |
| LST001 LST002                                                         | ic_lightstrip                         |
| LLC005 LLC011 LLC012 LLC007                                           | ic_bloom                              |
| LTP002 LTD003                                                         | ic_pendant_round                      |
| LTP003                                                                | ic_pendant_square                     |
| LTC003 LTD001 LTD002                                                  | ic_ceiling_round                      |
| LDT001 MWM001                                                         | ic_recessed                           |
| RWL021                                                                | ic_hds                                |
|                                                                       |                                       |
| **Rooms**                                                             |                                       |
| CLASS_LIVING_ROOM                                                     | ic_living                             |
| CLASS_GYM                                                             | ic_gym                                |
| CLASS_KIDS_BEDROOM                                                    | ic_kids_bedroom                       |
| CLASS_HALLWAY                                                         | ic_hallway                            |
| CLASS_OFFICE                                                          | ic_office                             |
| CLASS_GARAGE                                                          | ic_garage                             |
| CLASS_KITCHEN                                                         | ic_kitchen                            |
| CLASS_OTHER                                                           | ic_other                              |
| CLASS_FRONT_DOOR                                                      | ic_frontdoor                          |
| CLASS_RECREATION                                                      | ic_recreation                         |
| CLASS_BATHROOM                                                        | ic_bathroom                           |
| CLASS_TERRACE                                                         | ic_terrace                            |
| CLASS_GARDEN                                                          | ic_garden                             |
| CLASS_TOILET                                                          | ic_toilet                             |
| CLASS_NURSERY                                                         | ic_nursery                            |
| CLASS_BEDROOM                                                         | ic_bedroom                            |
| CLASS_CARPORT                                                         | ic_carport                            |
| CLASS_DRIVEWAY                                                        | ic_driveway                           |
| CLASS_DINING                                                          | ic_dining                             |
| CLASS_HOUSE                                                           | ic_house                              |
|                                                                       |                                       |
| **Pushlink**                                                          |                                       |
| pushlink_bridgev1                                                     | ic_pushlink_bridgev1                  |
| pushlink_bridgev2                                                     | ic_pushlink_bridgev2                  |
|                                                                       |                                       |
| **Bridge**                                                            |                                       |
| BSB001                                                                | ic_bridge_v1                          |
| BSB002                                                                | ic_bridge_v2                          |
|                                                                       |                                       |
| **Custom Hue Images**                                                 |                                       |
| HUE_GROUP                                                             | ic_hue_group                          |
| HUE_SCENE                                                             | ic_hue_scene                          |




The 'Drawable Names' can be found associated to an image in the icon_pack_2.0.
The icon pack is officially provided by [Philips](https://developers.meethue.com/documentation/icon-pack)
or can be found in this [repository](/icon_pack_2.0/).
Custom Hue Icons are special icons not provided by Philips. 
They underlay the no special license as far as not explicitly stated different.

## Rights
"It is only allowed to use these images in combination with Hue products, and no other projects."

All rights of the provided images are reserved by Philips Electronics N.V.

## License

Copyright 2017 Julian Eggers

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
