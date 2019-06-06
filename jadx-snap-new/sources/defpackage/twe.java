package defpackage;

import defpackage.abln.e;

/* renamed from: twe */
public enum twe implements e {
    SEND_TO_GESTURE_TO_REQUEST_HIDE_PREVIEW(twb.ENTER_SEND_TO_PAGE_GESTURE, twb.REQUEST_HIDE_PREVIEW, null, 4),
    SNAP_SAVE(twb.SNAP_SAVE_START, twb.SNAP_SAVE_FINISH, null, 4),
    REQUEST_HIDE_PREVIEW_TO_PREVIEW_HIDDEN(twb.REQUEST_HIDE_PREVIEW, twb.PREVIEW_HIDDEN_ON_DECK, null, 4),
    PREVIEW_HIDDEN_TO_UI_UPDATE(twb.PREVIEW_HIDDEN_ON_DECK, twb.FRAME_RENDERED_AFTER_PREVIEW_HIDDEN, null, 4),
    EXIT_GESTURE_TO_EXIT_REQUEST(twb.EXIT_PREVIEW_GESTURE, twb.REQUEST_HIDE_PREVIEW, null, 4),
    PREVIEW_EXIT_DELAY(twb.EXIT_PREVIEW_GESTURE, twb.FRAME_RENDERED_AFTER_PREVIEW_HIDDEN, ipc.PREVIEW_EXIT_DELAY),
    PREVIEW_TO_SEND_PAGE_DELAY(twb.ENTER_SEND_TO_PAGE_GESTURE, twb.FRAME_RENDERED_AFTER_PREVIEW_HIDDEN, ipc.PREVIEW_TO_SEND_PAGE_DELAY),
    PREVIEW_TO_SEND_PAGE_LOADING_FINISH(twb.ENTER_SEND_TO_PAGE_GESTURE, twb.SENDTO_LOADING_FINISH, ipc.PREVIEW_TO_SENDTO_LOAD_FINISH),
    PREVIEW_TOOL_ENTER_TTI(twb.TOGGLE_PREVIEW_TOOL_GESTURE, twb.PREVIEW_TOOL_READY, ipc.PREVIEW_TOOL_TTI),
    PREVIEW_TOOL_ENTER_TFI(twb.TOGGLE_PREVIEW_TOOL_GESTURE, twb.PREVIEW_TOOL_FIRST_INTERACTION, ipc.PREVIEW_TOOL_TFI),
    CAPTION_TOOL_INIT_TO_TYPEABLE(twb.CAPTION_TOOL_INIT, twb.CAPTION_TOOL_TYPEABLE, ipc.CAPTION_INIT_TO_TYPEABLE_TIME),
    PREVIEW_FILTER_INIT_DELAY(twb.CAMERA_CREATION_DONE, twb.FILTER_CAROUSEL_LOADED, ipc.PREVIEW_FILTER_INIT_DELAY),
    SNAPCUT_PERFORMANCE_METRIC(twb.SNAP_CUT_START, twb.SNAP_CUT_FINISH, ipc.SNAPCUT_PERFORMANCE_METRIC),
    MEDIA_PLAY_DURATION(twb.PLAYER_START, twb.PLAYER_STOP, ipc.MEDIA_PLAY_DURATION),
    MULTI_SNAP_THUMBNAIL(twb.MULTISNAP_THUMBNAIL_GEN_START, twb.MULTISNAP_THUMBNAIL_GEN_END, ipc.MULTI_SNAP_THUMBNAIL),
    MULTI_SNAP_PREVIEW(twb.MULTISNAP_SEGMENT_SWITCH_START, twb.MULTISNAP_SEGMENT_SWITCH_END, ipc.MULTI_SNAP_PREVIEW),
    LOAD_MEMORIES_EDITS_DELAY(twb.LOAD_MEMORIES_EDITS_START, twb.LOAD_MEMORIES_EDITS_END, ipc.LOAD_MEMORIES_EDITS_DELAY),
    PLAYER_STATE_TRANSITION(twb.PLAYER_STATE_TRANSIT_START, twb.PLAYER_STATE_TRANSIT_END, ipc.PLAYER_STATE_TRANSITION),
    PROVIDE_EDIT(null, null, ipc.PROVIDE_EDIT, 3),
    COMPOSE_EDIT(null, null, ipc.COMPOSE_EDIT, 3);
    
    final twb endEvent;
    final ily grapheneMetric;
    final twb startEvent;

    private twe(twb twb, twb twb2, ily ily) {
        this.startEvent = twb;
        this.endEvent = twb2;
        this.grapheneMetric = ily;
    }

    public final String a() {
        return name();
    }
}
