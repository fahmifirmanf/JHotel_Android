package id.ac.ui.jhotel_android_fahmiff;


import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hamba Elektronika on 14/05/2018.
 */

public class PesananFetchRequest extends StringRequest {
    private static final String PesanFetch_URL = "http://192.168.43.79:8080/pesanancustomer/";
    private Map<String, String> params;

    public PesananFetchRequest(String id_customer, Response.Listener<String> listener) {
        super(Method.GET, PesanFetch_URL +id_customer, listener, null);
        params = new HashMap<>();
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
