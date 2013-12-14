/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.appersonlabs.root;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;
import com.stericson.RootTools.*;

@Kroll.module(name="Rootfinder", id="com.appersonlabs.root")
public class RootfinderModule extends KrollModule
{

	// Standard Debugging variables
	private static final String TAG = "RootfinderModule";

	// Methods
	@Kroll.method
	public boolean isRooted()
	{
        if (RootTools.isRootAvailable()) {
            return true;

        }
        return false;
	}
    
    @Kroll.method
	public boolean requestAccess()
	{
        if (RootTools.isAccessGiven()) {
            return true;
        }
        
        return false;
	}

	// Properties
//	@Kroll.getProperty
//	public String getExampleProp()
//	{
//		Log.d(TAG, "get example property");
//		return "hello world";
//	}
//	
//	
//	@Kroll.setProperty
//	public void setExampleProp(String value) {
//		Log.d(TAG, "set example property: " + value);
//	}

}
