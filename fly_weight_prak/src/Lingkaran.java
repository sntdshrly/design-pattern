// Nama Program: Flyweight Pattern
// Nama/NRP: 2072025/Sherly Santiadi

public class Lingkaran implements BangunDatar{

    private String warna;
    private int x;
    private int y;
    private int radius;

    // constructor dipakai di BangunDatarFactory ketika bikin objek lingkaran, saya perlu warna
    public Lingkaran(String warna) {
        this.warna = warna;
    }

    // getter and setter
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void gambar() {
        System.out.println("Lingkaran: memanggil fungsi gambar()" +
                " Warna: " + warna + ", x:" + x + ", y:" + y + ", radius:" + radius);
    }
}
