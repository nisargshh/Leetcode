# 535. Encode and Decode TinyURL

# Question

## Question

TinyURL is a URL shortening service where you enter a URL such as `https://leetcode.com/problems/design-tinyurl` and it returns a short URL such as `http://tinyurl.com/4e9iAk`. Design the `encode` and `decode` methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.

## Link

[Encode and Decode TinyURL - LeetCode](https://leetcode.com/problems/encode-and-decode-tinyurl/)

# Solution

## Code

```java
public class Codec {
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

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
```
