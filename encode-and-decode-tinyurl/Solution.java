class Solution {
    HashMap<String, String> map = new HashMap<>();
    int i = 0;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        i++;
        map.put(String.valueOf(i), longUrl);
        return String.valueOf(i);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}