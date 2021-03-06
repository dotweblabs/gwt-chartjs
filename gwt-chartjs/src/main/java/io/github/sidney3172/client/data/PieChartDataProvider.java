package io.github.sidney3172.client.data;

import com.google.gwt.core.client.JsArray;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface PieChartDataProvider {
	
	public JsArray<Series> getData();
	
	public void reload(AsyncCallback<JsArray<Series>> callback);
}
