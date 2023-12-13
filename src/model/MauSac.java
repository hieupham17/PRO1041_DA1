
package model;

/**
 *
 * @author admin
 */
public class MauSac {
    private int id ;
    private String ten ;

    public MauSac() {
    }

    public MauSac(String ten) {
        this.ten = ten;
    }

    public MauSac(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    @Override
    public String toString() {
        return ten;
    }
    
}
