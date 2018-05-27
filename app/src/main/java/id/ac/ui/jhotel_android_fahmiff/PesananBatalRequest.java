package id.ac.ui.jhotel_android_fahmiff;

import com.android.volley.toolbox.StringRequest;
import com.android.volley.Response;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Hamba Elektronika on 14/05/2018.
 */

public class PesananBatalRequest extends StringRequest {
    private static final String PesanBatal_URL = "http://192.168.43.79:8080/cancelpesanan";
    private Map<String, String> params;

    public PesananBatalRequest(String id_pesanan, Response.Listener<String> listener) {
        super(Method.POST, PesanBatal_URL, listener, null);
        params = new HashMap<>();
        params.put("id_pesanan",id_pesanan);
    }
    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


