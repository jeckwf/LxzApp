package com.mo.util;

import android.content.Context;
import android.widget.Toast;

/**
 * file explain
 *
 * @author chenwenfa
 * @version 1.0 2018-04-28
 * @since JDK 1.7
 */

public class ToastUtil {
	public static void show(Context context,String message){
		Toast.makeText(context,message,Toast.LENGTH_SHORT);
	}

}
