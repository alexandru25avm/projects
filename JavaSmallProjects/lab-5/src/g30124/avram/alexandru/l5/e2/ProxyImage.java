package g30124.avram.alexandru.l5.e2;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;
    private boolean isRotated;
    private RotatedImage rotatedImage;

    public ProxyImage(String fileName, boolean isRotated) {
        this.fileName = fileName;
        this.isRotated = isRotated;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        if(rotatedImage==null)
            rotatedImage=new RotatedImage(fileName);
        if(isRotated==false)
            realImage.display();
        else
            rotatedImage.display();
    }
}