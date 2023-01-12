package b_medium.B535;

import java.util.HashMap;
import java.util.Map;
import java.io.Serializable;

public class Codec {
    Map<String, String> mapURL = new HashMap<>();
    int index = 0;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl = "http://tinyurl.com/" + String.valueOf(index);
        index++;
        if (!mapURL.containsKey(shortUrl))
            mapURL.put(shortUrl, longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        if (mapURL.containsKey(shortUrl)) return mapURL.get(shortUrl);
        return "";
    }
}
/*
The problem lets us decide how to encode and decode.
Append a random number after the default TinuUrl format and store it in the HashMaps as a key.
 They value will be the LongURL.
Return the Key you just made. In decode, return the value corresponding to the parameter passed in the function.
 */