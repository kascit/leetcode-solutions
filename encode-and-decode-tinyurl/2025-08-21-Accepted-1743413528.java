/*
 * Submission: 1743413528
 * Problem: Encode and Decode TinyURL (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:18:42 UTC
 * Runtime: 1 ms
 * Memory: 43.2 MB
 */

public class Codec {

    Map<String,String> map;
    int i;
    Codec(){
        map = new HashMap<>();
        i = 0;
    }
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(new StringBuilder(i).toString(),longUrl);
        return new StringBuilder(i++).toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));