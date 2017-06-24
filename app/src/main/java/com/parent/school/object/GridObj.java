package com.parent.school.object;

import java.io.Serializable;

/**
 * Created by Aarohi on 6/17/2017.
 */

public class GridObj implements Serializable{
    public int drawable;
    public String itemName;

    public GridObj(int drawable,String itemName){
        this.drawable = drawable;
        this.itemName = itemName;
    }
}
