package RemoveControlFlag.SimpleDatabaseAfter1;

import RemoveControlFlag.SimpleDatabaseBefore.SimpleDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabse {
    private Map<String, String> _map = new HashMap<String, String>();

    public SimpleDatabse(Reader r) throws IOException {
        BufferedReader reader = new BufferedReader(r);
        while(true) {
            String line = reader.readLine();
            if(line == null) {
                break;
            }
            int equalIndex = line.indexOf("=");
            if(equalIndex > 0) {
                String key = line.substring(0, equalIndex);
                String value = line.substring(equalIndex + 1, line.length());
                _map.put(key, value);
            }
        }
    }
    public void putValues(String key, String value) {
        _map.put(key, value);
    }
    public String getValues(String key) {
        return _map.get(key);
    }
    public Iterator<String> iterator() {
        return _map.keySet().iterator();
    }

}
