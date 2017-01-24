package com.epicgames.ue4;

import com.tgraupmann.unrealfps.OBBDownloaderService;
import com.tgraupmann.unrealfps.DownloaderActivity;


public class DownloadShim
{
	public static OBBDownloaderService DownloaderService;
	public static DownloaderActivity DownloadActivity;
	public static Class<DownloaderActivity> GetDownloaderType() { return DownloaderActivity.class; }
}

