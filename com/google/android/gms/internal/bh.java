package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.C0338e;
import com.google.android.gms.common.internal.safeparcel.C0334a;
import com.google.android.gms.common.internal.safeparcel.C0335b;
import com.google.android.gms.common.internal.safeparcel.C0336c;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class bh implements Creator {
    static void m3272a(bx bxVar, Parcel parcel, int i) {
        int a = C0336c.m2517a(parcel);
        Set e = bxVar.m3367e();
        if (e.contains(Integer.valueOf(1))) {
            C0336c.m2522a(parcel, 1, bxVar.m3368f());
        }
        if (e.contains(Integer.valueOf(2))) {
            C0336c.m2527a(parcel, 2, bxVar.m3369g(), i, true);
        }
        if (e.contains(Integer.valueOf(3))) {
            C0336c.m2529a(parcel, 3, bxVar.m3370h(), true);
        }
        if (e.contains(Integer.valueOf(4))) {
            C0336c.m2527a(parcel, 4, bxVar.m3371i(), i, true);
        }
        if (e.contains(Integer.valueOf(5))) {
            C0336c.m2528a(parcel, 5, bxVar.m3372j(), true);
        }
        if (e.contains(Integer.valueOf(6))) {
            C0336c.m2528a(parcel, 6, bxVar.m3373k(), true);
        }
        if (e.contains(Integer.valueOf(7))) {
            C0336c.m2528a(parcel, 7, bxVar.m3374l(), true);
        }
        if (e.contains(Integer.valueOf(8))) {
            C0336c.m2538b(parcel, 8, bxVar.m3375m(), true);
        }
        if (e.contains(Integer.valueOf(9))) {
            C0336c.m2522a(parcel, 9, bxVar.m3376n());
        }
        if (e.contains(Integer.valueOf(10))) {
            C0336c.m2538b(parcel, 10, bxVar.m3377o(), true);
        }
        if (e.contains(Integer.valueOf(11))) {
            C0336c.m2527a(parcel, 11, bxVar.m3378p(), i, true);
        }
        if (e.contains(Integer.valueOf(12))) {
            C0336c.m2538b(parcel, 12, bxVar.m3379q(), true);
        }
        if (e.contains(Integer.valueOf(13))) {
            C0336c.m2528a(parcel, 13, bxVar.m3380r(), true);
        }
        if (e.contains(Integer.valueOf(14))) {
            C0336c.m2528a(parcel, 14, bxVar.m3381s(), true);
        }
        if (e.contains(Integer.valueOf(15))) {
            C0336c.m2527a(parcel, 15, bxVar.m3382t(), i, true);
        }
        if (e.contains(Integer.valueOf(17))) {
            C0336c.m2528a(parcel, 17, bxVar.m3384v(), true);
        }
        if (e.contains(Integer.valueOf(16))) {
            C0336c.m2528a(parcel, 16, bxVar.m3383u(), true);
        }
        if (e.contains(Integer.valueOf(19))) {
            C0336c.m2538b(parcel, 19, bxVar.m3386x(), true);
        }
        if (e.contains(Integer.valueOf(18))) {
            C0336c.m2528a(parcel, 18, bxVar.m3385w(), true);
        }
        if (e.contains(Integer.valueOf(21))) {
            C0336c.m2528a(parcel, 21, bxVar.m3388z(), true);
        }
        if (e.contains(Integer.valueOf(20))) {
            C0336c.m2528a(parcel, 20, bxVar.m3387y(), true);
        }
        if (e.contains(Integer.valueOf(23))) {
            C0336c.m2528a(parcel, 23, bxVar.m3336B(), true);
        }
        if (e.contains(Integer.valueOf(22))) {
            C0336c.m2528a(parcel, 22, bxVar.m3335A(), true);
        }
        if (e.contains(Integer.valueOf(25))) {
            C0336c.m2528a(parcel, 25, bxVar.m3338D(), true);
        }
        if (e.contains(Integer.valueOf(24))) {
            C0336c.m2528a(parcel, 24, bxVar.m3337C(), true);
        }
        if (e.contains(Integer.valueOf(27))) {
            C0336c.m2528a(parcel, 27, bxVar.m3340F(), true);
        }
        if (e.contains(Integer.valueOf(26))) {
            C0336c.m2528a(parcel, 26, bxVar.m3339E(), true);
        }
        if (e.contains(Integer.valueOf(29))) {
            C0336c.m2527a(parcel, 29, bxVar.m3342H(), i, true);
        }
        if (e.contains(Integer.valueOf(28))) {
            C0336c.m2528a(parcel, 28, bxVar.m3341G(), true);
        }
        if (e.contains(Integer.valueOf(31))) {
            C0336c.m2528a(parcel, 31, bxVar.m3344J(), true);
        }
        if (e.contains(Integer.valueOf(30))) {
            C0336c.m2528a(parcel, 30, bxVar.m3343I(), true);
        }
        if (e.contains(Integer.valueOf(34))) {
            C0336c.m2527a(parcel, 34, bxVar.m3347M(), i, true);
        }
        if (e.contains(Integer.valueOf(32))) {
            C0336c.m2528a(parcel, 32, bxVar.m3345K(), true);
        }
        if (e.contains(Integer.valueOf(33))) {
            C0336c.m2528a(parcel, 33, bxVar.m3346L(), true);
        }
        if (e.contains(Integer.valueOf(38))) {
            C0336c.m2520a(parcel, 38, bxVar.m3350P());
        }
        if (e.contains(Integer.valueOf(39))) {
            C0336c.m2528a(parcel, 39, bxVar.m3351Q(), true);
        }
        if (e.contains(Integer.valueOf(36))) {
            C0336c.m2520a(parcel, 36, bxVar.m3348N());
        }
        if (e.contains(Integer.valueOf(37))) {
            C0336c.m2527a(parcel, 37, bxVar.m3349O(), i, true);
        }
        if (e.contains(Integer.valueOf(42))) {
            C0336c.m2528a(parcel, 42, bxVar.m3354T(), true);
        }
        if (e.contains(Integer.valueOf(43))) {
            C0336c.m2528a(parcel, 43, bxVar.m3355U(), true);
        }
        if (e.contains(Integer.valueOf(40))) {
            C0336c.m2527a(parcel, 40, bxVar.m3352R(), i, true);
        }
        if (e.contains(Integer.valueOf(41))) {
            C0336c.m2538b(parcel, 41, bxVar.m3353S(), true);
        }
        if (e.contains(Integer.valueOf(46))) {
            C0336c.m2527a(parcel, 46, bxVar.m3358X(), i, true);
        }
        if (e.contains(Integer.valueOf(47))) {
            C0336c.m2528a(parcel, 47, bxVar.m3359Y(), true);
        }
        if (e.contains(Integer.valueOf(44))) {
            C0336c.m2528a(parcel, 44, bxVar.m3356V(), true);
        }
        if (e.contains(Integer.valueOf(45))) {
            C0336c.m2528a(parcel, 45, bxVar.m3357W(), true);
        }
        if (e.contains(Integer.valueOf(51))) {
            C0336c.m2528a(parcel, 51, bxVar.ac(), true);
        }
        if (e.contains(Integer.valueOf(50))) {
            C0336c.m2527a(parcel, 50, bxVar.ab(), i, true);
        }
        if (e.contains(Integer.valueOf(49))) {
            C0336c.m2528a(parcel, 49, bxVar.aa(), true);
        }
        if (e.contains(Integer.valueOf(48))) {
            C0336c.m2528a(parcel, 48, bxVar.m3360Z(), true);
        }
        if (e.contains(Integer.valueOf(55))) {
            C0336c.m2528a(parcel, 55, bxVar.ag(), true);
        }
        if (e.contains(Integer.valueOf(54))) {
            C0336c.m2528a(parcel, 54, bxVar.af(), true);
        }
        if (e.contains(Integer.valueOf(53))) {
            C0336c.m2528a(parcel, 53, bxVar.ae(), true);
        }
        if (e.contains(Integer.valueOf(52))) {
            C0336c.m2528a(parcel, 52, bxVar.ad(), true);
        }
        if (e.contains(Integer.valueOf(56))) {
            C0336c.m2528a(parcel, 56, bxVar.ah(), true);
        }
        C0336c.m2518a(parcel, a);
    }

    public bx m3273a(Parcel parcel) {
        int b = C0334a.m2489b(parcel);
        Set hashSet = new HashSet();
        int i = 0;
        bx bxVar = null;
        List list = null;
        bx bxVar2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list2 = null;
        int i2 = 0;
        List list3 = null;
        bx bxVar3 = null;
        List list4 = null;
        String str4 = null;
        String str5 = null;
        bx bxVar4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        List list5 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        String str17 = null;
        bx bxVar5 = null;
        String str18 = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        bx bxVar6 = null;
        double d = 0.0d;
        bx bxVar7 = null;
        double d2 = 0.0d;
        String str22 = null;
        bx bxVar8 = null;
        List list6 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        bx bxVar9 = null;
        String str27 = null;
        String str28 = null;
        String str29 = null;
        bx bxVar10 = null;
        String str30 = null;
        String str31 = null;
        String str32 = null;
        String str33 = null;
        String str34 = null;
        String str35 = null;
        while (parcel.dataPosition() < b) {
            int a = C0334a.m2484a(parcel);
            bx bxVar11;
            switch (C0334a.m2483a(a)) {
                case C0338e.MapAttrs_cameraBearing /*1*/:
                    i = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(1));
                    break;
                case C0338e.MapAttrs_cameraTargetLat /*2*/:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(2));
                    bxVar = bxVar11;
                    break;
                case C0338e.MapAttrs_cameraTargetLng /*3*/:
                    list = C0334a.m2514x(parcel, a);
                    hashSet.add(Integer.valueOf(3));
                    break;
                case C0338e.MapAttrs_cameraTilt /*4*/:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(4));
                    bxVar2 = bxVar11;
                    break;
                case C0338e.MapAttrs_cameraZoom /*5*/:
                    str = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(5));
                    break;
                case C0338e.MapAttrs_uiCompass /*6*/:
                    str2 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(6));
                    break;
                case C0338e.MapAttrs_uiRotateGestures /*7*/:
                    str3 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(7));
                    break;
                case C0338e.MapAttrs_uiScrollGestures /*8*/:
                    list2 = C0334a.m2492c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(8));
                    break;
                case C0338e.MapAttrs_uiTiltGestures /*9*/:
                    i2 = C0334a.m2496f(parcel, a);
                    hashSet.add(Integer.valueOf(9));
                    break;
                case C0338e.MapAttrs_uiZoomControls /*10*/:
                    list3 = C0334a.m2492c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(10));
                    break;
                case C0338e.MapAttrs_uiZoomGestures /*11*/:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(11));
                    bxVar3 = bxVar11;
                    break;
                case C0338e.MapAttrs_useViewLifecycle /*12*/:
                    list4 = C0334a.m2492c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(12));
                    break;
                case C0338e.MapAttrs_zOrderOnTop /*13*/:
                    str4 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(13));
                    break;
                case 14:
                    str5 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(14));
                    break;
                case 15:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(15));
                    bxVar4 = bxVar11;
                    break;
                case 16:
                    str6 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(16));
                    break;
                case 17:
                    str7 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(17));
                    break;
                case 18:
                    str8 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(18));
                    break;
                case 19:
                    list5 = C0334a.m2492c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(19));
                    break;
                case 20:
                    str9 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(20));
                    break;
                case 21:
                    str10 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(21));
                    break;
                case 22:
                    str11 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(22));
                    break;
                case 23:
                    str12 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(23));
                    break;
                case 24:
                    str13 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(24));
                    break;
                case 25:
                    str14 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(25));
                    break;
                case 26:
                    str15 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(26));
                    break;
                case 27:
                    str16 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(27));
                    break;
                case 28:
                    str17 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(28));
                    break;
                case 29:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(29));
                    bxVar5 = bxVar11;
                    break;
                case 30:
                    str18 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(30));
                    break;
                case 31:
                    str19 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(31));
                    break;
                case 32:
                    str20 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(32));
                    break;
                case 33:
                    str21 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(33));
                    break;
                case 34:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(34));
                    bxVar6 = bxVar11;
                    break;
                case 36:
                    d = C0334a.m2500j(parcel, a);
                    hashSet.add(Integer.valueOf(36));
                    break;
                case 37:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(37));
                    bxVar7 = bxVar11;
                    break;
                case 38:
                    d2 = C0334a.m2500j(parcel, a);
                    hashSet.add(Integer.valueOf(38));
                    break;
                case 39:
                    str22 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(39));
                    break;
                case 40:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(40));
                    bxVar8 = bxVar11;
                    break;
                case 41:
                    list6 = C0334a.m2492c(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(41));
                    break;
                case 42:
                    str23 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(42));
                    break;
                case 43:
                    str24 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(43));
                    break;
                case 44:
                    str25 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(44));
                    break;
                case 45:
                    str26 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(45));
                    break;
                case 46:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(46));
                    bxVar9 = bxVar11;
                    break;
                case 47:
                    str27 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(47));
                    break;
                case 48:
                    str28 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(48));
                    break;
                case 49:
                    str29 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(49));
                    break;
                case 50:
                    bxVar11 = (bx) C0334a.m2486a(parcel, a, bx.CREATOR);
                    hashSet.add(Integer.valueOf(50));
                    bxVar10 = bxVar11;
                    break;
                case 51:
                    str30 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(51));
                    break;
                case 52:
                    str31 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(52));
                    break;
                case 53:
                    str32 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(53));
                    break;
                case 54:
                    str33 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(54));
                    break;
                case 55:
                    str34 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(55));
                    break;
                case 56:
                    str35 = C0334a.m2502l(parcel, a);
                    hashSet.add(Integer.valueOf(56));
                    break;
                default:
                    C0334a.m2490b(parcel, a);
                    break;
            }
        }
        if (parcel.dataPosition() == b) {
            return new bx(hashSet, i, bxVar, list, bxVar2, str, str2, str3, list2, i2, list3, bxVar3, list4, str4, str5, bxVar4, str6, str7, str8, list5, str9, str10, str11, str12, str13, str14, str15, str16, str17, bxVar5, str18, str19, str20, str21, bxVar6, d, bxVar7, d2, str22, bxVar8, list6, str23, str24, str25, str26, bxVar9, str27, str28, str29, bxVar10, str30, str31, str32, str33, str34, str35);
        }
        throw new C0335b("Overread allowed size end=" + b, parcel);
    }

    public bx[] m3274a(int i) {
        return new bx[i];
    }

    public /* synthetic */ Object createFromParcel(Parcel parcel) {
        return m3273a(parcel);
    }

    public /* synthetic */ Object[] newArray(int i) {
        return m3274a(i);
    }
}
