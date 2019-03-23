package g30124.avram.alexandru.l5.e2;


import org.junit.*;


public class testClass {
    @Test
    public static void main(String[] args) {
        ProxyImage proxyImage = new ProxyImage("picture.jpg",false);
        ProxyImage proxyImage1 = new ProxyImage("picture2.jpg",true);
        proxyImage.display();
        System.out.println("///\\\\");
        proxyImage1.display();
    }
}
