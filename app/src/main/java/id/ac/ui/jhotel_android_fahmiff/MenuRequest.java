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
    private static final String Regis_URL = "http://10.5.79.65/vacantrooms";
    private Map<String, String> params;

    public MenuRequest(Response.Listener<String> listener) {
        super(Method.GET, Regis_URL, listener, null);
        params = new HashMap<>();
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }

}
