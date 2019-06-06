package defpackage;

import com.snap.identity.api.sharedui.AlphabeticScrollbar;
import java.util.Locale;

/* renamed from: afnc */
public enum afnc {
    ADS(r2),
    AD_FREQUENCY(r3),
    AD_RELEVANCE(r4),
    APP_EXTENSION(r5),
    APP_NAVIGATION(r6),
    APP_STARTUP(r7),
    AV_SUPPORT(r8),
    BATTERY(r8),
    BITMOJI("BITMOJI"),
    BLACK_SNAPS("BLACK_SNAPS"),
    BRO_ADS("BRO_ADS"),
    BRO_AVATAR_HEADER("BRO_AVATAR_HEADER"),
    BRO_CONTENT_QUALITY("BRO_CONTENT_QUALITY"),
    BRO_CUSTOM_STORIES("BRO_CUSTOM_STORIES"),
    BRO_GROUP_STORIES("BRO_GROUP_STORIES"),
    BRO_MAPS_STORIES("BRO_MAPS_STORIES"),
    BRO_ONBOARDING("BRO_ONBOARDING"),
    BRO_STORIES_FEED("BRO_STORIES_FEED"),
    BRO_STORIES_RANKING("BRO_STORIES_RANKING"),
    BRO_STORY_CREATION("BRO_STORY_CREATION"),
    BRO_USER_PROFILE("BRO_USER_PROFILE"),
    CALLING("CALLING"),
    CALLING_PRESENCE("CALLING_PRESENCE"),
    CAMERA("CAMERA"),
    CHAT("CHAT"),
    COGNAC("COGNAC"),
    COMMERCE("COMMERCE"),
    CONTEXT("CONTEXT"),
    DISCOVER("DISCOVER"),
    DISCOVER_FEED("DISCOVER_FEED"),
    DISK_NETWORKING("DISK_NETWORKING"),
    ENGDEFAULT("ENGDEFAULT"),
    ENGINEERING_EDUCATION("ENGINEERING_EDUCATION"),
    FACECRAFT("FACECRAFT"),
    FEED("FEED"),
    FEED_V2("FEED_V2"),
    FILTERS("FILTERS"),
    FRIENDING("FRIENDING"),
    FRIENDS("FRIENDS"),
    FRIENDS_FEED("FRIENDS_FEED"),
    GALLERY("GALLERY"),
    GOOGLE_QUALITY("GOOGLE_QUALITY"),
    HERO_CARD("HERO_CARD"),
    IDT_ACTION_BAR("IDT_ACTION_BAR"),
    IDT_BEST_FRIENDS("IDT_BEST_FRIENDS"),
    IDT_FRIENDING("IDT_FRIENDING"),
    IDT_ONBOARDING("IDT_ONBOARDING"),
    IDT_RECENTS("IDT_RECENTS"),
    IDT_SEARCH("IDT_SEARCH"),
    IDT_SNAPCODE("IDT_SNAPCODE"),
    IDT_STORIES("IDT_STORIES"),
    IDT_STORY_MANAGEMENT("IDT_STORY_MANAGEMENT"),
    IMPALA("IMPALA"),
    LAGUNA("LAGUNA"),
    LENS("LENS"),
    LENS_FACE("LENS_FACE"),
    LENS_WORLD("LENS_WORLD"),
    LOCATION("LOCATION"),
    LOCATION_AROUND_ME("LOCATION_AROUND_ME"),
    LOCATION_CURRENT_PLACE("LOCATION_CURRENT_PLACE"),
    LOGIN("LOGIN"),
    LOGIN_SIGNUP("LOGIN_SIGNUP"),
    MAP("MAP"),
    MEDIA_QUALITY("MEDIA_QUALITY"),
    MEMORIES("MEMORIES"),
    MEMORY_CRASH("MEMORY_CRASH"),
    MES_ADS("MES_ADS"),
    MES_AUTO_ADVANCE("MES_AUTO_ADVANCE"),
    MES_AVATAR_HEADER("MES_AVATAR_HEADER"),
    MES_CHAT_HAMBURGER("MES_CHAT_HAMBURGER"),
    MES_FEED_CELL("MES_FEED_CELL"),
    MES_FRIEND_BITMOJI("MES_FRIEND_BITMOJI"),
    MES_FRIEND_CELL("MES_FRIEND_CELL"),
    MES_FRIEND_RANKINGS("MES_FRIEND_RANKINGS"),
    MES_FRIEND_STORIES("MES_FRIEND_STORIES"),
    MES_GROUP_STORY("MES_GROUP_STORY"),
    MES_MINI_PROFILE("MES_MINI_PROFILE"),
    MES_NOTIFICATIONS("MES_NOTIFICATIONS"),
    MES_ONBOARDING("MES_ONBOARDING"),
    MES_SETTINGS("MES_SETTINGS"),
    MORE_OTHER_STORIES("MORE_OTHER_STORIES"),
    MUSIC("MUSIC"),
    NETWORK("NETWORK"),
    NOTIFICATIONS("NOTIFICATIONS"),
    ONBOARDING("ONBOARDING"),
    ON_DEMAND_GEOFILTER("ON_DEMAND_GEOFILTER"),
    PACMAN("PACMAN"),
    PAYMENTS("PAYMENTS"),
    PAYMENTS_V2("PAYMENTS_V2"),
    PERFORMANCE("PERFORMANCE"),
    PLATFORM("PLATFORM"),
    PLATFORM_TOOLS("PLATFORM_TOOLS"),
    PRESENCE("PRESENCE"),
    PROFILE("PROFILE"),
    PX("PX"),
    RANKING("RANKING"),
    REGISTRATION("REGISTRATION"),
    SCAN("SCAN"),
    SEARCH(AlphabeticScrollbar.a),
    SEARCH_QUALITY("SEARCH_QUALITY"),
    SECURITY("SECURITY"),
    SELF_SERVE_ADS("SELF_SERVE_ADS"),
    SEND_TO("SEND_TO"),
    SETTINGS("SETTINGS"),
    SNAPCRAFT("SNAPCRAFT"),
    SNAPS("SNAPS"),
    SNAP_DOMO("SNAP_DOMO"),
    SNAP_EDITING("SNAP_EDITING"),
    SPECTACLES("SPECTACLES"),
    STICKERS("STICKERS"),
    STORAGE("STORAGE"),
    STORIES("STORIES"),
    SUGGEST("SUGGEST"),
    TOOLS("TOOLS"),
    UI_STICKINESS("UI_STICKINESS"),
    V10("V10"),
    VIP("VIP"),
    UNRECOGNIZED_VALUE("UNRECOGNIZED_VALUE");
    
    private final String value;

    private afnc(String str) {
        this.value = str;
    }

    public static afnc a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return afnc.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
