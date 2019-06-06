package com.snap.messaging.createchat.dagger;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageButton;
import com.snap.messaging.createchat.ui.view.CreateChatRecipientBarView;
import com.snap.ui.deck.MainPageFragment;
import com.snapchat.android.R;
import defpackage.achb;
import defpackage.achi;
import defpackage.ahbd;
import defpackage.aipx;
import defpackage.ajei;
import defpackage.ajej;
import defpackage.ajfb;
import defpackage.ajvv;
import defpackage.akcr;
import defpackage.qqo;
import defpackage.qqq;
import defpackage.zgb;
import defpackage.zhh;
import defpackage.zjk;
import defpackage.zjm;
import defpackage.zkq;
import xyz.danoz.recyclerviewfastscroller.vertical.VerticalRecyclerViewFastScroller;

public final class CreateChatFragment extends MainPageFragment {
    public zkq a;
    public achb<zjm, zjk> b;
    public zgb c;
    public defpackage.qqw.a d;
    qqo e;
    qqq f;
    private RecyclerView g;
    private VerticalRecyclerViewFastScroller h;
    private View i;
    private View j;
    private ImageButton k;
    private CreateChatRecipientBarView l;
    private View m;
    private defpackage.qqk.a n;
    private View o;
    private ajei p;
    private zhh q;

    public static final class a {
        public qqo a;
        private qqq b;

        public final a a(qqq qqq) {
            akcr.b(qqq, "preselectedRecipients");
            this.b = qqq;
            return this;
        }

        public final CreateChatFragment a() {
            CreateChatFragment createChatFragment = new CreateChatFragment();
            createChatFragment.e = this.a;
            createChatFragment.f = this.b;
            return createChatFragment;
        }
    }

    static final class b implements OnClickListener {
        private /* synthetic */ CreateChatFragment a;

        b(CreateChatFragment createChatFragment) {
            this.a = createChatFragment;
        }

        public final void onClick(View view) {
            FragmentActivity activity = this.a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    static final class c<T> implements ajfb<Rect> {
        private /* synthetic */ CreateChatFragment a;

        c(CreateChatFragment createChatFragment) {
            this.a = createChatFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            Rect rect = (Rect) obj;
            LayoutParams layoutParams = CreateChatFragment.a(this.a).getLayoutParams();
            layoutParams.height = rect.bottom;
            CreateChatFragment.a(this.a).setLayoutParams(layoutParams);
            layoutParams = CreateChatFragment.b(this.a).getLayoutParams();
            layoutParams.height = rect.top;
            CreateChatFragment.b(this.a).setLayoutParams(layoutParams);
        }
    }

    static final class d<T> implements ajfb<Integer> {
        private /* synthetic */ CreateChatFragment a;

        d(CreateChatFragment createChatFragment) {
            this.a = createChatFragment;
        }

        public final /* synthetic */ void accept(Object obj) {
            obj = (Integer) obj;
            View c = CreateChatFragment.c(this.a);
            LayoutParams layoutParams = CreateChatFragment.c(this.a).getLayoutParams();
            akcr.a(obj, "it");
            layoutParams.height = obj.intValue();
            c.setLayoutParams(layoutParams);
        }
    }

    public static final /* synthetic */ View a(CreateChatFragment createChatFragment) {
        View view = createChatFragment.j;
        if (view == null) {
            akcr.a("navbarInset");
        }
        return view;
    }

    public static final /* synthetic */ View c(CreateChatFragment createChatFragment) {
        View view = createChatFragment.o;
        if (view == null) {
            akcr.a("keyboardPlaceHolder");
        }
        return view;
    }

    public final void a_(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.a_(achi);
        defpackage.qqk.a aVar = this.n;
        if (aVar == null) {
            akcr.a("createChatPresenter");
        }
        aVar.b();
    }

    public final void b(achi<zjm, zjk> achi) {
        akcr.b(achi, "navigationEvent");
        super.b((achi) achi);
        defpackage.qqk.a aVar = this.n;
        if (aVar == null) {
            akcr.a("createChatPresenter");
        }
        aVar.c();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        akcr.b(layoutInflater, "inflater");
        aipx.a(this);
        this.p = new ajei();
        View inflate = layoutInflater.inflate(R.layout.fragment_create_chat, viewGroup, false);
        Object findViewById = inflate.findViewById(R.id.recycler_view);
        akcr.a(findViewById, "view.findViewById(R.id.recycler_view)");
        this.g = (RecyclerView) findViewById;
        findViewById = inflate.findViewById(R.id.fast_scroller);
        akcr.a(findViewById, "view.findViewById(R.id.fast_scroller)");
        this.h = (VerticalRecyclerViewFastScroller) findViewById;
        findViewById = inflate.findViewById(R.id.statusbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.statusbar_inset)");
        this.i = findViewById;
        findViewById = inflate.findViewById(R.id.navbar_inset);
        akcr.a(findViewById, "view.findViewById(R.id.navbar_inset)");
        this.j = findViewById;
        findViewById = inflate.findViewById(R.id.dismiss_chat_creation_btn);
        akcr.a(findViewById, "view.findViewById(R.id.dismiss_chat_creation_btn)");
        this.k = (ImageButton) findViewById;
        ImageButton imageButton = this.k;
        String str = "dismissFragmentButton";
        if (imageButton == null) {
            akcr.a(str);
        }
        imageButton.setOnClickListener(new b(this));
        findViewById = inflate.findViewById(R.id.create_chat_recipients);
        akcr.a(findViewById, "view.findViewById(R.id.create_chat_recipients)");
        this.l = (CreateChatRecipientBarView) findViewById;
        findViewById = inflate.findViewById(R.id.create_chat_button);
        akcr.a(findViewById, "view.findViewById(R.id.create_chat_button)");
        this.m = findViewById;
        findViewById = inflate.findViewById(R.id.keyboard_placeholder);
        akcr.a(findViewById, "view.findViewById(R.id.keyboard_placeholder)");
        this.o = findViewById;
        defpackage.qqw.a aVar = this.d;
        if (aVar == null) {
            akcr.a("createChatComponent");
        }
        ImageButton imageButton2 = this.k;
        if (imageButton2 == null) {
            akcr.a(str);
        }
        aVar = aVar.a((View) imageButton2);
        RecyclerView recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a("_recyclerView");
        }
        aVar = aVar.a(recyclerView);
        CreateChatRecipientBarView createChatRecipientBarView = this.l;
        if (createChatRecipientBarView == null) {
            akcr.a("recipientBar");
        }
        aVar = aVar.a(createChatRecipientBarView);
        View view = this.m;
        if (view == null) {
            akcr.a("createChatButton");
        }
        this.n = aVar.b(view).a(this.e).a(this.f).a(ahbd.FRIENDS_FEED).a().a();
        Context context = getContext();
        zkq zkq = this.a;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        this.q = new zhh(context, zkq);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        ajei ajei = this.p;
        if (ajei == null) {
            akcr.a("disposeOnDestroyView");
        }
        ajei.dispose();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        akcr.b(view, "view");
        super.onViewCreated(view, bundle);
        defpackage.qqk.a aVar = this.n;
        if (aVar == null) {
            akcr.a("createChatPresenter");
        }
        ajej start = aVar.start();
        akcr.a((Object) start, "createChatPresenter.start()");
        ajei ajei = this.p;
        String str = "disposeOnDestroyView";
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        RecyclerView recyclerView = this.g;
        String str2 = "_recyclerView";
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        recyclerView.setItemAnimator(null);
        VerticalRecyclerViewFastScroller verticalRecyclerViewFastScroller = this.h;
        String str3 = "fastScroller";
        if (verticalRecyclerViewFastScroller == null) {
            akcr.a(str3);
        }
        RecyclerView recyclerView2 = this.g;
        if (recyclerView2 == null) {
            akcr.a(str2);
        }
        verticalRecyclerViewFastScroller.a(recyclerView2);
        recyclerView = this.g;
        if (recyclerView == null) {
            akcr.a(str2);
        }
        VerticalRecyclerViewFastScroller verticalRecyclerViewFastScroller2 = this.h;
        if (verticalRecyclerViewFastScroller2 == null) {
            akcr.a(str3);
        }
        recyclerView.addOnScrollListener(verticalRecyclerViewFastScroller2.a());
        zkq zkq = this.a;
        if (zkq == null) {
            akcr.a("insetsDetector");
        }
        start = zkq.a().f((ajfb) new c(this));
        akcr.a((Object) start, "insetsDetector.windowRec…s = statusbarLp\n        }");
        ajei = this.p;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
        zhh zhh = this.q;
        if (zhh == null) {
            akcr.a("keyboardDetector");
        }
        start = zhh.a().f((ajfb) new d(this));
        akcr.a((Object) start, "keyboardDetector.keyboar…t\n            }\n        }");
        ajei = this.p;
        if (ajei == null) {
            akcr.a(str);
        }
        ajvv.a(start, ajei);
    }
}
