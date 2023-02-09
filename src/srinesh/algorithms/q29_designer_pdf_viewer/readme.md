# [Designer PDF Viewer](https://www.hackerrank.com/challenges/designer-pdf-viewer/problem)

## Java

```java
public static int designerPdfViewer(List<Integer> h, String word) {
    var height = word
        .chars()
        .map(c -> h.get(((int) c) - 97))
        .max();
    
    return height.getAsInt() * word.length();
}
```
