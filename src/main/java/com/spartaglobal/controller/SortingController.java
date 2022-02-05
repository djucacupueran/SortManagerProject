package com.spartaglobal.controller;

import com.spartaglobal.model.BubbleFactory;
import com.spartaglobal.model.MergeFactory;
import com.spartaglobal.model.Sort;
import com.spartaglobal.model.SortingFactory;

import java.util.Arrays;
import java.util.Locale;

public class SortingController {
    public String sortArray(String sortingMethod) {
        Sort s = getSorted(sortingMethod);
        int[] test = {3,69,35,2,45,320,5};

        return Arrays.toString(s.sort(test));
    }

    public static Sort getSorted(String sortingMethod) {
        SortingFactory sf = switch (sortingMethod.toLowerCase()){
            case "bubble" -> new BubbleFactory();
            case "merge" -> new MergeFactory();
            default -> null;
        };
        return sf.getInstance();
    }
}
