package io.github.vftdan.customvk;

import android.view.View;

/**
 * Created by vftdan on 24.02.2017.
 */

public class TouchEvent {
    public TouchEvent(View view, int fingCount, int[] coords){


    }

    public int fCount;
    public View view;
    private int[] coords;

    public int[] getFinger(int i) {
        return new int[]{this.coords[i*2], this.coords[i*2+1]};
    }
}
