package com.a.classical_threads_sol;

public class FileDownloaderTask implements Runnable {

	private String url;

	public FileDownloaderTask(String url) {
		this.url = url;
	}

	@Override
	public void run() {
		DownloadManager.download(url);
	}

}
