/*
 * Submission: 1743412253
 * Problem: Encode and Decode TinyURL (Medium)
 * Status: Accepted
 * Language: java
 * Timestamp: 2025-08-21 16:17:36 UTC
 * Runtime: 1 ms
 * Memory: 42.9 MB
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
        map.put(String.valueOf(i),longUrl);
        return String.valueOf(i++);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));