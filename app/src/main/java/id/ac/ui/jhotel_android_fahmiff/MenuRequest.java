package id.ac.ui.jhotel_android_fahmiff;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.Request;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hamba Elektronika on 03/05/2018.
 */

public class MenuRequest extends StringRequest {
    private static final String Menu_URL = "http://192.168.43.79:8080/vacantrooms";
    private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Request.Method.GET, Menu_URL, listener, null);
        params = new HashMap<>();
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
